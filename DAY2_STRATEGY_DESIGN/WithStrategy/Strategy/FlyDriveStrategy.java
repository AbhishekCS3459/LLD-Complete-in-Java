package DAY2_STRATEGY_DESIGN.WithStrategy.Strategy;

public class FlyDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("Fly Drive capablity");
    }
}
