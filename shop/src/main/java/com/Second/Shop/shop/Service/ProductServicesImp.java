package com.Second.Shop.shop.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.Second.Shop.shop.Model.Product;

@Service
public class ProductServicesImp implements ProductService {

    private Map<Integer, Product> productMap = new HashMap<>(); // create a hash map for the store the product
                                                                // infomation store by the object
    private int id = 0;

    @Override
    public Map<Integer, Product> getProduct() {
        return productMap;
    }

    @Override
    public Product getProductByID(int id) {
        return productMap.get(id);
    }

    @Override
    public Product SaveProduct(Product product) {
        product.setId(Nextgenid()); // product is the class under the class define the setter using setter we can
                                    // acces the id here we crete a 1 mehtod GEnnext id this method genrate the new
                                    // id when we create a new produt details
        productMap.put(product.getId(), product); // the put word is used to store the product in the hash map, (getId)
                                                  // thi is the uniq id thi is usingwe can perform the delet and update
                                                  // method
        return product; // retun the product name ,product number ,seller name info

    }

    @Override
    public String deleteProduct(int id) {
        if (productMap.get(id) == null) // The Book Not avilable Then show the msg book not Foud
            return "not found";
        productMap.remove(id);
        return "Delete Sucussfully";
    }

    @Override
    public Product UpdateMyProduct(int id, Product updateproduct) {
        Product existingProduct = productMap.get(id); // when we use put method we neet to exiting data get the existing
                                                      // product data from the id and in hash map
        existingProduct.setPName(updateproduct.getPName()); // update the product
        existingProduct.setSname(updateproduct.getSname());
        return existingProduct;
    }

    private int Nextgenid() { // crete a simple method to genrate a new id automatically

        return ++id;
    }
}
