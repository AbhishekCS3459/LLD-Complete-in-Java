package DAY1_SOLID.Interface_Segmentation.WrongWay;

class Waiter implements Jobs {

    @Override
    public void WashDishes() {
        // not the job of a Waiter
    }

    @Override
    public void Serve_Customers() {
        System.out.println("Yea serving hte customer");

    }

    @Override
    public void cookFood() {
        // again not the Job of a waiter

    }
}