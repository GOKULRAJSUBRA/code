package mytask11;

public class Linearsearch {

	public static void main(String[] args) {
		boolean flag=false;
		int a[]= {20,4,3,43,2};
		int search_ele=5;
		for(int i=0;i<a.length;i++) {
			if(search_ele==a[i]) {
				System.out.println(i);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("search element not found");
		}

	}

}
