package com.tesji.apitrakstesji.model;

//Definir los campos de la tabla

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //La clase la convierte a una tabla
public class DatosApiTraks {

    //Definir los atributos
    @Id //Define como llave Primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // el id es autoincrementable
    private long id;
    private String trak;
    private String artista;
    private  String genero;

    public DatosApiTraks(String trak, String artista, String genero) {
        this.trak = trak;
        this.artista = artista;
        this.genero = genero;
    }
    public DatosApiTraks(){
        
    }

    //getters and setters..

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTrak() {
        return trak;
    }

    public void setTrak(String trak) {
        this.trak = trak;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
