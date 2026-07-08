package Oops;

import java.util.Optional;

public class AddressDemo {

    public static void main(String[] args) {

        String address = null;   // Change this to any address if needed

        Optional<String> add = Optional.ofNullable(address);

        System.out.println(add.orElse("India"));
    }
}