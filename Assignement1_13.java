import java.util.Scanner;

 class Assignement1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
       

        String largestWord = flw(input);
        System.out.println("Largest word in the string: " + largestWord);
    }

    public static String flw(String input) {
        String[] words = input.split("\\s+"); 
        String largestWord = "";

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        return largestWord;
    }
}
