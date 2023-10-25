package com.practica01.service1;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {//agregar firebase

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "prueba-94a76.appspot.com";

    //Esta es la ruta básica de este proyecto prueba
    final String rutaSuperiorStorage = "prueba";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "prueba-94a76-firebase-adminsdk-lk38h-4b5626713a.json";
}
