import java.util.Arrays;

public class Example5 {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};

            int sumOfSquares = Arrays.stream(numbers)
                    .filter(n -> n % 2 == 0)
                    .map(n -> n * n)
                    .reduce(0, Integer::sum);

            System.out.println("The sum of the squares of even numbers is " + sumOfSquares);
        }
    }
