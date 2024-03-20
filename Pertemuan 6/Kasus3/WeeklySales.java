// ************************************************************* 
// WeeklySales.java 
// 
// Sorts the sales staff in descending order by sales. 
// ************************************************************ 
import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scan.nextInt();
        
        Salesperson[] salesStaff = new Salesperson[numSalespeople];
        
        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("\nEnter details for salesperson " + (i + 1));
            System.out.print("First name: ");
            String firstName = scan.next();
            System.out.print("Last name: ");
            String lastName = scan.next();
            System.out.print("Total sales: ");
            int totalSales = scan.nextInt();
            
            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }
        
        Sorting.insertionSort(salesStaff);
        
        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println(s);
        
        scan.close();
    }
}