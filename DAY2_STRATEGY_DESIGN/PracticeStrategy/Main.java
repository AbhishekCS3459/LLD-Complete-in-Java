package DAY2_STRATEGY_DESIGN.PracticeStrategy;

public class Main {
    public static void main(String[] args) {
        int num1=23;
        int num2=10;
        // Perfom the add operation
        PerformOperation obj = new PerformOperation(new OperationAdd());
        System.out.println("Addition: "+obj.executeOperation(num1, num2));
        // Perform the subtraction operation
        obj=new PerformOperation(new OperationSub());
        System.out.println("Subtraction: "+obj.executeOperation(num1, num2));
        
        // Perform the multiplication operation
        obj=new PerformOperation(new OperationMultiply());
        System.out.println("Multiplication: "+obj.executeOperation(num1, num2));

        // Perform the division operation
        obj=new PerformOperation(new OperationDiv());
        System.out.println("Division: "+obj.executeOperation(num1, num2));
    }
}
