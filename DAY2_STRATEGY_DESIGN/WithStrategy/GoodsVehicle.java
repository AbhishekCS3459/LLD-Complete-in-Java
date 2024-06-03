package DAY2_STRATEGY_DESIGN.WithStrategy;

import DAY2_STRATEGY_DESIGN.WithStrategy.Strategy.FlyDriveStrategy;

class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        // hence we provide the FlyDriveStrategy dynamically to the goods Vehicle without changing the code
        super(new FlyDriveStrategy());
    }
}