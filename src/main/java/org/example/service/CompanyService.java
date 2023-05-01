package org.example.service;

import org.example.classes.Company;

public interface CompanyService {
    void saveCompany(Company company);
    void deleteCompanyById(Long id);
    void update(Long id , Company company);
}
