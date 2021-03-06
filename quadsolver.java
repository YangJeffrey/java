import java.util.Scanner;

	public class quadsolver {
		public static void main(String args[]) {
			System.out.println("quadratic equation (ax^2+bx+c):");
			Scanner input = new Scanner(System.in);
			String quadratic = input.next();
			String s = quadratic;

			int landmark1=s.indexOf("x^2");
			int landmark2=s.indexOf("x", landmark1 + 1);
			int k= landmark2 + 1;
			
			int length = quadratic.length();
			
			String astring = quadratic.substring(0, landmark1);
			String bstring = quadratic.substring(landmark1+3, landmark2);
			String cstring = quadratic.substring(landmark2+1, length);
			
			int a=Integer.parseInt(astring);
			int b=Integer.parseInt(bstring);
			int c=Integer.parseInt(cstring);
			
			double root1 = ((-1 *b)+(Math.sqrt(Math.pow(b,2) - 4*a*c)))/(2*a);
			double root2 = ((-1 *b)-(Math.sqrt(Math.pow(b,2) - 4*a*c)))/(2*a);
			
			System.out.println("Roots:");
			System.out.println(root1);
			System.out.println(root2); 
	}
}

//credit to @MaximilianHollis for the help
