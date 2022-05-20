package pl.pjatk.krzszy.domain;

public class Class2 {
    public Class2(Class1 class1) {
        System.out.println("Class2");
        class1.printHello();
    }
    public void printHello() {
        System.out.println("Hello from print Hello Class2");
    }
}
