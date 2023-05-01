package org.example.repository;

import org.example.classes.Product;

public interface ProductRepository {
    void saveProduct(Product product);
    void findAllProductByCompanyId(Long id);
    void deleteProduct(Long id);

}
