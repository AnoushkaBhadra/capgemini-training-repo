package operators.conditional_operators;

public class ConditionalOperatorsProg1 {
	public static void main(String args[]) {
		System.out.println(true?10:20);
		System.out.println(false?"A":65);
		System.out.println(false?'A':65);
		System.out.println(10>'A'?true:false);
		System.out.println("Hello"=="hello"?true:false);
		//System.out.println(10+20?true:false) -> type mismatch error
		
		//important
		String res = 40>30?"A":"true";
		System.out.println(res);
	}
}
