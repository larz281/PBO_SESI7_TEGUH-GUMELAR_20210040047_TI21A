//Outer2

public class Outer2 {
    int number = 0;

    void OuterMethod(){
    class Inner{
        public void print(){
            System.out.println("Mengakses inner class yang ke : " + (++number));
        }
    }
        Inner inner = new Inner();
        inner.print();
    }
}

class OuterAccess{
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        out.OuterMethod();
        out.OuterMethod();
        out.OuterMethod();
    }
}