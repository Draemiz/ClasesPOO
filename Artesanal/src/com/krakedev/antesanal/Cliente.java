package com.krakedev.antesanal;

public class Cliente {
	private int codigo;
    private String nombre;
    private String cedula;
    private double totalConsumido;

    
    public Cliente(int codigo, String nombre, String cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.totalConsumido=0;
        
    }

    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

	public double getTotalConsumido() {
		return totalConsumido;
	}

	public void setTotalConsumido(double totalConsumido) {
		this.totalConsumido = totalConsumido;
	}
    
    
}
