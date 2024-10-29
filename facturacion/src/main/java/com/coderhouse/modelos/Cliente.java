package com.coderhouse.modelos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "clientes")
public class Cliente {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long cliente_id;
	    
	    @Column(name = "codigo_cliente",unique = true, nullable = false)
	    private String cliente_codigo;

	    @Column(name = "nombre", nullable = false)
	    private String cliente_nombre;
	    
	    @Column(name = "dni", unique = true, nullable = false)
	    private String cliente_dni;
	    
	    @Column(name = "email")
	    private String cliente_email;
	    
	    @Column(name = "telefono")
	    private String cliente_telefono;

	    @Column(name = "direccion")
	    private String cliente_direccion;
	    
	    //Getters y Setters
	    
	    

		public Long getCliente_id() {
			return cliente_id;
		}

		public void setCliente_id(Long cliente_id) {
			this.cliente_id = cliente_id;
		}

		public String getCliente_codigo() {
			return cliente_codigo;
		}

		public void setCliente_codigo(String cliente_codigo) {
			this.cliente_codigo = cliente_codigo;
		}

		public String getCliente_nombre() {
			return cliente_nombre;
		}

		public void setCliente_nombre(String cliente_nombre) {
			this.cliente_nombre = cliente_nombre;
		}

		public String getCliente_dni() {
			return cliente_dni;
		}

		public void setCliente_dni(String cliente_dni) {
			this.cliente_dni = cliente_dni;
		}

		public String getCliente_email() {
			return cliente_email;
		}

		public void setCliente_email(String cliente_email) {
			this.cliente_email = cliente_email;
		}

		public String getCliente_telefono() {
			return cliente_telefono;
		}

		public void setCliente_telefono(String cliente_telefono) {
			this.cliente_telefono = cliente_telefono;
		}

		public String getCliente_direccion() {
			return cliente_direccion;
		}

		public void setCliente_direccion(String cliente_direccion) {
			this.cliente_direccion = cliente_direccion;
		}

		@Override
		public String toString() {
			return "Cliente [cliente_id=" + cliente_id + ", cliente_codigo=" + cliente_codigo + ", cliente_nombre="
					+ cliente_nombre + ", cliente_dni=" + cliente_dni + ", cliente_email=" + cliente_email
					+ ", cliente_telefono=" + cliente_telefono + ", cliente_direccion=" + cliente_direccion + "]";
		}
		
		
	  
	
}


