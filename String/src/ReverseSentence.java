public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Santosh";

        char[] chars = sentence.toCharArray();


        int count = 0;
        for (char c : chars) {
            count++;
        }
        String reversed = "";
        for (int i = count - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        System.out.println("Reversed sentence: " + reversed);
    }
}
