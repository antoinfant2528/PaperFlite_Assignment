import java.util.*;

class ProblemTwo{

        //Problem 2:
        public static String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 &&
                    stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack)
            sb.append(c);

        while (sb.length() > 0 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        if (sb.length() == 0)
            return "0";

        return sb.toString();
    }

    public static void main(String args[]){
        
      
        System.out.println("TestCase 1:"+removeKdigits("1432219",3));
        System.out.println("TestCase 2:"+removeKdigits("10200",1));
        System.out.println("TestCase 3:"+removeKdigits("10",2));
        

    }
}