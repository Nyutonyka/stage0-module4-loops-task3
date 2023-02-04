package school.mjc.stage0.loops.task3;

public class NinesSum {

    public static void main(String[] args) {
       calculateSum(6);
    }
    public static void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int number = 1;
        for (int i = 1; i <= lengthOfLastNumber; i++){
            number = (number *10);
            int number1 = number -1;
            result +=number1;
        }
        System.out.println(result);
    }
}
