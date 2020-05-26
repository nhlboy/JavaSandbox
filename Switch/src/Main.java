public class Main {

    public static void main(String[] args) {
       int value = 1;
       if(value == 1) {
           System.out.println("Value was 1");
       } else if(value == 2) {
           System.out.println("Value was 2");
       } else {
           System.out.println("Was not 1 or 2");
       }

       int switchValue = 3;

       switch(switchValue) {
           case 1:
               System.out.println("Value was 1");
               break;

           case 2:
               System.out.println("Value was 2");
               break;
           case 3: case 4: case 5:
               System.out.println("was a 3, or 4, or 5");
               System.out.println("Actually it was a " + switchValue);
               break;

           default:
               System.out.println("Was not 1 or 2");
               break;
       }
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char switchChar = 'K';

        switch(switchChar) {
            case 'A':
                System.out.println("It was A");
                break;

                case 'B':
                System.out.println("It was B");
                break;

                case 'C':  case'D':  case 'E':
                    System.out.println(switchChar + " was found");
                    break;

            default:
                System.out.println("Not found. FUCK YOU");
                break;

        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }

}