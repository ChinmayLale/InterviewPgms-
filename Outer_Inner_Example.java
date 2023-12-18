public class Outer_Inner_Example {
    // private static int n = 10;

    class InnerClass{
        InnerClass(){
            System.out.println("Inner Class Obj created ");
        }
        public void display(){
            System.out.println("This is Inner Class Method Display");
        }
    }


    public void getinnerclass(){
        System.out.println("------Inside getinnerclass method------");
        InnerClass obj1 = new InnerClass();
        obj1.display();
    }

    public static void main(String[] args) {
        Outer_Inner_Example obj = new Outer_Inner_Example();
        obj.getinnerclass();
    }
}
