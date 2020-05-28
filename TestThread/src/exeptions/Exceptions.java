package exeptions;

public class Exceptions {

    public static void main(String[] args) {

//        getFactorial(-1);


        try {
//            getNumber(11);
//            throw new Exception();
            throw new ArithmeticException();
            }
        catch (NullDeliveredArithmeticException nasheIsklychenie) {
            System.out.println("ЕЩЕ ОДНО НАШЕ ИСКЛЮЧЕНИЕ");
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("на ноль делить нельзя");
        }
        catch (Exception exeption) {
            System.out.println("ПРОСТО ИСКЛЮЧЕНИЕ");
        }
        finally {
            System.out.println("В ЛЮБОМ СЛУЧАЕ ОТРАБАТЫВАЕТ");
        }

    }

    public static int getNumber(int i) {

        if(i > 0) {
            throw new NullDeliveredArithmeticException("НАШЕ ИСКЛЮЧЕНИЕ");
        }
        return i;

    }

    public static int getFactorial(int num){

        int result = 1;
        try{
            if(num < 1) throw new Exception("The number is less than 1");

            for(int i = 1; i <= num; i++){

                result*=i;
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
            result = num;
        }
        return result;
    }
}
