package com.coderhouse.modelos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "ventas")
public class Venta {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long venta_id;
    
    @Column (name = "venta_codigo_producto", unique = true)
    private String venta_cod_producto;

    @Column(name = "total", nullable = false)
    private BigDecimal total_venta;
    
    
    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    
    
    @Column(name = "direccion_entrega")
    private String venta_direccion;
    
    @Column(name = "fecha_venta")
    private LocalDateTime fecha_venta = LocalDateTime.now();
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "venta_productos", 
        joinColumns = @JoinColumn(name = "venta_cod_producto"),
        inverseJoinColumns = @JoinColumn(name = "cod_producto")
        )
    
    private List<Producto> productos = new ArrayList<>();
    
    
    //Getters y Setters

	public Long getVenta_id() {
		return venta_id;
	}

	public void setVenta_id(Long venta_id) {
		this.venta_id = venta_id;
	}

	public String getVenta_cod_producto() {
		return venta_cod_producto;
	}

	public void setVenta_cod_producto(String venta_cod_producto) {
		this.venta_cod_producto = venta_cod_producto;
	}

	public BigDecimal getTotal_venta() {
		return total_venta;
	}

	public void setTotal_venta(BigDecimal total_venta) {
		this.total_venta = total_venta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getVenta_direccion() {
		return venta_direccion;
	}

	public void setVenta_direccion(String venta_direccion) {
		this.venta_direccion = venta_direccion;
	}

	public LocalDateTime getFecha_venta() {
		return fecha_venta;
	}

	public void setFecha_venta(LocalDateTime fecha_venta) {
		this.fecha_venta = fecha_venta;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Venta [venta_id=" + venta_id + ", venta_cod_producto=" + venta_cod_producto + ", total_venta="
				+ total_venta + ", cliente=" + cliente + ", venta_direccion=" + venta_direccion + ", fecha_venta="
				+ fecha_venta + ", productos=" + productos + "]";
	}
	
	
    
  
    
    
  
	


}
