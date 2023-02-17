package Programs;

public class MultiplArray {

	public static void main(String[] args) {
		
		int [][] a = new int[4][4];
		a[0][0]=11;
		a[0][1]=12;
		a[0][2]=13;
		a[0][3]=14;
		a[1][0]=15;
		a[1][1]=16;
		a[1][2]=17;
		a[1][3]=18;
		a[2][0]=19;
		a[2][1]=20;
		a[2][2]=21;
		a[2][3]=22;
		a[3][0]=23;
		a[3][1]=24;
		a[3][2]=25;
		a[3][3]=26;
		for(int i=0; i<a.length; i++)
		{
			for(int j =0; j<a.length;j++ )
			{
				a[i][j] = i+j;
				System.out.println("Array " +a[i][j] );
			}
		}

	}

}
