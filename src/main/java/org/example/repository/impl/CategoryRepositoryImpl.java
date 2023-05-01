package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import org.example.classes.Category;
import org.example.classes.Product;
import org.example.confg.HibernateConfig;
import org.example.repository.CategoryRepository;

import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    private final EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public void saveCategory(Category category) {
        entityManager.getTransaction().begin();
        entityManager.persist(category);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(category.getName() + "is saved...");
    }

    @Override
    public void getAllProductGroupByCategoryName(Category category) {
        entityManager.getTransaction().begin();
        List<Product> products = entityManager.createQuery("select p from Product p ", Product.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(products);
        System.out.println(products);

    }
}
