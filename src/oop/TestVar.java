package oop;

class TestVar {
    public static void main(String[] args) {
A var = new B();
var.print();
var.print2();
    }
}
class A{
    public void print(){
        System.out.println("A_print");
    }
    public void print2(){
        System.out.println("A2_print");
    }
}
class B extends A{
    public void print(){
        System.out.println("B_print");
    }
}



