package wordsScanner;

public class WordsScanner {
    public String userWord() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String enterWord = scanner.nextLine();
        while ((enterWord.length()) % 2 != 0) {
            System.out.println("Not correct word! Please enter correct word with an even number of letters - ");
            enterWord = scanner.nextLine();
        }
        return enterWord;

    }
}
