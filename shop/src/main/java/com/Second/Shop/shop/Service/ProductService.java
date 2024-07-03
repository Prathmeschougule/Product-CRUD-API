package com.Second.Shop.shop.Service;
import java.util.Map;

import com.Second.Shop.shop.Model.Product;

public interface ProductService {

    Map<Integer,Product> getProduct();
    Product getProductByID(int id);
    Product SaveProduct(Product product);
    String deleteProduct(int id);
    Product UpdateMyProduct(int id ,Product product);
    
}
