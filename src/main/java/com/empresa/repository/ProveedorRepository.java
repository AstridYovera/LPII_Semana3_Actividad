package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
	
	public List<Proveedor> findByDniOrNombreIgnoreCase(String dni, String nombre);

}
