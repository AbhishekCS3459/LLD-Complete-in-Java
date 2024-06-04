package DAY1_SOLID.Interface_Segmentation.RightWay;

class Main {
    public static void main(String[] args) {
        Waiter w1 = new Waiter();
        // now everything is perfect
        w1.takeOrder();
        Cook c1 = new Cook();
        c1.decideMenu();
        c1.cookFood();
        w1.serveCustomers();
    }
}