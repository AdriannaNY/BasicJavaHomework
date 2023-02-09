package wordsScanner;

public class WordsScannerDemo {
    public static void main(String[] args) {
        WordsScanner userInput = new WordsScanner();
        System.out.println("Please enter first word - ");
        String userWord1 = userInput.userWord();
        System.out.println("Your first word is - " + userWord1);

        System.out.println("Please enter second word - ");
        String userWord2 = userInput.userWord();
        System.out.println("Your second word is - " + userWord2);

        String halfWord1 = userWord1.substring(0,userWord1.length()/2);
        String halfWord2 = userWord2.substring(userWord2.length()/2,userWord2.length());
        String newWord = halfWord1+halfWord2;
        System.out.println("Your new word is - " + newWord);
    }
}