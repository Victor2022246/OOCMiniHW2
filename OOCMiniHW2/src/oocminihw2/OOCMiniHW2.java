/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car myCar=new Car(30,"ford", "Sedan",5,4);
         System.out.println(myCar);
         
         
         Airplane plane = new Airplane(500,"747", 200,"Boeing",4);
         
         Airplane plane1 = new Airplane();
         
         System.out.println(plane1.type);
         System.out.println(plane1.numWings);
         System.out.println(plane.getClass());
         
         
         Boat Boat1= new Boat(50,10,"Caterpillar",4, "Scunna");
         
         System.out.println(Boat1.numSails);
         System.out.println(Boat1.make);
         
         
    }
    
}
