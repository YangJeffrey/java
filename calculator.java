import java.util.Scanner;

public class calculator {
public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 System.out.println("first num -");
 int firstNum = sc.nextInt();
 System.out.println("operation -");
 String operation = sc.next();
 System.out.println("second num -");
 int secondNum = sc.nextInt();
 System.out.println("answer -");
 
 if (operation.equals("+")) {
   System.out.println(firstNum + secondNum);
 } 
 if (operation.equals("-")) {
   System.out.println(firstNum - secondNum);
 } 
 if (operation.equals("*")) {
   System.out.println(firstNum * secondNum);
 } 
 if (operation.equals("/")) {
   System.out.println(firstNum / secondNum);
 } 
}
}
