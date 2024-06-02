package org.example.service;

import org.example.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductAll();

    Product getProductByBarcode(Integer barcode);
    Product saveProduct(Product product);
}
