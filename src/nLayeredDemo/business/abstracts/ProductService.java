package nLayeredDemo.business.abstracts;

import nLayeredDemo.entities.concretesss.Product;

import java.util.List;

public interface ProductService {

    void add(Product product);
    List<Product> getAll();

}
