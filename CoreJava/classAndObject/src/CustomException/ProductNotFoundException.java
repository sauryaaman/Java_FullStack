package CustomException;

public class ProductNotFoundException extends RuntimeException {

    ProductNotFoundException(String message){
        super(message);
    }

    public static void main(String[] args) {

    }
}
