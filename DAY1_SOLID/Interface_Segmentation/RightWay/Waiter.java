package DAY1_SOLID.Interface_Segmentation.RightWay;

class Waiter implements  WaiterInterface{

    @Override
    public void serveCustomers() {
        System.out.println("Yes this is my job and I am serving....");
    }

    @Override
    public void takeOrder() {
        System.out.println("Yes this is my job and I am taking order....");
    }
}