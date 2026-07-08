package Oops;

public class Class_box {

    int width;
    int height;
    int depth;

    Class_box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    int volume() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        Class_box b1 = new Class_box(5, 4, 3);

        System.out.println("Width : " + b1.width);
        System.out.println("Height: " + b1.height);
        System.out.println("Depth : " + b1.depth);
        System.out.println("Volume: " + b1.volume());
    }
}
