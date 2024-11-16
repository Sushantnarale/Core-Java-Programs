package coreProgramsColletion;

import java.util.Vector;

/*
 * WAP to create POJO class  name Book with field id,name and author and
 *  create array of object of size 5 and find the author whose name ends with sh 
 */

class Book{
	private int id;
	private String name;
	private String author;
	
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(int id,String name,String author) {
		this.id=id;
		this.name=name;
		this.author=author;
	}
}
public class BookVectorApp {

	private static Book b1;
	private static Book b2;
	private static Book b4;
	private static Book b5;
	private static Book b3;

	public static void main(String[] args) {

		b1 = new Book(1,"AAA","aaa");
		b2 = new Book(2,"BBB","bbb");
		b3 = new Book(3,"ZZZ","zzz");
		b4 = new Book(4,"YYY","yyy");
		b5 = new Book(5,"XXX","xxx");
		Vector<Book> v=new Vector<Book>();
		v.add(b1);
		v.add(b2);
		v.add(b3);
		v.add(b4);
		v.add(b5);
		
		for(int i=0;i<v.size();i++) {
			Book b=v.get(i);
			if(b.getAuthor().endsWith("yy"))  {
				System.out.println(b.getAuthor());
			}
		}
	

	}

}
