/*
 * WAP to create POJO class name as Player with id,name and run and 
 * create array of object of Player POJO class with size 5 and 
 * store all player pojo in Vector object and arrange
 *  all player records by run in descending order

 */
package coreProgramsColletion;

import java.util.Vector;

class Player{
	private int id;
	private String name;
	
	public Player(int id,String name,int runs) {
		this.id=id;
		this.name=name;
		this.runs=runs;
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
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	private int runs;
}

public class PlayerVectorApp {

	public static void main(String[] args) {
		Vector<Player> v=new Vector<Player>();
		Player p1=new Player(1,"A",10);
		Player p2=new Player(2,"AB",100);
		Player p3=new Player(3,"ABC",1000);
		Player p4=new Player(4,"ABCD",1000);
		Player p5=new Player(5,"ABCDE",10000);
		v.add(p1);
		v.add(p2);
		v.add(p3);
		v.add(p4);
		v.add(p5);
		for(int i=0;i<v.size();i++) {
			for(int j=i+1;j<v.size();j++) {
				Player a=v.get(i);
				Player b=v.get(j);
				if(a.getRuns()<b.getRuns()) {
					v.set(i, b);
					v.set(j, a);
				}
			}
		}
		for(Player p:v) {
			System.out.println(p.getId()+" "+p.getName()+" "+p.getRuns());
		}
		
		
		
	}

}
