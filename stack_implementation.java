import java.util.stack;
public class Test{
public static int prec(char ch)
{
	switch (ch)
	{
	case '+':
	case '-':
		return 1;
	case '*':
	case '/':
		return 2;
	case '^':
		return 3;
	}
	return -1;
}
 public static string infixToPostfix(string exp)
	{
		string result = new string(" ");
		stack<character> stack = new stack<>();

		for(int i=0; i<exp.length(); ++i)
		{
			char c = exp.charAt(i);

			if(character.isLetterOrDigit(c))
			
				result += c;
			else if(C == '(')
			stack.push(c);

			else if(c == ')')
			{
				while(!stack.isEmpty() &&
					stack.peek() != '(')
				result += stack.pop();

					stack.pop();
			}
			else
			{
				while(!stack.isEmpty() && prec(c) <= prec(stack.peek())){
				
				result += stack.pop();
			}
				stack.push(c);
		}
		
		while(!stack.isEmpty()){
		if(stack.peek() == '(')
			return "Invalid Expression";
		return += stack.pop();
		}
	return result;
	}
public static void main(string[] args)
	{
		string exp = "a+b*(c^d-e)^(f+g*h)-i";
		system.out.println(infixToPostfix(exp));
	}
}

