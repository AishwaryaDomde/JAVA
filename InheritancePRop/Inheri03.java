package InheritancePRop;

class Base01 {
    public void Print() {
        System.out.println("Base");
    }         
}
 
class Derived extends Base01 {    
    public void Print() {
        System.out.println("Derived");
    }
}
 
class Inheri03{
    public static void DoPrint( Base01 o ) {
        o.Print();   
    }
    public static void main(String[] args) {
        Base01 x = new Base01();
        Base01 y = new Derived();
        Derived z = new Derived();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}