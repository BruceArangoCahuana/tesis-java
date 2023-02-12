package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "aduana")
public class Aduana {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(generator = "ADUANA_ID_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_aduana",unique=true, nullable=false)
    private Integer id;

    @Column(name = "fecha_salida")
    private LocalDateTime fecha;



    @ManyToOne(fetch = FetchType.LAZY, targetEntity = DetalleAduana.class)
    @JoinColumn(name="id_detalleaduana", referencedColumnName = "id_detalleaduana")
    private DetalleAduana detalleAduana;

    public Aduana() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public DetalleAduana getDetalleAduana() {
        return detalleAduana;
    }

    public void setDetalleAduana(DetalleAduana detalleAduana) {
        this.detalleAduana = detalleAduana;
    }

    @Override
    public String toString() {
        return "Aduana{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", detalleAduana=" + detalleAduana +
                '}';
    }
}
