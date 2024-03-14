public class ThrowExceptionExample {
    public static void validateAge(int age) throws AgeLessThanZeroException{
        if(age < 0){
            throw new AgeLessThanZeroException("Idade não pode ser inferior à zero.", new RuntimeException());
        }
    }
}
