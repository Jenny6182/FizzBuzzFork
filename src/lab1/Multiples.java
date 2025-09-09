package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);

        // why are we making another class instead of adding method to FizzBuzz class?
    }

    static int multiples(int n, int a, int b) {
        int multipleCount = 0;
        for (int i = 1; i < n; i++) {
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            if (divisibleBy3 && divisibleBy5) {
                multipleCount++;
            } else if (divisibleBy3) {
                multipleCount++;
            } else if (divisibleBy5) {
                multipleCount++;
            }
        }
        return multipleCount;
    }

    // overloading
    static int multiples() {
        int multipleCount = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                multipleCount++;
            } else if (divisibleBy3) {
                multipleCount++;
            } else if (divisibleBy5) {
                multipleCount++;
            }
        }
        return multipleCount;
    }
}
