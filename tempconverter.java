import java.util.Scanner;

public class tempconverter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("converting to f or c?");
		 String convert = sc.next();
		 
		 if (convert.equals("f")) {
			 System.out.println("celsius:");
			 int cel = sc.nextInt();
			 double fah = cel * 1.8 + 32;
			 System.out.println("fahrenheit:");
			 System.out.println(fah);
		 }
		 
		 if (convert.equals("c")) {
			 System.out.println("fahrenheit:");
			 int fah = sc.nextInt();
			 double cel = (fah - 32) * 0.5556;
			 System.out.println("celsius:");
			 System.out.println(cel);
		 }	 
		 
	}

}
