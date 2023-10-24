/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author jenia
 */
@Data
@Entity
@Table(name="arboli")
public class Arboli implements Serializable{
  
    private static final long serialVersionUID=1L;
    
    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_arboli")
    
    private Long idArboli;
    private String nombrecomun;
        private String tipoflor;
        private String tipomadera;
    private String rutaImagen;
    private boolean activo;

    public Arboli() {
    }

    public Arboli(String nombrecomun, String tipoflor, String tipomadera, boolean activo) {
        this.nombrecomun = nombrecomun;
        this.tipoflor = tipoflor;
        this.tipomadera = tipomadera;
        this.activo = activo;
    }

    
   
    
     
    
    
    
}
