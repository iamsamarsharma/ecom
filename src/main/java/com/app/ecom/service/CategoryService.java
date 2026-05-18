package com.app.ecom.service;

import com.app.ecom.model.entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories();

    Category createCategory(Category category);

    void deleteCategory(Long id);
}
