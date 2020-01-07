abstract class Tour {
	abstract void Manage() ;
}
class ShowPlan extends Tour{
	void Manage() {
		System.out.println("Tour>Show Plan>Manage");
	}
}
class Location extends Tour{
	void Manage() {
		System.out.println("Tour>Location>Manage");
	}
}
public class Abstract3 {
	public static void main(String args[]) {
		ShowPlan sp= new  ShowPlan();
		sp.Manage();
		Location lp = new Location();
		lp.Manage();
	}
}
