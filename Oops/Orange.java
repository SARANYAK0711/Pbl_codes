package Oops;

public class Orange extends Fruit {

    public Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : Sour");
    }
}