package org.example.controlller;

import org.example.entity.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    //CRUD -> READ
    @GetMapping()
    public List<Product> getProductAll() {
        return productService.getProductAll();
    }

    @GetMapping("/{barcode}")
    public Product getpProductByBarcodeFromURL(
            @PathVariable Integer barcode) {
        return productService.getProductByBarcode(barcode);
    }

    //CRUD -> CREATE
    @PostMapping()
    public ResponseEntity<Product> createNewProduct(@RequestBody Product product) {
        Product savedProduct = productService.saveProduct(product);
        ResponseEntity<Product> responseEntity = savedProduct!=null ?
                ResponseEntity.ok(productService.getProductByBarcode(product.getBarcode())) :
                ResponseEntity.status(400).body(new Product());
        return responseEntity;
    }
}
