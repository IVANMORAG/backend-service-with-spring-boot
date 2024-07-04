package com.tesji.apitrakstesji.service;

import com.tesji.apitrakstesji.model.DatosApiTraks;
import com.tesji.apitrakstesji.repository.CrudApiTraksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

//Exponer como n servicio en nuestra API REST
@Service
public class ApiTraksServiceImplement implements ApiTraksService{

    //Inyecta un objeto de la clase CrudApiTrakRepository para las operaciones CRUD
    @Autowired
    CrudApiTraksRepository crudApiTraksRepository;

    @Override
    public ArrayList<DatosApiTraks> mostrarTraks() {
        return (ArrayList<DatosApiTraks>) crudApiTraksRepository.findAll();
    }

    @Override
    public Optional<DatosApiTraks> buscarTrakPorId(long id) {
        return crudApiTraksRepository.findById(id);
    }

    @Override
    public DatosApiTraks saveTrak(DatosApiTraks trak) {
        return crudApiTraksRepository.save(trak);
    }

    @Override
    public DatosApiTraks updateTrack(Long id, DatosApiTraks trackDetails) {
        Optional<DatosApiTraks> optionalTrack = crudApiTraksRepository.findById(id);
        if (optionalTrack.isPresent()) {
            DatosApiTraks existingTrack = optionalTrack.get();
            existingTrack.setTrak(trackDetails.getTrak());
            existingTrack.setArtista(trackDetails.getArtista());
            existingTrack.setGenero(trackDetails.getGenero());
            return crudApiTraksRepository.save(existingTrack);
        } else {
            // Manejo de objeto no encontrado, puedes lanzar una excepción o retornar null según tu preferencia
            return null;
        }
    }

    @Override
    public boolean deleteTrak(long id) {
        Optional<DatosApiTraks> optionalTrack = crudApiTraksRepository.findById(id);
        if (optionalTrack.isPresent()) {
            crudApiTraksRepository.delete(optionalTrack.get());
            return true;
        } else {
            return false;
        }
    }

}
