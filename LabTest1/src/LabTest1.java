import java.util.*;
public class LabTest1 {

	public static void main(String[] args) {
		
		System.out.println("QUESTION 1");
		
		int number[] = {1, 2, 3};
		int price[] = {30, 50, 150};
		int quantity[] = {1, 2, 3};
		 
		
		System.out.println("Enter the number of item: " + number[2]);
		System.out.println("Enter the price of first item: " + price[2]);
		System.out.println("Enter quantity of first item: " + quantity[1]);
		
		System.out.println("Enter price of second item: " + price[1]);
		System.out.println("Enter quantity of second item: " + quantity[2]);
		
		System.out.println("Enter price of third item: " + price[0]);
		System.out.println("Enter quantity of third item: " + quantity[0]);
		
		int total = (price[2]*quantity[1]) + (price[1]*quantity[2]) + (price[0]*quantity[0]);
		System.out.println("Total price: " + total);
		int discount = total * 20/100;
		System.out.println("Discount received: " + discount);
		 int paid = total - discount;
		System.out.println("Price to be paid: "+ paid);
			 
		 
		
		
		System.out.println("QUESTION 2");
		
		Scanner in = new Scanner (System.in);
		int sales, commission, hours, wages;
		System.out.println("Enter sales: ");
		sales = in.nextInt();
		
		System.out.println("Enter hours worked: ");
		hours = in.nextInt();
		
		System.out.println("Commission: ");
		commission = in.nextInt();
		commission = hours*10;
		
		System.out.println("Daily wages: ");
		wages = in.nextInt();
		
		if (sales>= 150 && sales <= 300) {
		commission = sales*5/100;	
			
		}else if (sales>= 301 && sales <= 500) {
			commission = sales*10/100;
		}else if (sales > 500) {
			commission = sales*15/100;
		}
		System.out.println("Enter sales: " + sales);
		System.out.println("Enter hours worked: " + hours);
		System.out.println("Commission: " + commission);
		System.out.println("Daily wages: " + wages);
		
		

	}

}
