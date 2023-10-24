/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica01.service1;

import com.practica01.domain.Arboli;
import java.util.List;

public interface ArboliService {
    
    // Se obtiene un listado de arbolis en un List
    public List<Arboli> getArbolis(boolean activos);
    
   // Se obtiene un Arboli, a partir del id de un arboli
    public Arboli getArboli(Arboli arboli);
    
    // Se inserta un nuevo arboli si el id del arboli esta vacÃ­o
    // Se actualiza un arboli si el id del arboli NO esta vacÃ­o
    public void save(Arboli arboli);
    
    // Se elimina el arboli que tiene el id pasado por parÃ¡metro
    public void delete(Arboli arboli);
}