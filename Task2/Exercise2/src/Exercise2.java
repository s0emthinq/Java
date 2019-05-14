import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        Exercise2 eo = new Exercise2();
        System.out.println("1.Find highest digit.\n2.Check if number is palindrome" +
                "\n3.Check if number is prime.\n4.Find prime dividers" +
                "\n5.Find LCM and GCD of numbers.\n6.Find number of unique digits.");
        choice = scanner.nextInt();
        System.out.println("Input a natural number:");

        int number = scanner.nextInt();
        while (number <= 0) {
            System.out.println("Number must be natural!(That means > 0).Please, try again:");
            number = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                System.out.println("The highest digit is: " + eo.findHighestDigit(number));
                break;
            case 2:
                System.out.println("Is number a palindrome: " + eo.isPalyndrom(number));
                break;
            case 3:
                System.out.println("Is number prime: " + eo.isPrime(number));
                break;
            case 4:
                System.out.println("Prime dividers are: " + eo.findPrimeDividers(number));
                break;
            case 5:
                System.out.println("Input number2");
                int number2 = scanner.nextInt();
                while (number2 <= 0) {
                    System.out.println("Number must be natural!(That means > 0).Please, try again:");
                    number2 = scanner.nextInt();
                }
                System.out.println("LCM: " + eo.lcm(number, number2));
                System.out.println("GCD: " + eo.gcd(number, number2));
                break;
            case 6:
                System.out.println("Unique digits: " + eo.findUniqueDigitsNumber(number));
                break;
            default:
                System.out.println("Incorrect input!");
                break;
        }
    }

    public int findHighestDigit(int number) {
        if (number / 10 < 1) {
            return number;
        } else {
            int currDigit = 0;
            int highestDigit = currDigit;

            while (number != 0) {
                currDigit = number % 10;
                number /= 10;
                if (currDigit > highestDigit) {
                    highestDigit = currDigit;
                }
            }
            return highestDigit;
        }
    }

    public boolean isPalyndrom(int number) {
        String numberAsStr = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(numberAsStr);
        String rvsNumberAsStr = String.valueOf(stringBuilder.reverse());
        return numberAsStr.equals(rvsNumberAsStr);
    }

    public boolean isPrime(int number) {
        int dividers = 2;
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    dividers++;
                }
            }
        }
        return dividers == 2;
    }

    public String findPrimeDividers(int number) {
        String primeDividers = "";
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                int dividersOfDivider = 2;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        dividersOfDivider++;
                    }
                }
                if (dividersOfDivider == 2) {
                    primeDividers += String.valueOf(i) + " ";
                }
            }
        }
        return primeDividers;
    }

    public int gcd(int a, int b) {
        int max = 0;
        int min = 0;
        int remain = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        while (max % min != 0) {
            remain = max % min;
            max = min;
            min = remain;
        }
        return min;
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int findUniqueDigitsNumber(int number) {
        int uniqueDigits = 0;
        String numberAsString = String.valueOf(number);
        String currDigit = "";
        while (number != 0) {
            currDigit = String.valueOf(number % 10);
            numberAsString = numberAsString.substring(0, numberAsString.length() - 1);
            if (!numberAsString.contains(currDigit)) {
                uniqueDigits++;
            }
            number /= 10;
        }
        return uniqueDigits;
    }

}
