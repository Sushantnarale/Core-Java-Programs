package coreProgramsColletion;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationFirstApp {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		for(int i=0;i<v.size();i++) {
			Object ob=v.get(i);
			System.out.println(ob);
		}
		System.out.println();
		Enumeration<Integer> enm=v.elements();
		while(enm.hasMoreElements()) {
				Object o=enm.nextElement();
				System.out.println(o);
		}
		System.out.println();

		Iterator<Integer> i=v.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
		System.out.println();

		ListIterator<Integer> li=v.listIterator(v.size());
		
		while(li.hasPrevious()) {
			Object oo=li.previous();
			System.out.println(oo);
		}
		System.out.println();
		
		for(Object j:v) {
			System.out.println(j);
		}
		System.out.println();
		
	}

}
