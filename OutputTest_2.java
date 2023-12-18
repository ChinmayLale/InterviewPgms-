class Base {
    public Base() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public Derived() {
        System.out.println("Derived");
    }
}

class DeriDerived extends Derived {
    public DeriDerived() {
        System.out.println("DeriDerived");
    }
}

public class OutputTest_2 {
    public static void main(String[] args) {
        // Derived obj = new DeriDerived();
        Pencil p = new Pencil();
        p.getName();
        // p.getpen();
    }
}



class Pen{
    int i;
    public void getName(){
        System.out.println("Tarzen");
    }

    
    Pen(){
        System.out.println("Constructor Called");
    }

    Pen(int n){
        System.out.println("I have "+n+" pens");
    }
}


class Pencil extends Pen{
    int j;
    public void getName(){
        System.out.println("This is pencil");
        super.getName();
    }
}

class Rubber extends Pencil{
    public void getName(){
        System.out.println("THis is Rubber Class");
        super.getName();
    }
    public void getpen(){

    }
}