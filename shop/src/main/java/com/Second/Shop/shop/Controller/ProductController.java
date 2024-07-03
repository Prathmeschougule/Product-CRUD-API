package com.Second.Shop.shop.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.Second.Shop.shop.Model.Product;
import com.Second.Shop.shop.Service.ProductService;
import com.Second.Shop.shop.Service.ProductServicesImp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RequestMapping("Products") // here the (@RequestMapping("Products") we declere the out side of th class now
                            // product applye the all mappings no need to apply sepreatly on that the
                            // mapping
@RestController
public class ProductController { // call recive from the clint || call forword to the services -> response

    // object Creation in jvm and programer
    ProductService productService = new ProductServicesImp();

    // object creation -by spring ioc | dependacy indect (DI)- autowiring
    // @Autowired
    // ProductService productService;

    @GetMapping("/id")
    public Product ReadProductById(@PathVariable int id) {
        return productService.getProductByID(id);
    }

    @GetMapping
    public Map getAllproducts() {
        return productService.getProduct(); // call forwording to get getproduct
    }

    @PostMapping
    public Product CreatProduct(@RequestBody Product product) {
        return productService.SaveProduct(product); // call forward with parameter
    }

    @PutMapping("/{id}")
    public Product Updateproduct(@PathVariable int id, @RequestBody Product updateproduct) {

        return productService.UpdateMyProduct(id, updateproduct);
    }

    @DeleteMapping("/{id}")
    public String DeleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

}
