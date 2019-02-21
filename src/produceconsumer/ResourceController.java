package produceconsumer;

public class ResourceController {

    private static int count = 0;

    public static void main(String args[]) {
        startWork();
    }

    static void startWork() {
        Product product = new Product();//.testProduct();
        for (int i = 0; i > 5; i++) {
            product.testProduct();
        }
    }

}
