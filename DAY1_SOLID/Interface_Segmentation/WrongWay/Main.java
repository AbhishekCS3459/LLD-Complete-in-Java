
package DAY1_SOLID.Interface_Segmentation.WrongWay;

public class Main {
    public static void main(String[] args) {
        Waiter w1 = new Waiter();
        //  a job of a waiter
        w1.Serve_Customers();
        // this is also not a job of a waiter but it still needs to implement that method
        w1.cookFood();

        w1.WashDishes();

        // for Cook
        Cook c1 = new Cook();
        // this is the job of the cook
        c1.cookFood();
        // rest are not
        c1.Serve_Customers();
        c1.WashDishes();

    }
}
