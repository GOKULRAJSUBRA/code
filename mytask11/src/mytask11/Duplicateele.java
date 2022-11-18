package mytask11;

public class Duplicateele {

	public static void main(String[] args) {
		int[] a= {2,4,5,3,1,2};
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate elemrnt is found: "+a[i]);
					flag=true;
					//break;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate element is not found");
		}

	}

}
