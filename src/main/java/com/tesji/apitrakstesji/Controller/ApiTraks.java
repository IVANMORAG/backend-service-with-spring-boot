package com.tesji.apitrakstesji.Controller;

// Clase que define el acceso a la API mediante URL
// y también los endpoints (peticiones HTTP)

import com.tesji.apitrakstesji.model.DatosApiTraks;
import com.tesji.apitrakstesji.service.ApiTraksService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-traks")
@CrossOrigin(origins = "http://localhost:3000") // Habilitar CORS para tu aplicación React
public class ApiTraks {

    // Inyectar el servicio con las operaciones CRUD
    @Autowired
    ApiTraksService apiTraksService;

    @GetMapping("/get-prueba")
    public String pruebaGets() {
        return "Jalo";
    }

    @GetMapping("/get-all")
    public List<DatosApiTraks> mostrarTodoTraks() {
        return apiTraksService.mostrarTraks();
    }

    @PostMapping("/add")
    public DatosApiTraks addTrack(@RequestBody DatosApiTraks track) {
        return apiTraksService.saveTrak(track);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<DatosApiTraks> getTrackById(@PathVariable Long id) {
        try {
            Optional<DatosApiTraks> track = apiTraksService.buscarTrakPorId(id);
            return track.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        } catch (Exception e) {
            // Log the exception
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<DatosApiTraks> updateTrack(@PathVariable Long id, @RequestBody DatosApiTraks trackDetails) {
        DatosApiTraks updatedTrack = apiTraksService.updateTrack(id, trackDetails);
        if (updatedTrack != null) {
            return ResponseEntity.ok(updatedTrack);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public HttpStatus deleteTrack(@PathVariable Long id) {
        boolean deleted = apiTraksService.deleteTrak(id);
        return deleted ? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND;
    }
}
