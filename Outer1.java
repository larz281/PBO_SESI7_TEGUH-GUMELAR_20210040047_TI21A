//Outer1

public class Outer1 {
    int number = 0;

    private class Inner{
        public void print(){
            System.out.println("Mengakses inner class yang ke : " + (++number));
        }
    }

    void displayFromMethod(){
        Inner in = new Inner();
        in.print();
    }
}

class Main{
    public static void main(String[] args) {
        Outer1 out = new Outer1();
        out.displayFromMethod();
        out.displayFromMethod();
    }
}