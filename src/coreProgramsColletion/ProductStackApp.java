package coreProgramsColletion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

/* 
 * WAP to create a stack and store product details in it using the pojo class
 *  concept with field id,name and price and prodExpDate and perform the following 
 *  operation on it.
 	Case 1: Add New Product 
            Case 2: View All Products 
            Case 3: View All Products using expiry date means show the product on top whose expiry date is near 
	Case 4: delete product using its expiry date means if your system is greater than expiry data then delete data

 */

class Product1 implements Comparable<Product1>{
	private int id;
	private String name;
	private int price;
	private LocalDate expdate;
	
	public Product1(int id, String name, int price, LocalDate expdate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.expdate = expdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getExpdate() {
		return expdate;
	}
	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}
	@Override
	public int compareTo(Product1 o) {
		// TODO Auto-generated method stub
		if(this.expdate.isAfter(o.getExpdate())) {
			return 1;
		}
		else if(this.expdate.isBefore(o.getExpdate())) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
}
public class ProductStackApp {

	public static void main(String[] args) {
		Stack<Product1> stack=new Stack<Product1>();
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.println("Case 1: Add New Product \r\n"
					+ "            Case 2: View All Products \r\n"
					+ "            Case 3: View All Products using expiry date means show the product on top whose expiry date is near \r\n"
					+ "	Case 4: delete product using its expiry date means if your system is greater than expiry data then delete data\r\n"
					+ "");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter id name price and expdate to add");
				int id=sc.nextInt();
				sc.nextLine();
				String name=sc.nextLine();
				int price=sc.nextInt();
				sc.nextLine();
				String expdate=sc.nextLine();
				DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate expiryDate = LocalDate.parse(expdate, f);
				sc.nextLine();

				stack.add(new Product1(id,name,price,expiryDate));
				System.out.println("data added successfully.");
				break;
			case 2:
				for(Object obj:stack) {
					Product1 p=(Product1)obj;
					System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice()+" "+p.getExpdate());
				}
				break;
			case 3:
				Collections.sort(stack);
				for(Object obj:stack) {
					Product1 p=(Product1)obj;
					System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice()+" "+p.getExpdate());
				}
		        
				break;
			case 4:
				 LocalDate currentDate = LocalDate.now();
                 Iterator<Product1> iterator = stack.iterator();
                 while (iterator.hasNext()) {
                     Product1 product = iterator.next();
                     if (product.getExpdate().isBefore(currentDate)) {
                         iterator.remove();
                         System.out.println("Deleted expire d product: " + product.getName());
                     }
                 }
				break;
				
			}
			
		}while(true);
		
		

	}

}
