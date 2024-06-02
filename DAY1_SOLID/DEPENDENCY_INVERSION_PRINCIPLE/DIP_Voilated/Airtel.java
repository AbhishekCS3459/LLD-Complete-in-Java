package DAY1_SOLID.DEPENDENCY_INVERSION_PRINCIPLE.DIP_Voilated;

public class Airtel {
    public void makeCall(int stdCode, int number){
        System.out.println("Calling to "+stdCode+"-"+number);
    }
}
