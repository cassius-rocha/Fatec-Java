
public class Main {
    public static void main(String[] args) throws AgeLessThanZeroException{

        String a = "123", b = "qualquerCoisa";

        int i = ExceptionHandling.test1(a);
        //int j = ExceptionHandling.test1(b);

        System.out.println(i);

        // testes de exception
        ThrowExceptionExample.validateAge(-1);

    }
}