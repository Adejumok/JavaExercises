package chapterFourteen;

public class CustomStringMethods {
    public static void main(String[] args) {
        String alphabet= "abcdefghabcdefghab";
        Character c = 'g';
        String subString = "bcd";
        System.out.print("Alphabet "+c+" using custom method indexOf " +
                "is found at index "+ cIndexOf(alphabet, c));
        System.out.print("\nAlphabet "+c+" using custom method lastIndexOf " +
                "is found at index "+ cLastIndexOf(alphabet, c));
        System.out.print("\nAlphabet "+c+" using custom method indexOf " +
                "is found at index "+ cIndexOf(alphabet, c, 7));
        System.out.print("\nAlphabet "+c+" using custom method lastIndexOf " +
                "is found at index "+ cLastIndexOf(alphabet, c, 10));
        System.out.print("\nSubstring "+subString+" using custom method indexOf " +
                "is found at index "+ cIndexOf(alphabet, subString));
        System.out.print("\nSubstring "+subString+" using custom method lastIndexOf " +
                "is found at index "+ cLastIndexOf(alphabet, subString));
        System.out.print("\nSubstring "+subString+" using custom method lastIndexOf " +
                "is found at index "+ alphabet.lastIndexOf(subString));
    }

    private static int cIndexOf(String word, Character s){
        for (int position = 0; position < word.length(); position++) {
            if (s.equals(word.charAt(position))){
                return position;
            }
        }
        return -1;
    }

    private static int cIndexOf(String word, String s){
        if (word.contains(s)){
            for (int position = 0; position < word.length(); position++) {
                if (word.charAt(position)==s.charAt(0)){
                    return position;
                }
            }
        }
        return -1;
    }

    private static int cIndexOf(String word, Character s, int startingIndex){
        for (int position = startingIndex; position < word.length(); position++) {
            if (s.equals(word.charAt(position))){
                return position;
            }
        }
        return -1;
    }

    private static int cLastIndexOf(String word, Character s){
        for (int position = word.length() - 1; position >= 0; position--) {
            if (s.equals(word.charAt(position))){
                return position;
            }
        }
        return -1;
    }

    private static int cLastIndexOf(String word, Character s, int endingIndex){
        for (int position = word.length() - 1; position >= endingIndex; position--) {
            if (s.equals(word.charAt(position))){
                return position;
            }
        }
        return -1;
    }
    private static int cLastIndexOf(String word, String s){
        if (word.contains(s)){
            for (int position = word.length() - 1; position >= 0; position--) {
                if (word.charAt(position)==s.charAt(0)){
                    return position;
                }
            }
        }
        return -1;
    }
}
