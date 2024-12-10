package com.example.appventabackend.Service;

import com.example.appventabackend.Model.Categoria;
import com.example.appventabackend.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoryRepository) {
        this.categoriaRepository = categoryRepository;
    }

    public List<Categoria> getAllCategories() {
        return categoriaRepository.findAll();
    }

    public Optional<Categoria> getCategoryById(Long id) {
        return categoriaRepository.findById(id);
    }

    public Categoria createCategory(Categoria category) {
        return categoriaRepository.save(category);
    }

    public Categoria updateCategory(Long id, Categoria categoryDetails) {
        Categoria category = categoriaRepository.findById(id).orElseThrow();
        category.setName(categoryDetails.getName());
        return categoriaRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoriaRepository.deleteById(id);
    }
}
