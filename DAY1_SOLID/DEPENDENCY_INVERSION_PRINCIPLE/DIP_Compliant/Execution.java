package DAY1_SOLID.DEPENDENCY_INVERSION_PRINCIPLE.DIP_Compliant;

public class Execution {
    public static void main(String[] args) {
        int stdCode = 91;
        int number = 62033022;
        // we only change the network object to change the provider not to change it every where else
        Network network = new Airtel();
        network.makeCall(stdCode, number);
    }
}
