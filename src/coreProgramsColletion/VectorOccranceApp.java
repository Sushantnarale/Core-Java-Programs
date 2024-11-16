package coreProgramsColletion;
//WAP to create vector and store 10 values in it and find the occurent of element?
import java.util.Vector;

public class VectorOccranceApp {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(4);
		v.add(1);
		v.add(2);
		int arr[]=new int[v.size()];
		int visited=-1;
		
		for(int i=0;i<v.size();i++) {
			int count=1;
			for(int j=i+1;j<v.size();j++) {
				if(v.get(i)==v.get(j)) {
					count++;
					arr[j]=visited;
				}
				
			}
			if(arr[i]!=visited) {
				arr[i]=count;
			}
		}
		for(int i=0;i<v.size();i++) {
			if(arr[i]!=-1) {
				Object o=v.get(i);
				System.out.println(o+" "+arr[i]);
			}
		}

	}

}
