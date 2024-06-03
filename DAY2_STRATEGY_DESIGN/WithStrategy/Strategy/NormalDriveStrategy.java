package DAY2_STRATEGY_DESIGN.WithStrategy.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("Normal drive capablity");
    }
}