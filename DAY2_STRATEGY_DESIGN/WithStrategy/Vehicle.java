package DAY2_STRATEGY_DESIGN.WithStrategy;

import DAY2_STRATEGY_DESIGN.WithStrategy.Strategy.DriveStrategy;

public class Vehicle{
    DriveStrategy driveObject;
    Vehicle(DriveStrategy driveObject){
        // this is know as the constructor injection
        this.driveObject = driveObject;
    }
    public void drive(){
        driveObject.drive();
    }
}