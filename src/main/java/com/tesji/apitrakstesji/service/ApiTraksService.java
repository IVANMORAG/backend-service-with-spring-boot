package com.tesji.apitrakstesji.service;

//Definir los metodos abstractos para implementarlos en los end-points (peticiones)

import com.tesji.apitrakstesji.model.DatosApiTraks;

import java.util.ArrayList;
import java.util.Optional;

public interface ApiTraksService {

    ArrayList<DatosApiTraks> mostrarTraks(); // Método para mostrar todas las canciones
    Optional<DatosApiTraks> buscarTrakPorId(long id);
    DatosApiTraks saveTrak(DatosApiTraks trak); // Registrar y actualizar una canción
    DatosApiTraks updateTrack(Long id, DatosApiTraks trackDetails); // Actualizar una canción
    boolean deleteTrak(long id); // Eliminar una canción por ID


}
