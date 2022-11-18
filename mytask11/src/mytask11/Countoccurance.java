package mytask11;

public class Countoccurance {

	public static void main(String[] args) {
		String s="java programming java oops" ;
		int totalcount=s.length();
		int after_removinga=s.replace("o","").length();
		int count= totalcount- after_removinga;
		System.out.println("number count occurance "+count);

	}

}
