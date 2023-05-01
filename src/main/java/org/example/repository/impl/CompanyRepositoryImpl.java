package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import org.example.classes.Company;
import org.example.confg.HibernateConfig;
import org.example.repository.CompanyRepository;

public class CompanyRepositoryImpl implements CompanyRepository {

    private final EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public void saveCompany(Company company) {
        entityManager.getTransaction().begin();
        entityManager.persist(company);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(company.getName() + "is saved...");
    }

    @Override
    public void deleteCompanyById(Long id) {
        entityManager.getTransaction().begin();
        Company company = entityManager.find(Company.class, id);
        entityManager.remove(company);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("company is deleted...");
    }

    @Override
    public void update(Long id , Company company) {
        entityManager.getTransaction().begin();
        Company company1 = entityManager.find(Company.class, id);
        company1.setName(company.getName());
        company1.setCountry(company.getCountry());
        entityManager.merge(company1);
        System.out.println("Company is updated...");
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
