package org.example;

import org.example.classes.Category;
import org.example.classes.Company;
import org.example.classes.Product;
import org.example.confg.HibernateConfig;
import org.example.repository.CategoryRepository;
import org.example.service.CategoryService;
import org.example.service.CompanyService;
import org.example.service.ProductService;
import org.example.service.impl.CategoryServiceImpl;
import org.example.service.impl.CompanyServiceImpl;
import org.example.service.impl.ProductServiceImpl;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        HibernateConfig.getEntityManager();
        Company company1 = new Company("ASD","Kazakh");
        Company company2 = new Company("KYT","Kyrgyz");
        Company company3 = new Company("DAS","USA");
        Company company4 = new Company("RUS","Russia");

        CompanyService service1 = new CompanyServiceImpl();
        service1.saveCompany(company3);
        service1.deleteCompanyById(1L);
        service1.update(1L,company4);


        Category category1 = new Category("Vegetables");
        Category category2 = new Category("Fruit");

        CategoryService service = new CategoryServiceImpl();
        service.saveCategory(category2);
        service.getAllProductGroupByCategoryName(category1);


        Product product1 = new Product("Potatoes", LocalDate.of(2023,1,1),35);
        Product product2 = new Product("Tomato", LocalDate.of(2023,1,1),40);
        Product product3 = new Product("Bulb", LocalDate.of(2023,1,1),30);
        Product product4 = new Product("Cucumber", LocalDate.of(2023,1,1),25);

        ProductService product = new ProductServiceImpl();
        product.saveProduct(product3);
        product.deleteProduct(1L);
        product.findAllProductByCompanyId(1L);

    }

}
