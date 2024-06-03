package DAY2_STRATEGY_DESIGN.WithStrategy;


public class Main {
    
public static void main(String[] args) {
   Vehicle vehicle=new SportsVehicle(); // whenever we make a spots vehicle it will implements sports vehicle 
    vehicle.drive();
    vehicle=new OffRoadVehicle(); // whenever we make a offroad vehicle it will implements offroad vehicle which has same functionlity like spots
    vehicle.drive();
    vehicle=new GoodsVehicle(); // whenever we make a goods vehicle it will implements goods vehicle which has same functionlity like spots
    vehicle.drive();
}
}