/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica3.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author jenia
 */
@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable{
  
    private static final long serialVersionUID=1L;
    
    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_arbol")
    
    private Long id_arbol;
    private String nombre_comun;
        private String tipo_madera;

        private String tipo_flor;

    private String rutaImagen;
    private boolean activo;

    public Arbol() {
    }

    public Arbol(String nombre_comun, boolean activo) {
        this.nombre_comun = nombre_comun;
        this.activo = activo;
    }
    
     
    
    
    
}
