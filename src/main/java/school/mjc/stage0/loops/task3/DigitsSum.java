package school.mjc.stage0.loops.task3;

public class DigitsSum {

    public void printDigitsSum(int t){
        String number = t +"";
        int sum = 0;

        if (t<0){
            t = t * -1;
        }

        for (int i= 0; i <= number.length(); i++){
            sum = sum + (t % 10);
            t = t/10;
        }
        System.out.println(sum);
    }
}
