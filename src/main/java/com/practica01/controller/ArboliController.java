/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.controller;


import com.practica01.domain.Arboli;
import com.practica01.service.impl.FirebaseStorageServiceImpl;
import com.practica01.service1.ArboliService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@Slf4j
@RequestMapping("/arboli")
public class ArboliController {
    
    @Autowired
    private ArboliService arboliService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        try{
        var arbolis = arboliService.getArbolis(false);
        model.addAttribute("arbolis", arbolis);
        model.addAttribute("totalArbolis", arbolis.size());
        return "/arboli/listado";} 
        catch (Exception e) {
        e.printStackTrace();
        return "error";
    }
    }
    
    @GetMapping("/nuevo")
    public String arboliNuevo(Arboli arboli) {
        return "/arboli/modifica";
    }
 @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String arboliGuardar(Arboli arboli,
            @RequestParam("imagenFile") MultipartFile imagenFile) { 
        try{
        if (!imagenFile.isEmpty()) {
            arboliService.save(arboli);
            arboli.setRutaImagen(
                    firebaseStorageService.cargaImagen(
                            imagenFile, 
                            "arboli", 
                            arboli.getIdArboli()));
        }
        arboliService.save(arboli);
        return "redirect:/arboli/listado";
        } catch (Exception e) {
        e.printStackTrace();
        return "error";
    }
    }

    @GetMapping("/eliminar/{idArboli}")
    public String arboliEliminar(Arboli arboli) {
        arboliService.delete(arboli);
        return "redirect:/arboli/listado";
    }

 @GetMapping("/modificar/{idArboli}")
public String arboliModificar(Arboli arboli, Model model) {
    try {
        arboli = arboliService.getArboli(arboli);
        model.addAttribute("arboli", arboli);
        return "/arboli/modifica";
    } catch (Exception e) {
        e.printStackTrace();
        return "error";
    }
}

}




