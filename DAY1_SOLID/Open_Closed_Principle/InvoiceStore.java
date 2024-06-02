package DAY1_SOLID.Open_Closed_Principle;

// Open/Close Principle 

// this is wrong way
// class InvoiceDao{
//     public void saveInvoiceDB(){
//         System.out.println("Saving Invoice...");
//     }
//     public void saveInvoiceFile(){
//         System.out.println("Saving Invoice...");
//     }
// }

  class Invoice{
    public Integer invoiceNumber;
    public String customerName;
    public double amount;
}
// Correct Way: Open for Extension and Closed for Modification
interface InvoiceDAO{
    public void saveInvoice(Invoice invoice);
}

class Database_Invoice_DAO implements InvoiceDAO{
    @Override
    public void saveInvoice(Invoice invoice){
        System.out.println("Saving Invoice to Database..."+invoice);
    }
}
class FileInvoiceDAO implements InvoiceDAO{
    @Override
    public void saveInvoice(Invoice invoice){
        System.out.println("Saving Invoice to File..."+invoice);
    }
}
public class InvoiceStore {
    public static void main(String[] args) {
        Invoice invoice=new Invoice();
        invoice.invoiceNumber=1;
        invoice.customerName="John";
        invoice.amount=1000;
        // saving to db
        Database_Invoice_DAO invoiceDAO=new Database_Invoice_DAO();
        invoiceDAO.saveInvoice(invoice);
        // saving to file
        FileInvoiceDAO fileInvoiceDAO=new FileInvoiceDAO();
        fileInvoiceDAO.saveInvoice(invoice);
    }
    
}
