package CollectionComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class productSortApp {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		ArrayList<Product> al=new ArrayList<Product>();
		al.add(new Product(3,"aaa",100));
		al.add(new Product(1,"nnn",22));
		al.add(new Product(4,"www",99));
		al.add(new Product(2,"qqq",33));
		
		do {
			System.out.println("Enter the your choice\n1.Sort by ID\n2.Sort by Price\n3.Sort ny Name");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				ProductSortById pID=new ProductSortById();
				Collections.sort(al, pID);
				
				for(Object o:al) {
					Product p=(Product)o;
					System.out.println(p.getId()+" "+p.getName()+" "+p.getSalary());
				}
				
				
				break;
			case 2:
				ProductSortByPrice pPrice=new ProductSortByPrice();
				Collections.sort(al, pPrice);
				for(Object o:al) {
					Product p=(Product)o;
					System.out.println(p.getId()+" "+p.getName()+" "+p.getSalary());
				}
				break;
			case 3:
				ProductSortByName pName=new ProductSortByName();
				Collections.sort(al, pName);
				for(Object o:al) {
					Product p=(Product)o;
					System.out.println(p.getId()+" "+p.getName()+" "+p.getSalary());
				}
				break;
				
			default:
				System.out.println("Wrong choice....");
			}
		}while(true);
		

	}

}
