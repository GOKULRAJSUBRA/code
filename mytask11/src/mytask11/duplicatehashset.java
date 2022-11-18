package mytask11;

import java.util.HashSet;

public class duplicatehashset {

	public static void main(String[] args) {
		boolean flag=false;
		int [] a= {10,12,10};
		HashSet<Integer> langs=new HashSet<Integer>();
		//a.add(10);
		//a.add(12);
		//a.add(10);
		for(Integer l:a) {
			if(langs.add(l)==false) {
				System.out.println("Duplicate"+l);
				flag=true;
			}
		}
         if(flag==false)
        	 System.out.println("Duplicate bot found");
	}

}
