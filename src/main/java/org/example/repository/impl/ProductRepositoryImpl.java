package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import org.example.classes.Company;
import org.example.classes.Product;
import org.example.confg.HibernateConfig;
import org.example.repository.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private final EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public void saveProduct(Product product) {
        entityManager.getTransaction().begin();
        entityManager.persist(product);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("is saved...");
    }

    @Override
    public void findAllProductByCompanyId(Long id) {
        entityManager.getTransaction().begin();
        Product product = entityManager.find(Product.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(product);
    }

    @Override
    public void deleteProduct(Long id) {
        entityManager.getTransaction().begin();
        Product product = entityManager.find(Product.class, id);
        entityManager.remove(product);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("is deleted...");
    }
}
