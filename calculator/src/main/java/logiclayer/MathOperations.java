package logiclayer;
import presentationlayer.*;
import persistancelayer.*;
import java.util.*;
public class MathOperations {
	List<Object> list = new ArrayList<Object>();
	public void calculation(int firstnumber,int secondnumber,char operator) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	MethodImplementation operand=new MethodImplementation();
	
	 Presentation input=new Presentation();
	list =input.getList();
	while(operator!='N'){
		
		
		switch(operator){
		    case '+':float sum=operand.addition(firstnumber,secondnumber);
		    	list.add(sum);
		    	System.out.println(sum);
		            break;
		    case '-':float sub=operand.subtraction(firstnumber,secondnumber);
		    list.add(sub);
		    	System.out.println(sub);
		            break;
		    case '*':float mul=operand.multipliaction(firstnumber,secondnumber);
		    list.add(mul);
		    	System.out.println(mul);
		            break;
		    case '/':float div=operand.division(firstnumber,secondnumber);
		    list.add(div);
		    	System.out.println(div);
		            break;
		  default:System.out.println("Invalid choice try again :)");
		  
		}
		   System.out.println("Want to calculate more...(Y/N)= ");
		   operator=sc.next().charAt(0);
		   list.add(operator);
		   if(operator!='N') {
			   System.out.println("enter any two numbers= ");
				firstnumber=sc.nextInt();
				list.add(firstnumber);
				secondnumber=sc.nextInt();
				list.add(secondnumber);
				System.out.println("Select type of operation( + , - , * , / ),You want to perform= ");
				
				
				operator=sc.next().charAt(0);
				list.add(operator);
		   }
		   else
			   	break;
		}
	
}
	public  void   get() {
	      
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		} 
	    }
}

