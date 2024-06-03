package DAY2_STRATEGY_DESIGN.WithStrategy;

import DAY2_STRATEGY_DESIGN.WithStrategy.Strategy.SportsDriveStrategy;
public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        // hence we provide the SportsDriveStrategy to the Vehicle dynamically without changing the code
        super(new SportsDriveStrategy());
    }
}