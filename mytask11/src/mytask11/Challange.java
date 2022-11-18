package mytask11;

public class Challange {

	public static void main(String[] args) {
		int i;
		for(i=0;i<=200;i++) {
			if(i%9==0) {
				int sum=0;
				while(i>0) {
			     int r=i%10;
				 sum=sum+r;
				 i=i/10;}
				i=sum;
				
				
				System.out.println(i);
			}
				
				
			
		}

	}

}
