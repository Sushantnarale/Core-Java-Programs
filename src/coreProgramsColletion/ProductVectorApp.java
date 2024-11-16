/*
 * WAP to create POJO class name as Product with field id,name and price
 *  and create array of object 
 * and store 5 product in vector and
 *  find product list whose price is same
 */
package coreProgramsColletion;

import java.util.Vector;

class Product{
	private int id;
	private String name;
	
	public Product(int id,String name,int price) {
		this.id=id;
		this.name=name;
		this.price=price;
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
	private int price;
}
public class ProductVectorApp {

	public static void main(String[] args) {
		Vector<Product> v=new Vector<Product>();
		Product p1=new Product(1,"abc",100);
		Product p2=new Product(2,"pqr",10); 
		Product p3=new Product(3,"lmn",1003);
		Product p4=new Product(4,"xyz",10);
		Product p5=new Product(5,"opq",100);
		
		v.add(p1);
		v.add(p2);
		v.add(p3);
		v.add(p4);
		v.add(p5);
		
		for(int i=0;i<v.size();i++) {
			for(int j=i+1;j<v.size();j++) {
				Product pp=v.get(i);
				Product qq=v.get(j);
				if(pp.getPrice()==qq.getPrice()) {
					System.out.println(pp.getId()+" "+pp.getName()+" "+pp.getPrice());
					System.out.println(qq.getId()+" "+qq.getName()+" "+qq.getPrice());
					System.out.println("**********");
				}
			}
		}

	}

}
