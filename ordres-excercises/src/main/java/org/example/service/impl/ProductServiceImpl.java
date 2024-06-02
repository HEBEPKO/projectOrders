package org.example.service.impl;

import org.example.entity.Product;
import org.example.repository.ProductJPARepository;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    /**
     * @return
     */

    @Autowired
    private ProductJPARepository productJPARepository;
    @Override
    public List<Product> getProductAll() {
        return productJPARepository.findAll();
    }

    /**
     * @param barcode
     * @return
     */
    public Product getProductByBarcode(Integer barcode) {
        return productJPARepository.findById(barcode).get();
    }

    /**
     * @param product
     * @return
     */
    @Override
    public Product saveProduct(Product product) {
        return productJPARepository.save(product);
    }
}
