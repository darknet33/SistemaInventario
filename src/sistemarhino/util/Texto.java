package sistemarhino.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Texto {

    public static String capitalizeTexto(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }

        String[] palabras = texto.split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabras.length; i++) {
            resultado.append(capitalize(palabras[i]));
            if (i < palabras.length - 1) {
                resultado.append(" ");
            }
        }

        return resultado.toString();
    }

    public static String capitalize(String str) {
        return str.equals("") ? "" : str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isDecimal(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static LocalDate stringtoLocaDate(String fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(fecha, formato);
    }

}
