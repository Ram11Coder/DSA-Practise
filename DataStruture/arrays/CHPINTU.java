package arrays;

import java.util.Arrays;
import java.util.Scanner;
//https://www.codechef.com/problems/CHPINTU
public class CHPINTU {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			
			int n=sc.nextInt(),m=sc.nextInt();
			int freq[]=new int[m+1];
			boolean flag[]=new boolean[m+1];
			int f[]=new int[n],p[]=new int[n];
			for (int i = 0; i < f.length; i++) {
				f[i]=sc.nextInt();
			}
			for (int i = 0; i < p.length; i++) {
				p[i]=sc.nextInt();
			}
			for (int i = 0; i < p.length; i++) {
				freq[f[i]]+=p[i];
				flag[f[i]]=true;
			}
			System.out.println(Arrays.toString(freq));
			System.out.println(Arrays.toString(flag));
			int min=Integer.MAX_VALUE;
			for (int i = 0; i < flag.length; i++) {
				if(flag[i]&&freq[i]<min)
					min=freq[i];
					
			}
			System.out.println(min);
		}
		
	}
}
