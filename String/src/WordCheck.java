public class WordCheck {
    public static void main(String[] args) {
        String sentence = "fox";
        String targetWord = "fox";

        if (sentence.equals(targetWord)) {
            System.out.println("Word found!");
        } else {
            System.out.println("Word not found!");
        }
    }
}
