package com.coderhouse.modelos;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long producto_id;
    
    @Column (name = "codigo_producto", unique = true)
    private String cod_producto;

    @Column(name = "descripcion")
    private String descripcion_producto;
    
    @Column(name = "precio", nullable = false)
    private BigDecimal precio_producto;
    
    @Column(name = "stock")
    private Integer stock_producto;

    

    //Getters y Setters
    
    
	public Long getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(Long producto_id) {
		this.producto_id = producto_id;
	}

	public String getCod_producto() {
		return cod_producto;
	}

	public void setCod_producto(String cod_producto) {
		this.cod_producto = cod_producto;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public BigDecimal getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(BigDecimal precio_producto) {
		this.precio_producto = precio_producto;
	}

	public Integer getStock_producto() {
		return stock_producto;
	}

	public void setStock_producto(Integer stock_producto) {
		this.stock_producto = stock_producto;
	}

	@Override
	public String toString() {
		return "Producto [producto_id=" + producto_id + ", cod_producto=" + cod_producto + ", descripcion_producto="
				+ descripcion_producto + ", precio_producto=" + precio_producto + ", stock_producto=" + stock_producto
				+ "]";
	}
	
	
    
    
    

}
