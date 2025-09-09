package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while(i < 100) {

            run_fizz_buzz(i);

            i++;
        }
    }

    private static void run_fizz_buzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            System.out.println("FizzBuzz"); }

        else if (divisibleBy3) {
            System.out.println("Fizz"); }

        else if (divisibleBy5) {
            System.out.println("Buzz"); }

        else {
            System.out.println(i); }

    }
}



//
//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//            // setting up variables?
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//                // && is and in python
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
//    }
//}
