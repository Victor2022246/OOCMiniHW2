/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author victor pc
 */
public class Boat extends Vehicle implements Sailable {
    private boolean Sails; 
    public Boat(float speed, int numPassengers, String make, int numSails, String type) {
        super(speed, numPassengers, make, numSails, type);
    }

    @Override
    public void hoistSail() {
         this.Sails= true;
    }

    @Override
    public void lowerSail() {
         this.Sails= false;
    }

    @Override
    public boolean isSailHoisted() {
        return Sails;
    }

    @Override
    public void landHo() {
        this.speed=0;
    }
    
}
