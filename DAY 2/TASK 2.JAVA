public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        char[] characters = input.toCharArray();  // Convert the string to a character array

        // Reverse the array in place
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            // Swap characters at start and end positions
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            start++;
            end--;
        }

        // Print the reversed string
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i]);
        }
    }
}
