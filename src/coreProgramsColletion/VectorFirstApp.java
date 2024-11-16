package coreProgramsColletion;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorFirstApp {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<>();
		
		do {
			System.out.println("1:Add New Element");
			System.out.println("2:View All Elements");
			System.out.println("3:Search Element By Contains method");
			System.out.println("4:Search Element By Index Of methods");
			System.out.println("5:Search element by get method");
			System.out.println("6:Count element by using size");
			System.out.println("7:replace element using index");
			
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the choice");
				int choice=sc.nextInt();
				switch(choice) {
				
				case 1:
					System.out.println("Enter element u wnat to add");
					int value=sc.nextInt();
					boolean b=v.add(value);
					if(b) {
						System.out.println("Data Added in Vector");
					}
					else {
						System.out.println("There is some Problem...");
					
					}
					break;
				case 2:
					Iterator<Integer> i=v.iterator();
					while(i.hasNext()) {
						Object obj=i.next();
						System.out.println(obj);
					}
						break;
				case 3:
					System.out.println("Enter element for search");
					int value1=sc.nextInt();
					boolean b1=v.contains(value1);
					if(b1) {
						System.out.println("ELement found");
					}
					else {
						System.out.println("Element not found");
					}
					break;
				case 4:
					System.out.println("Enter element for search");
					int value11=sc.nextInt();
					int index=v.indexOf(value11);
					if(index!=-1) {
						System.out.println("Element id found at "+index+1);
					}
					else {
						System.out.print("Element is not found");
					}
					
					break;
				case 5:
					System.out.println("Enter element for search");
					int input=sc.nextInt();
					int check=v.indexOf(input);
					if(check!=-1) {
						System.out.println("Element id found at "+v.get(check));
					}
					else {
						System.out.println("Element is not found");
					}
					break;
						
				case 6:
					int len=v.size();
					System.out.println("length is "+len);
					break;
				case 7:
					System.out.println("Enter vlaue to replace");
					int a=sc.nextInt();
					System.out.println("Enter new element");
					int b11=sc.nextInt();
					int check111=v.indexOf(a);
					if(check111!=-1) {
						v.set(check111, b11);
					}
					else {
				    	System.out.println("Value not found for replacement");
					}
					break;
				default:
					System.out.println("Wrong choice");
					
					
					}
			}
			
		}while(true);
		
	}

}
/*
Example: we want to perform basic operation on vector for understanding the use of methods 
Case 1: Add New Element 
Case 2: View all elements 
Case 3: Search element by contains method 
Case 4: search element by indexOf() method 
Case 5: search element by get() method 
Case 6: remove data by using its index 
Case 7: count the element using size() 
Case 8: replace element using index.


*/