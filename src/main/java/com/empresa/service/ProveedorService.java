package com.empresa.service;

import java.util.List;

import com.empresa.entity.Proveedor;

public interface ProveedorService {
	public abstract Proveedor insertaProveedor(Proveedor obj);
	public abstract List<Proveedor> listaPorDniOrNombre(String dni, String nombre);
}
