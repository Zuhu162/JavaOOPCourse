// Quiz2.java
public class Quiz2 {
    public static void main(String[] args) {
        System.out.println("Quiz2");
        
        // Declare array of Sale object to store monthly sale information
        Sale[] mSales = new Sale[3];
        
        // Assign monthly sale information to array item of Sale object
        mSales[0] = new Sale("JAN", 1345);
        mSales[1] = new Sale("FEB", 9124);
        mSales[2] = new Sale("MAC", 11809);
        
        // Display monthly sales
        for (Sale ms : mSales) {
            System.out.println(ms.month + " - " + ms.amount);
        }
        
        // Find and display the highest monthly sale
        Sale hms = highestSale(mSales);
        System.out.println("Highest monthly sale is " + hms.amount +
                           " - " + hms.month);
    }
    
    // Method to find and return highest Sale object
    public static Sale highestSale(Sale[] saleList) {
        Sale hSale = saleList[0];
        for (Sale sale : saleList) {
            if (sale.amount > hSale.amount) {
                hSale = sale;
            }
        }
        return hSale;
    }
}
