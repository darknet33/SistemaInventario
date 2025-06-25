/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemainventario.controller;

import java.util.List;
import sistemainventario.dto.UsuarioDTO;

public interface IImportableController<T> {
    void importar(List<T> datos, UsuarioDTO usuario);
}
