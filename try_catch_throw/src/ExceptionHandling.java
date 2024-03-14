public class ExceptionHandling {
    public  static int test1(String test) {
        int myInt = 0;
        try {
            myInt = Integer.parseInt(test);
        } catch (NumberFormatException nfe) {
            System.out.println(("Conversão impossível, a String deve ser formada por números.\n"));
        }
            return myInt;
    }
}
