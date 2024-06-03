package DAY2_STRATEGY_DESIGN.PracticeStrategy;
class OperationSub implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}