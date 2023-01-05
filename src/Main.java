import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        String[] words = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.printExclamation(words);

        System.out.println("----");

        // original word list NOT modified
        System.out.println(Arrays.toString(words));
    }
}
