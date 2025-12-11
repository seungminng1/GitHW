package mygit;

public class C {
    public static void main(String[] args) {
        System.out.println("C: start program");
        System.out.println("C: 마스터 수정함");
        System.out.println("C: alice 수정");
        new A().printA();
        new B().printB();
    }
}