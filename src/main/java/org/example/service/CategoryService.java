package org.example.service;

import org.example.classes.Category;

public interface CategoryService {
    void saveCategory(Category category);
    void getAllProductGroupByCategoryName(Category category);
}
