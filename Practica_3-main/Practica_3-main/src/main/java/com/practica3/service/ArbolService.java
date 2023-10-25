/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica3.service;

import com.practica3.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    // Se obtiene un listado de arboles en un List
    public List<Arbol> getArboles(boolean activos);
    
   // Se obtiene un Arbol, a partir del id de un arbol
    public Arbol getArbol(Arbol arbol);
    
    // Se inserta un nuevo arbol si el id del arbol esta vacÃ­o
    // Se actualiza un arbol si el id del arbol NO esta vacÃ­o
    public void save(Arbol arbol);
    
    // Se elimina el arbol que tiene el id pasado por parÃ¡metro
    public void delete(Arbol arbol);
}