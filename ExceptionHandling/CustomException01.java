package ExceptionHandling;

public class CustomException01 extends Exception{
	public static  String CustomException01(int s) {
		System.out.println(s);
		String check="N";
		if(s<18) {
		      System.out.println("sdfj");
		      check="Y";
		}
		     else {
		      System.out.println("welcome to vote");
		      check = "N";
		     }
		return check;
	}
	public static void main(String args[]) {
		try
        { 
			CustomException01(12);
            // Throw an object of user defined exception 
            throw new CustomException01(); 
        } 
        catch (CustomException01 ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from MyException object 
            System.out.println(ex); 
        } 
	}
}
