package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
        'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i <= chars.length-1; i++){
            System.out.println(chars[i]);
        }
    }
}
