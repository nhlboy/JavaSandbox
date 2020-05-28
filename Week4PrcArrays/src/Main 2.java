public class Main {

    public static void main(String[] args) {
		int[] myList = new int[10];

		for (int i = 0; i < myList.length; i++) {
			myList[i] = (int)Math.random() * 100;
//			System.out.println(myList[i]);
//			System.out.printf("%2f\n", myList[i]);
			System.out.printf("%d\n", myList[i]);

		}


	}
}
