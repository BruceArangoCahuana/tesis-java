package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "detalleaduana")
public class DetalleAduana {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "DETAllEADUANA_ID_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_detalleaduana")
    private Integer id;

    //@JsonIgnoreProperties(value={"ticketPesaje", "hibernateLazyInitializer", "handler"}, allowSetters=true)
    //@JsonIgnoreProperties(value={"carretaticketPesajeList", "hibernateLazyInitializer", "handler"}, allowSetters=true)
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Laboratorio.class)
    @JoinColumn(name="id_laboratorio", referencedColumnName = "id_laboratorio")
    private Laboratorio laboratorio;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Producto.class)
    @JoinColumn(name="id_producto", referencedColumnName = "id_producto")
    private Producto producto;


    @JsonIgnoreProperties(value={"detalleaduana", "hibernateLazyInitializer", "handler"}, allowSetters=true)
    @OneToMany( cascade = CascadeType.ALL, targetEntity = Aduana.class, fetch = FetchType.LAZY)
    private List<Aduana> aduanaList;


    public DetalleAduana() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Aduana> getAduanaList() {
        return aduanaList;
    }

    public void setAduanaList(List<Aduana> aduanaList) {
        this.aduanaList = aduanaList;
    }

    @Override
    public String toString() {
        return "DetalleAduana{" +
                "id=" + id +
                ", laboratorio=" + laboratorio +
                ", producto=" + producto +
                ", aduanaList=" + aduanaList +
                '}';
    }
}
