package program;

public class Repeatedcharacter {

	public static void main(String[] args) {
		int count= 0;
		String s="Sudhakarrao";
		char[] c=s.toCharArray();
		int l=c.length;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				if(c[i]==c[j]) {
					System.out.println(c[i]);
					count++;
				}
				//break;
			}
		}
	}

}
