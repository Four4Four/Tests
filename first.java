public class first {
    public static void main(String[] args) {
        A object1 = new A();

        object1.method1(); 
        object1.method2();
    }
}

class A implements interf1, interf2 {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override 
    public void method2() {
        System.out.println("method2");
    }
}

