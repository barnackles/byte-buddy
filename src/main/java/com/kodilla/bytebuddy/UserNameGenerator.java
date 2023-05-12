package com.kodilla.bytebuddy;

import java.util.Random;

public class UserNameGenerator {

    private static final Random random = new Random();

    public UserNameGenerator() {
    }

    public static String generateRandomName() {
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 10;

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
