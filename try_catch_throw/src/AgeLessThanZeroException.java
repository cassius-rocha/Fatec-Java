//extends RuntimeException: trata a exceção como uma unchecked exception, não é mais necessário o throws

//subclasse de Exception
public class AgeLessThanZeroException extends Exception{
    public AgeLessThanZeroException(){};
    public AgeLessThanZeroException(String message){
        //super é uma chamado à classe pai
        super(message);
    }
    public AgeLessThanZeroException(Throwable cause){
        //Indica a causa da exceção, útil quando houver mais de uma possibilidade que possa gerar a execeção
        super(cause);
    }
    public AgeLessThanZeroException(String message, Throwable cause){
        super(message, cause);
    }
}
