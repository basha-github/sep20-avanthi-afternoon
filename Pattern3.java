
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1
		 * 1 0
		 * 1 0 1
		 * 1 0 1 0
		 * 1 0 1 0 1
		 * 
		 */
		
		for(int r=1;r<=5;r++) {
			int val=1;
			for(int c=1;c<=r;c++) {
				System.out.print(val+" ");
				if(val ==1) val =0;
				else if(val ==0) val=1;
			}
			System.out.println();
		}

	}

}
