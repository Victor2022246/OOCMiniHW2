/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public abstract class Vehicle {
    private float speed;
    private float direction = 0;
    private String make;
    private String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    private int numPassengers;

    public Vehicle(float speed, String make, String type, int numPassengers, int numWheels) {
        this.speed = speed;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        this.numWheels = numWheels;
        System.out.println("this vehicle is drivable");
    }

    public Vehicle(float speed,  String type, int numPassengers,String make, int numWings) {
        this.speed = speed;
        this.make = make;
        this.numPassengers = numPassengers; 
        this.type = type;
        this.numWings= numWings;
        System.out.println("this constructor is for a vehicle that  is flyable");
    }
    
    public Vehicle(float speed, int numPassengers, String make, int numSails, String type){
        this.speed=speed;
        this.make=make;
        this.numPassengers=numPassengers;
        this.numSails=numSails;
        this.type=type;
        System.out.println("this vehicle is sailable");
    }
    
    
    
    
    
    
    
    
}

