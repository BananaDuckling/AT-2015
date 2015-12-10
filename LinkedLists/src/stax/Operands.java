package stax;
import java.util.Stack;

public class Operands {

	public String operate(String str)
	{
		String[] arr=str.split(" ");  
		Stack<String> nums = new Stack<String>();
		Stack<String> ops = new Stack<String>();
		int sum;
		for(int x = 0; x < arr.length; x++)
		{
			String s = arr[x];
			if(!isOperator(s))//number
				nums.push(s);
			else
			{
				if(ops.empty())
					ops.push(s);
				else
					if(precedence(s)>precedence(ops.peek()))
						ops.push(s);
					else
					{
						//compute stuff in this operation hierarchy tier
						nums.push(compute(nums, ops));
					}
			}
		}
		/*
		 * after inner level computation is done,
		 * just run compute() on the remaining stack to compute the remainder.
		 * (this needs to be tested, because I'm not sure)
		 */
		nums.push(compute(nums, ops));
		return nums.pop();
	}

	private String compute(Stack<String> nums, Stack<String> ops)
	{
		while(!ops.isEmpty())
		{
			String firstOperator = ops.pop();
			int temp = precedence(firstOperator);
			if(temp == 2)
			{
				int exponent = Integer.parseInt(nums.pop());
				int base = Integer.parseInt(nums.pop());
				base = base^exponent;
				nums.push(base+"");
			}
			else if(temp == 3)
			{
				int first = Integer.parseInt(nums.pop());
				int second = Integer.parseInt(nums.pop());
				if(firstOperator.equals("*"))
					first = first*second;
				else
					first = first/second;
				//DIVIDING MAY CAUSE PROBLEMS BECAUSE OF INTEGER DIVISION
				//TODO
				nums.push(first+"");
			}
			else if(temp == 4)
			{
				int first = Integer.parseInt(nums.pop());
				int second = Integer.parseInt(nums.pop());
				if(firstOperator.equals("+"))
					first = first+second;
				else
					first = first-second;
				nums.push(first+"");
			}
		}
		return nums.pop();
	}
	private boolean lastInStack(Stack s)
	{
		String temp = (String)s.pop();
		if(s.empty())
		{
			s.push(temp);
			return true;
		}
		s.push(temp);
		return false;
	}

	private int precedence(String q)
	{
		int s = -1;
		if(q.equals("("))
			s = 0;
		else if(q.equals(")"))
			s = 1;
		else if(q.equals("^"))
			s = 2;
		else if(q.equals("*"))
			s = 3;
		else if(q.equals("/"))
			s = 3;
		else if(q.equals("+") || q.equals("-"))
			s = 4;
		return s;
	}
	private boolean isOperator(String s)
	{
		return !s.matches("-?[0-9]+(\\.[0-9]*)?");		
	}
}

