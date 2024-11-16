package coreProgramsColletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FirstCollectionApp {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		Iterator<Integer> i=al.iterator();
		int len=al.size();
		boolean b=al.contains(500);
		System.out.println(len);
		
		Integer c=al.set(1, 1200);
		System.out.println(c);
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
		
		System.out.println("\n\n\n\n");

		
		Object[] arr=al.toArray();
		for(int i1=0;i1<arr.length;i1++) {
			System.out.println(arr[i1]);
		}

		
		List<Integer> list=al.subList(2, 4);
				
	}

}
