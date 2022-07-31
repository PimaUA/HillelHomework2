package part2;

public class Palindrome {
    //method isPalindrome checks if string is palindrome
    public boolean isPalindrome(String word) {
        StringBuilder str = new StringBuilder(word);
        str.reverse();
        String reversedWord = str.toString();
//main logic
        return word.equals(reversedWord);
    }
//method main
    public static void main(String[] args) {
        Palindrome checkWord = new Palindrome();
        boolean checkResult=checkWord.isPalindrome("AKA");
        System.out.println(checkResult);
    }
}
