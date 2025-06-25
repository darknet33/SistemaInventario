package sistemainventario.util;

import sistemainventario.mappers.ExcelMappable;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class ExcelUtil {

    public static <T> void exportToExcel(List<T> data, ExcelMappable<T> mapper, String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Datos");

        // Crear encabezados
        Row headerRow = sheet.createRow(0);
        String[] headers = mapper.getHeaders();
        for (int i = 0; i < headers.length; i++) {
            headerRow.createCell(i).setCellValue(headers[i]);
        }

        // Crear filas de datos
        int rowNum = 1;
        for (T item : data) {
            Row row = sheet.createRow(rowNum++);
            List<String> values = mapper.mapToRow(item);
            for (int i = 0; i < values.size(); i++) {
                row.createCell(i).setCellValue(values.get(i));
            }
        }

        try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
            workbook.write(fileOut);
        }
        workbook.close();
    }

    public static <T> List<T> importFromExcel(File file, ExcelMappable<T> mapper) throws IOException {
        List<T> list = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(file)) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            if (rowIterator.hasNext()) {
                rowIterator.next(); // saltar cabecera
            }
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                // Verificar si la fila está completamente vacía
                boolean filaVacia = true;
                for (Cell cell : row) {
                    if (cell.getCellType() != CellType.BLANK && !cell.toString().trim().isEmpty()) {
                        filaVacia = false;
                        break;
                    }
                }
                if (filaVacia) {
                    continue; // Saltar filas vacías
                }
                List<String> values = new ArrayList<>();
                for (Cell cell : row) {
                    cell.setCellType(CellType.STRING);
                    values.add(cell.getStringCellValue().trim());
                }

                T item = mapper.mapFromRow(values);
                list.add(item);
            }

            workbook.close();
        }
        return list;
    }
}
