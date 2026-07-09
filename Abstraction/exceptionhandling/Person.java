package exceptionhandling;

public class Person {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                System.out.println("Please enter Name and Age as command line arguments.");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new AgeException("Age should be greater than or equal to 18 and less than 60.");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);

        } catch (NumberFormatException e) {
            System.out.println("Age must be an integer.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}