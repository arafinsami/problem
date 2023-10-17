package aaaaaaa;

public class Problem {

	public static String reverseStringInsideParentheses(String input) {
		StringBuilder result = new StringBuilder();
		StringBuilder insideParentheses = new StringBuilder();
		boolean withinParentheses = false;
		for (char c : input.toCharArray()) {
			if (c == '(') {
				withinParentheses = true;
				result.append(c);
			} else if (c == ')') {
				withinParentheses = false;
				result.append(reverseString(insideParentheses.toString()));
				insideParentheses.setLength(0);
				result.append(c);
			} else {
				if (withinParentheses) {
					insideParentheses.append(c);
				} else {
					result.append(c);
				}
			}
		}
		return result.toString();
	}

	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {
		String[] input = { "abd(jnb)asdf", "abdjnbasdf", "dd(df)a(ghhh)" };
		for (String str : input) {
			String reversed = reverseStringInsideParentheses(str);
			System.out.println(reversed);
		}

	}
}
