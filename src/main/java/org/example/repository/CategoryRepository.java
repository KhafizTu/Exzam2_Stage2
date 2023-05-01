package org.example.repository;

import org.example.classes.Category;

public interface CategoryRepository {
    void saveCategory(Category category);
    void getAllProductGroupByCategoryName(Category category);
}
