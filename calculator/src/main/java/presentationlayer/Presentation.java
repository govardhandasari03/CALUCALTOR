package presentationlayer;
import logiclayer.*;
import java.util.*;
public class Presentation {
	static ArrayList<Object> list = new ArrayList<Object>();

	public static void main(String[] args) {
		MathOperations obj=new MathOperations();
		
		int firstnumber;
		int secondnumber;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter two numbers:");
	    firstnumber=sc.nextInt();
	    list.add(firstnumber);
	    secondnumber=sc.nextInt();
	    list.add(secondnumber);
	    System.out.println("Select type of operations( + , - , * , / )");
		char operator=sc.next().charAt(0);
		list.add(operator);
		obj.calculation(firstnumber, secondnumber, operator);
        obj.get();
	}
	public  List<Object> getList() {
	       return list;
	    }
}
