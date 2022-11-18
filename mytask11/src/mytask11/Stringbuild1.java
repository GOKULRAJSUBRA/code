package mytask11;

public class Stringbuild1 {
	public static void main(String[] args) {
		String str= "GOKUL at the work";
		String [] words=str.split(" ");
		String reverseword="";
		for(String w:words) {
			StringBuilder reversenumber=new StringBuilder(w);
			reversenumber.reverse();
			reverseword=reverseword+reversenumber.toString()+" " ;
		}
		System.out.println(reverseword);	
		//int num=str.length();
		//for(int i=num-1;i>=0;i--) {
			//System.out.print(str.charAt(i));
		}

	}
 

