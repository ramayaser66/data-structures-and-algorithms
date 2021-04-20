package utilities;

import java.util.HashMap;
import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');


        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (map.keySet().contains(current)) {
                stack.push(current);
            } else if (map.values().contains(current)) {
                if (!stack.empty() && map.get(stack.peek()) == current) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
