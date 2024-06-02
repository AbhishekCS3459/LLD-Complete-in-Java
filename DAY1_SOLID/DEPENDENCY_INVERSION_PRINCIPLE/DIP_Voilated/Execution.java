package DAY1_SOLID.DEPENDENCY_INVERSION_PRINCIPLE.DIP_Voilated;

public class Execution {
    public static void main(String[] args) {
        int stdCode = 91;
        int number = 62033022;
        Jio jio = new Jio();
        jio.makeCall(stdCode, number);

        // for airtel we need to change the code form every where 
        Airtel airtel = new Airtel();
        airtel.makeCall(stdCode, number);
    }
}
