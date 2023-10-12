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
public class Airplane extends Vehicle implements Flyable {
    IOUtils myKb= new IOUtils();
    private float altitude;
    public Airplane(float speed, String type, int numPassengers, String make, int numWings) {
        super(speed, type, numPassengers, make, numWings);
        this.altitude=0;
    }
    
    public Airplane(){
    this.altitude=50;
    this.numWings= 2;
    this.speed= 150;
    this.type= "Airbus";
    
    }

    @Override
    public void changeAltitude(float change) {
       this.altitude=600; 
    }

    @Override
    public float getAltitude() {
       return altitude;
    }

    @Override
    public void accelerate(float speed) {
         int speedNow= myKb.getUserInt("please type the speed of the car");
      if(speedNow<30){
      this.speed=60;
      }
    }

    @Override
    public void brake() {
        int speedNow= myKb.getUserInt("please type the speed of the car");
      if(speedNow>80){
      this.speed=60;
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

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
       return type;
    }
    
}
