import obsever.JDObserver;
import obsever.ProductList;

public class JavaBasicPrac {
    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        JDObserver observer = new JDObserver();
        observable.addProductListObserver(observer);
        observable.addProduct("显示器");
    }
}