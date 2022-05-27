package arrays;

public class HRDSEQ {
	public static void main(String[] args) {
		int n = 7;
		solution(n);
	}

	private static void solution(int n) {
		int freq[]=new int[129];//as per constraints
		int arr[]=new int[n+1];
		for(int i=2;i<=n;i++) {
			if(freq[arr[i-1]]==0) {
				freq[arr[i-1]]=i-1;
			}else {
			arr[i]=	i-1 -freq[arr[i-1]]=i-1;
			
			}
			freq[arr[i]]=i;
		}
	}
}
