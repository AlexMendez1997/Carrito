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
public class Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Molde carrito1= new Molde();
	
	 carrito1.Setcolor("Green");
     carrito1.Setmodelo("1974");
     carrito1.Setmarca("Chevrolet");
     carrito1.Setpuertas(4);
     
     //System.out.println("The color is: " + carrito1.color);
     //System.out.println("Model: " + carrito1.modelo);
     //System.out.println("Transmision: "+ carrito1.transmision);
     //System.out.println("Company: "+ carrito1.marca);
     //System.out.println("Doors: "+carrito1.puertas);
     //System.out.println("Ring: "+ carrito1.Rines);
     
     System.out.println(carrito1.getColor());
     System.out.println(carrito1.getMarca());
     System.out.println(carrito1.getModelo());
    
	 
     System.out.println("-------");
     
     Molde carrito2= new Molde("Standar","22´");
     System.out.println(carrito2.getRines());
     System.out.println(carrito2.getTransmision());
     
     System.out.println("-------");
     
     Molde carrito3= new Molde("Pick Up");
     System.out.println(carrito3.getType());
	 }

}

