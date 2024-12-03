package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(System.out::println);

        // Get the value from the Mono into an integer variable
        var number = ReactiveSources.intNumberMono().block();
        System.out.println("Number is: " + number);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
