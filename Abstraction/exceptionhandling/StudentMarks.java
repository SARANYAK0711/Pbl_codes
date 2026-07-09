package exceptionhandling;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter the name of student " + i);
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter marks in 3 subjects");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) {
                        throw new NegativeValueException("NegativeValueException");
                    }

                    if (mark > 100) {
                        throw new OutOfRangeException("OutOfRangeException");
                    }

                    total += mark;
                }

                double average = total / 3.0;

                System.out.println("Name : " + name);
                System.out.println("Average : " + average);
            }

        } catch (NumberFormatException e) {

            System.out.println("java.lang.NumberFormatException");

        } catch (NegativeValueException e) {

            System.out.println(e.getMessage());

        } catch (OutOfRangeException e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }
}