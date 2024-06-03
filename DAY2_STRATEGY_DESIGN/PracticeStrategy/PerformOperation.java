package DAY2_STRATEGY_DESIGN.PracticeStrategy;

public class PerformOperation {

    private Strategy operator;

    PerformOperation(Strategy operator){
        this.operator = operator;
    }

    public int executeOperation(int num1, int num2){
        return operator.doOperation(num1, num2);
    }
}
