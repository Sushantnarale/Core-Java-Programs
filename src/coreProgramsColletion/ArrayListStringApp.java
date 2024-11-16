package coreProgramsColletion;

import java.util.ArrayList;

public class ArrayListStringApp {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("sush");
		list.add("rushar");
		list.add("Snatos");
		System.out.println("name end with sh");
		
		for(Object o:list) {
			String s=(String)o;
			if(s.endsWith("sh")) {
				System.out.println(s);
			}
		}
		System.out.println("name start with r or s");
		for(Object obj:list) {
			String sh=(String)obj;
			if(sh.startsWith("R")|| sh.startsWith("S")||sh.startsWith("r")|| sh.startsWith("s")) {
				System.out.println(sh);

			}
		}
		

	}

}
