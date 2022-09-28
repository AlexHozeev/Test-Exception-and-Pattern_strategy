package Test_Exception;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        try {

            System.out.println(arr[10]);
        } catch (RuntimeException runtimeException) {              //2d
            System.out.println("exception");
            throw runtimeException;
        } finally {                                              //1st
            System.out.println("d1");
            System.out.println(sum(1, "сe"));
        }
    }

    private static int sum(int first, String second) {
        try {
            var secondNumber = Integer.parseInt(second);
            return secondNumber + first;
        } catch (NumberFormatException e) {
            var exception = new YouAreNotRightAlexException("have some problem with numbers? Is <" + second + " >it look like a number to you?");
            exception.initCause(e); // create my exception
            throw exception;

        }
    }
}
