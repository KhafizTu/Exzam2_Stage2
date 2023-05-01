package org.example.service;

import org.example.classes.Product;

public interface ProductService {
    void saveProduct(Product product);
    void findAllProductByCompanyId(Long id);
    void deleteProduct(Long id);
}
