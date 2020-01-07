package InheritancePRop;

/*It is compiler error to give more restrictive access to a derived class function which overrides a base class function.*/
	class Base03 {
	    public void foo() { System.out.println("Base"); }
	}
	  
	class Deriv extends Base03 {
	    //private void foo() { System.out.println("Derived"); } 
		public void foo() {
			System.out.println("Derived");
		}
	}
	  
	public class Inherit04 {
	    public static void main(String args[]) {
	        Base03 b = new Deriv();
	        b.foo();
	    }
	} 

