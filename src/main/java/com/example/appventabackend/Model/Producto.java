package com.example.appventabackend.Model;

import jakarta.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Relación ManyToOne con Categoria (es decir, la entidad Categoria, no solo su ID)
    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id", nullable = false)
    private Categoria categoria;  // Aquí referenciamos la entidad Categoria

    // Constructor sin parámetros
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(Long id, String name, Categoria categoria) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
