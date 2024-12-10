package com.example.appventabackend.Repository;

import com.example.appventabackend.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
