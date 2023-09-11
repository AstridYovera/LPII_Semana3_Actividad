package com.empresa.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "proveedor")
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProveedor;
	private String nombre;
	private String dni;
	
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // Incluye la hora en el patrón
    private Date fechaRegistro;
	
	@ManyToOne
	@JoinColumn(name = "idTipo")
	private Tipo tipo;
	
	@ManyToOne
	@JoinColumn(name = "idPais")
	private Pais pais;
	
	// Establece la fecha actual al crear un nuevo proveedor
	@PrePersist
    public void setFechaRegistro() {
        this.fechaRegistro = new Date(); 
    }
}
