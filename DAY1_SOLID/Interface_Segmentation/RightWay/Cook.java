package DAY1_SOLID.Interface_Segmentation.RightWay;

public class Cook implements ChiefInterface{
    @Override
    public void cookFood() {
        System.out.println("Yes this is my job and I am cooking food....");
    }

    @Override
    public void decideMenu() {
        System.out.println("Yes this is my job and I am deciding menu....");
    }
}
