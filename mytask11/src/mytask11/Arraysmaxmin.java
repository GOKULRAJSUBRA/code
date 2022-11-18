package mytask11;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysmaxmin {

	public static void main(String[] args) {
		int a[]= {3,5,6,7,2};
		int max=a[0];     //int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {    //if(a[i]<max);
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
