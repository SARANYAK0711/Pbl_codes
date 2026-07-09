package access;

import Test.Foundation;

public class AccessDemo {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // private - not accessible
        // System.out.println(obj.var2); // default - not accessible
        // System.out.println(obj.var3); // protected - not accessible

        System.out.println("var4 = " + obj.var4);
    }
}