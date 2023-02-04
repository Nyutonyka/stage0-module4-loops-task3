package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        long lustNumber = 0;
        long number = 1;
        long fibonacci;
        System.out.println(lustNumber);
        System.out.println(number);

        for (int i = 1; i <= lastFibonacci - 2; i++) {
            fibonacci = lustNumber + number;
            lustNumber = number;
            number = fibonacci;
            System.out.println(fibonacci);
        }
    }
}
