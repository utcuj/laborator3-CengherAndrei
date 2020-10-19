import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Loterie {
	
	private int numereCastigatoare[] = new int[6];
	private int[] extragere(){
		
		Random r= new Random();
		
		
		for (int i=0; i<6;i++) {
			numereCastigatoare[i]=r.nextInt(50);
		}
		return numereCastigatoare;
	}
	public static void main(String[]args) throws IOException {
		Loterie infinity = new Loterie();
		int numereCastigatoare[]= infinity.extragere();
		
		int numereAlese[] = {0,0,0,0,0,0};
		for(int i=0;i<6;i++)
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s1 = br.readLine();
			int n = Integer.parseInt(s1);
			numereAlese[i] = n;
		}
		int count=0;
		Bilet biletulmeu = new Bilet(numereAlese);
		for(int i=0;i<6;i++) {
			int b[] = biletulmeu.getNumere();
			for(int j=0;j<6;j++) {
				if(b[j]==numereCastigatoare[i])
					count++;
				
			}
		}
		if(count==6)
			System.out.println("Am castigat");
		else 
			System.out.println("Am pierdut");
		
		for(int i=0;i<6;i++)
		{
			System.out.print(numereCastigatoare[i]);
			System.out.print(" ");
		}
		System.out.print("\n");
		

	}
}
