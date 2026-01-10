package assignments;

public class AutoMorphicProg {
	public static void main(String args[]) {
		//Automorphic number 
		int num = 25;
		int square = num * num; 
		int temp = num;
		boolean isAuto = true;
		while(temp > 0) {
			if(temp % 10 != square % 10) {
				isAuto = false;
				break;
			}
			temp = temp / 10;
			square = square / 10;
		}
		if(isAuto) {
			System.out.println(num + " is an Automorphic number");
		} else {
			System.out.println(num + " is not an Automorphic number");
		}

	}
}
