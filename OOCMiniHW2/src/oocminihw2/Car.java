/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

import ioutils.IOUtils;

/**
 *
 * @author victor pc
 */
public class Car extends Vehicle implements Drivable {

    public Car(float speed, String make, String type, int numPassengers, int numWheels) {
        super(speed, make, type, numPassengers, numWheels);
    }
    
    IOUtils myKb = new IOUtils();
    
    
    
    

    @Override
    public void accelerate(float speed) {
      int speedNow= myKb.getUserInt("please type the speed of the car");
      if(speedNow<30){
      
      }
    }

    @Override
    public void brake() {
       int speedNow= myKb.getUserInt("please type the speed of the car");
      if(speedNow>65){
      
      }
    }

    @Override
    public void turn(float angle) {
       String turnDir= myKb.getUserText("Please say the direction left or right");
       switch (turnDir){
           case "left":
               this.direction=2;
            break;
           
           case "right":
               this.direction=1;
            break;
       }
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }
   // IM obligated to have all of the methods of drivable but have my make propertie private, having a conflit so i changed for protected
    @Override
    public String getMake() {
      return make;  
    }

    @Override
    public String getType() {
       
        return type;
    }
}
