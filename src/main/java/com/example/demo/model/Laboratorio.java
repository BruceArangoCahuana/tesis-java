package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "laboratorio")
public class Laboratorio {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "LABORATORIO_ID_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_laboratorio")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;


    @JsonIgnoreProperties(value={"laboratorio", "hibernateLazyInitializer", "handler"}, allowSetters=true)
    @OneToMany( cascade = CascadeType.ALL, mappedBy = "laboratorio", targetEntity = DetalleAduana.class, fetch = FetchType.LAZY)
    private List<DetalleAduana> detalleAduanaList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<DetalleAduana> getDetalleAduanaList() {
        return detalleAduanaList;
    }

    public void setDetalleAduanaList(List<DetalleAduana> detalleAduanaList) {
        this.detalleAduanaList = detalleAduanaList;
    }


    @Override
    public String toString() {
        return "Laboratorio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", detalleAduanaList=" + detalleAduanaList +
                '}';
    }
}
