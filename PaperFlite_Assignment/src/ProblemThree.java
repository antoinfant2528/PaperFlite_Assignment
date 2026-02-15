import java.util.*;

class ProblemThree{

        //Problem 3:
        public  static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word))
                    return false;
            } else {
                if (wordToChar.containsKey(word))
                    return false;

                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }
        return true;
    }

    public static void main(String args[]){
        
        System.out.println("TestCase 1:"+wordPattern("abb","dog cat cat"));
        System.out.println("TestCase 2:"+wordPattern("abba","dog cat cat fish"));
        System.out.println("TestCase 3:"+wordPattern("aa","dog dog cat "));
        System.out.println("TestCase 3:"+wordPattern("abbb","dog cat cat cat "));
        

    }
}