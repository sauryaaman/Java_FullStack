package CustomException;

public class ProductService {
    void findProduct(int productid)
    {
        if(productid!=101)
        {
            //eception
            throw new ProductNotFoundException("product now fournd");
        }
        System.out.println("prodcut found");
    }
    public static void main(String[] args) {

    }
}
