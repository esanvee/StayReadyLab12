package io.codedifferently;

import java.util.Stack;

public class OpenCloseChecker {

    public static void main(String args[]) {

		String testString = ")))";
		System.out.println(isMatching(testString));
	}

	public static boolean isMatching(String str) {

		Stack<Character> buffer = new Stack<Character>();
		//buffer must be empty to be true (No lonely/extra brackets)

		for (int i = 0; i < str.length(); i++) {

            

            // If I find the beginning

			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '<' || str.charAt(i) == '"') {
                
                buffer.push(str.charAt(i)); //add to the stack
                

			}
			
			// if I find the end
			if (str.charAt(i) == ')' || str.charAt(i) == ']' || str.charAt(i) == '}' || str.charAt(i) == '>' || str.charAt(i) == '"') {
				
				
				if (buffer.empty()) {
					return false;
				}
				
                    //If there's a match, delete it from the stack
                    
				else if (buffer.peek() == '(' && str.charAt(i) == ')') {
					buffer.pop();
				}
				else if (buffer.peek() == '[' && str.charAt(i) == ']') {
					buffer.pop();
				}
				else if (buffer.peek() == '{' && str.charAt(i) == '}') {
					buffer.pop();
                }
                else if (buffer.peek() == '<' && str.charAt(i) == '>') {
                    buffer.pop();
                    
                }
                
                else if (buffer.peek() == '"' && str.charAt(i) == '"') {
                    buffer.pop();
                    
                }
                
                

            }
            
            

			
        }


		return buffer.isEmpty();

	}

}
