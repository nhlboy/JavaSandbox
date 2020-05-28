package week4;

public class TestArray {

	public static void main(String[] args) {
		double[] myList = new double[10];
		
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int)(Math.random() * 100);
//			System.out.println(myList[i]);
			System.out.printf("%.2f\n", myList[i]);
//			System.out.printf("%d\n", myList[i]);
		}
	}

}
