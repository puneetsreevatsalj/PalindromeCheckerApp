import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        Deque<Character> deque = new LinkedList<>();

        String reversed = "";

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        // Compare original and reversed string
        if (input.equals(reversed)) {
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        // Two-pointer technique
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}
}

