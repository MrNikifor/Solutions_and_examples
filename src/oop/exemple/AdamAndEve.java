package oop.exemple;

public class AdamAndEve {
    public static void main(String[] args) {

    }
    public static Human[] create(){
        Human man = new Man();
        Human woman = new Woman();
        return new Human[]{man,woman};
    }
}
class Human{

}
class Man extends Human{

}
class Woman extends Human{

}
