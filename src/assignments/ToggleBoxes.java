package assignments;

public class ToggleBoxes {
	public static void main(String [] args) {
		/* there are n number of boxes and n number of students. when student 1 goes, he closes all the boxes, then the number of 
		 * open boxes is 0. when student 2 goes, he toggles every 2nd box, so the number of open boxes is n/2.
		 * when student 3 goes, he toggles every 3rd box. this continues until the nth student. without using array.Print the number of open and closed boxes each turn*/

		        int n = 10;

		        int openBoxes = (int) Math.sqrt(n);
		        int closedBoxes = n - openBoxes;

		        System.out.println("After student " + n + " goes:");
		        System.out.println("Number of open boxes: " + openBoxes);
		        System.out.println("Number of closed boxes: " + closedBoxes);
	}
}


