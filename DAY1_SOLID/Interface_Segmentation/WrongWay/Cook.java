package DAY1_SOLID.Interface_Segmentation.WrongWay;

public class Cook implements Jobs {
    @Override
    public void WashDishes() {
        // not the work of a cook
    }

    @Override
    public void Serve_Customers() {
        // not the work of a cook
    }

    @Override
    public void cookFood() {
        System.out.println("Cooking panner tikka");
    }
}
