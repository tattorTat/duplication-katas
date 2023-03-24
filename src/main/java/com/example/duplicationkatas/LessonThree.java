package com.example.duplicationkatas;

public class LessonThree extends Song{
    public void singCheers() {
        int number = 2;
        sing(number + "! ");
        number = number + 2;
        sing(number + "! ");
        number = number + 2;
        sing(number + "! ");
        number = number + 2;
        sing(number + "! ");
        sing("Who do we appreciate?");
        number = 17;
        sing(number + "! ");
        number = getNextPrime(number);
        sing(number + "! ");
        number = getNextPrime(number);
        sing(number + "! ");
        number = getNextPrime(number);
        sing(number + "! ");
        sing("These are the primes, that we find fine!");
    }

    private int getNextPrime(int number) {
        return switch (number) {
            case 13 -> 17;
            case 17 -> 19;
            case 19 -> 23;
            case 23 -> 29;
            default -> 0;
        };
    }
}
