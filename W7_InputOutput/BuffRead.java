import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffRead{
	public static void main (String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a;
		String b;
		int c;
		
		try{
			System.out.print("a : ");
			a = br.readLine();

			System.out.print("b : ");
			b = br.readLine();

			System.out.print("c : ");
			c = Integer.parseInt(br.readLine());

			System.out.println("===============================");

			System.out.println("a  		: " + a);
			System.out.println("(b+5)  		: " + (b+5));
			System.out.println("(c+5)  		: " + (c+5));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}