/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

/**
 *
 * @author Alex
 */
public class Molde {

	public String color;
	public String modelo;
	public String transmision;
	public String marca;
	public String Rines;
	public int puertas;
	public String Type;

	
	public Molde() {
	
		marca="no specificed";
		color= "Without color";
		transmision= "Standard";
		modelo = "no specified Year";
		Rines = " 22´ ";
		puertas = 2 ;	
		Type= "no specificed";
	}
	
	//Sobre carga del metodo - overload
	
	public Molde(String transmision,String Rines) {

	    this.transmision= transmision;
	    this.Rines= Rines;
	}
	
	public Molde(String Type) {
		this.Type= Type;
	}
	
	public void Setcolor(String Valor) {
		color= Valor;
	}
	
	public void Setmodelo(String Valor) {
		modelo= Valor;
	}
	
	
	public void Setmarca(String Valor) {
		marca= Valor;
	}
	
	public void Setpuertas(int Valor) {
		puertas= Valor;
	}
	public void SetType(String Valor) {
		Type= Valor;
	}
	
	public String getColor() {
		return color;	
	}
	
	public String getMarca() {
		return marca;	
	}
	public String getTransmision() {
		return transmision;	
	}
	public String getModelo() {
		return modelo;	
	}
	public String getRines() {
		return Rines;	
	}
	public String getType() {
		return Type;
	}
}

