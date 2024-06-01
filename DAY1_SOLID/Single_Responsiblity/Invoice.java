package DAY1_SOLID.Single_Responsiblity;
// Responsiblity 1: Get GST
class GetGST{
    private final double GST_Rate=0.18;
    public double getGST(){
        System.out.println("Returning GST...");
        return GST_Rate;
    }
}

// Responsiblity 2: Calculate Price
class PriceCalculator{
    public double calculateInvoice(double Amount){

        GetGST gst=new GetGST();
        double Percent_GST=Amount*gst.getGST();
        return Percent_GST+Amount;
    }
}

// Responsiblity 3: Print Invoice
class InvoiceService{
    public void printInvoice(){
      PriceCalculator price=new PriceCalculator();
      double priceSum=  price.calculateInvoice(43.5);
      System.out.println("Invoice Sum: "+priceSum);
    }
}
public class Invoice {
    public static void main(String[] args) {
        InvoiceService invoiceService = new InvoiceService();
        invoiceService.printInvoice();
    }
}
