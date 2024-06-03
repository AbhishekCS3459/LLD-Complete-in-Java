package DAY2_STRATEGY_DESIGN.WithStrategy.Strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("Sports drive capablity");
    }
}