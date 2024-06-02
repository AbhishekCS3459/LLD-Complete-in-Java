package DAY1_SOLID.DEPENDENCY_INVERSION_PRINCIPLE.DIP_Compliant;

public class Jio implements Network{
    @Override
    public void makeCall(int stdCode, int number){
        System.out.println("Calling to "+stdCode+"-"+number+" via Jio Network");
    }
}
