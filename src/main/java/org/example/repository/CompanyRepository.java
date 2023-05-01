package org.example.repository;

import org.example.classes.Company;

public interface CompanyRepository {
    void saveCompany(Company company);
    void deleteCompanyById(Long id);
    void update(Long id , Company company);
}
