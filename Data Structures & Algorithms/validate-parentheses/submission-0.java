class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char letter : s.toCharArray()){
            if(letter == '(' || letter == '{' || letter == '['){
                stack.push(letter);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(top == '(' && letter == ')' || top == '{' && letter == '}' || top == '[' && letter == ']'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
