package coreProgramsColletion;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * WAP to create LinkedList for store StateInfo with POJO class stateid,statename 
Add new state 
View states
Search state by name 
Delete state by name 



 */
class StateInfo{
	private int id;
	private String name;
	
	
	public StateInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
public class LinkedListStateApp {

	public static void main(String[] args) {
		LinkedList <StateInfo> list =new LinkedList<StateInfo>();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Add new state \r\n"
					+ "View states\r\n"
					+ "Search state by name \r\n"
					+ "Delete state by name \r\n"
					+ "");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Add data id name");
				int id=sc.nextInt();
				sc.nextLine();
				String name=sc.nextLine();
				list.add(new StateInfo(id,name));
				System.out.println("Added...");
				break;
			case 2:
				for(Object o:list) {
					StateInfo s=(StateInfo)o;
					System.out.println(s.getId()+" "+s.getName());
				}
				break;
			case 3:
				System.out.println("Enter id t serach");
				int check=sc.nextInt();
				
				for(Object os:list) {
					StateInfo sf=(StateInfo)os;
					if(sf.getId()==check) {
						System.out.println(sf.getId()+" "+sf.getName());
					}
				}
				
				break;
			case 4:
				System.out.println("Enter name to delet");
				sc.nextLine();
				String namecheck=sc.nextLine();
				for(Object os:list) {
					StateInfo sf=(StateInfo)os;
					if(sf.getName().equalsIgnoreCase(namecheck)) {
						list.remove(sf);
						System.out.println("Data deleted");
					}
				}
				
				break;
			}
		}while(true);
		
		
	}

}
