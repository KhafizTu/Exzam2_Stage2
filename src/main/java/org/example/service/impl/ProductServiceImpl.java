package org.example.service.impl;

import org.example.classes.Product;
import org.example.repository.ProductRepository;
import org.example.repository.impl.ProductRepositoryImpl;
import org.example.service.ProductService;

public class ProductServiceImpl implements ProductService {
    ProductRepository productService = new ProductRepositoryImpl();
    @Override
    public void saveProduct(Product product) {
        productService.saveProduct(product);

    }

    @Override
    public void findAllProductByCompanyId(Long id) {
    productService.findAllProductByCompanyId(id);
    }

    @Override
    public void deleteProduct(Long id) {
        productService.deleteProduct(id);
    }
}
