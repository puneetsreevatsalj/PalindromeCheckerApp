import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long startTime = System.nanoTime();

        boolean result = checkUsingStack(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    private static boolean checkUsingStack(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
        String reversed = "";

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
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

        return true;
    }
}
}

