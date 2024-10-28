package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id")
	private int cliente_id;
	
	@Column(name = "DNI cliente")
	private String dni;
	
	@Column(name = "Nombre Cliente")
    private String nombre;
	
	@Column(name = "Email Cliente")
    private String email;
	
	@Column(name = "Telefono Cliente")
    private String telefono;
	
	
	// getters y setters

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [cliente_id=" + cliente_id + ", dni=" + dni + ", nombre=" + nombre + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}
	
	
	
	

	
	


	

}
