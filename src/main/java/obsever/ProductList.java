package obsever;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {
    private List<String> productlist = null;
    private static ProductList instance;

    private ProductList() {
    }

    public static ProductList getInstance() {
        if (instance == null) {
            instance = new ProductList();
            instance.productlist = new ArrayList<>();
        }
        return instance;
    }

    public void addProductListObserver(Observer observer) {
        this.addObserver(observer);
    }

    public void addProduct(String newProduct) {
        productlist.add(newProduct);
        System.out.println("增加了新产品：" + newProduct);
        this.setChanged();
        this.notifyObservers(newProduct);
    }
}
