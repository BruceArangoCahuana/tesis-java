package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "PRODUCTO_ID_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_producto")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "marca")
    private String marca;

    @Column(name = "descrp")
    private String descrp;

    @Column(name = "presentacion")
    private String presentacion;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "precio_fob")
    private Integer precio_fob;

    @Column(name = "cif_total")
    private Integer cif_total;

    @Column(name = "cif_unidad")
    private Integer cif_unidad;


    @Column(name = "exportador")
    private Integer exportador;


    @JsonIgnoreProperties(value={"producto", "hibernateLazyInitializer", "handler"}, allowSetters=true)
    @OneToMany( cascade = CascadeType.ALL, mappedBy = "producto", targetEntity = DetalleAduana.class, fetch = FetchType.LAZY)
    private List<DetalleAduana> detalleAduanaList;

    public Producto() {
    }

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescrp() {
        return descrp;
    }

    public void setDescrp(String descrp) {
        this.descrp = descrp;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio_fob() {
        return precio_fob;
    }

    public void setPrecio_fob(Integer precio_fob) {
        this.precio_fob = precio_fob;
    }

    public Integer getCif_total() {
        return cif_total;
    }

    public void setCif_total(Integer cif_total) {
        this.cif_total = cif_total;
    }

    public Integer getCif_unidad() {
        return cif_unidad;
    }

    public void setCif_unidad(Integer cif_unidad) {
        this.cif_unidad = cif_unidad;
    }

    public Integer getExportador() {
        return exportador;
    }

    public void setExportador(Integer exportador) {
        this.exportador = exportador;
    }

    public List<DetalleAduana> getDetalleAduanaList() {
        return detalleAduanaList;
    }

    public void setDetalleAduanaList(List<DetalleAduana> detalleAduanaList) {
        this.detalleAduanaList = detalleAduanaList;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", descrp='" + descrp + '\'' +
                ", presentacion='" + presentacion + '\'' +
                ", cantidad=" + cantidad +
                ", precio_fob=" + precio_fob +
                ", cif_total=" + cif_total +
                ", cif_unidad=" + cif_unidad +
                ", exportador=" + exportador +
                ", detalleAduanaList=" + detalleAduanaList +
                '}';
    }
}
