public class SpaceCount {
    public static void main(String[] args) {
        String sentence = "my name is santosh";
        int spaceCount = 0;

        // Loop through the string and count spaces
        for (char c : sentence.toCharArray()){
            if(c==' '){
                spaceCount++;
            }
        }

        System.out.println(spaceCount);
    }
}
