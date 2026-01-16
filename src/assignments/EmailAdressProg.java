package assignments;

public class EmailAdressProg {
	
	public static boolean checkEmailAddress(String s) {
		if(s == null || s.contains(" ")) {
			return false;
		}
		int count= s.length()-s.replace("@", "").length();
		if (count!=1)
		{
			return false;
			}
		String regex = "^[a-zA-Z0-9._]+@(gmail\\.com||yahoo\\.com||hotmail\\.com||outlook\\.com)$";
		
		return s.matches(regex);
		
	}
	public static void main(String args[]) {
		
		System.out.println(checkEmailAddress("javalang@gmail.com"));
		System.out.println(checkEmailAddress("javalang@@gmail.com"));
		System.out.println(checkEmailAddress("javalang @gmail.com"));
		System.out.println(checkEmailAddress("javalange!@gmail.com "));
	}



}
