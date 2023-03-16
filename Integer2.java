package sihelp2;

public class Integer2 {
public static void main(String[]args) {
	Integer test1 =new Integer("5");  //create Integer object using String value
	Integer test2 = new Integer(10);  //create Integer object using int value
	System.out.println(Integer.MAX_VALUE); //print maximum value of Integer
	System.out.println(test1.compareTo(test2)); //compares two Integer objects
	System.out.println(Integer.parseInt("3")); //converts "3" into an int
	System.out.println(Integer.parseInt("12",8));// converts "10" into an ocutla int
}
}
