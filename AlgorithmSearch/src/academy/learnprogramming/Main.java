package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        System.out.println(factorial(5));
//
//        // for (int i = 0; i < x.length; i++) {
//        // System.out.println(x[i]);
//    }
//
//    public static int factorial (int number) {
//        int result = 1;
////        for (int i = 1; i < number; i++) {
////            result = result * i;
////
////        }
//        if (number  == 1 || number == 0) {
//            return result;
//        }
//        result = number * factorial(number - 1);
//        //result = number * factorial(number - 1);
//        return result;
//    }
//
//    public static void rec() {
//        System.out.println("rec");
//        rec();
//    }
//
//
//
//	public static int lineSearch(int M[], int a ) {
//        for (int i = 0; i <= M.length; i++) {
//            if (M[i] == a) {
//                return a;
//            }
//        }
//    return -1;
//
//    }
//
//      public static int binarySearch (int N[], int b) {
//          int first = 0;
//          int last = N.length - 1;
//          while (first <= last) {
//              int middle = (last - first) / 2;
//              if (middle == b) {
//                  return b;
//              }
//              else if (middle < b ){
//                  first = middle +1;
//
//              }
//              else if (middle > b) {
//                  last = middle - 1;
//              }
//          }
//          return -1;
    }

    public static int linerSearch(int massive[], int searchNumber) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == searchNumber) {
                return i;
            }

        }
        return -1;
    }

    public static int binarySearch (int massive[], int searchNumber) {

        int firstIndex = 0;
        int lastIndex = massive.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if(massive[middleIndex] == searchNumber) {
                return middleIndex;
            }
            else if (massive[middleIndex] < searchNumber) {
                firstIndex = middleIndex + 1;
            }
                else if (massive[middleIndex] > searchNumber) {
                    lastIndex = middleIndex - 1;

                }

            }
            return -1;

        }
}


