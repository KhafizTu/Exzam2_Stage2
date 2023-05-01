package org.example.service.impl;

import org.example.classes.Company;
import org.example.repository.CompanyRepository;
import org.example.repository.impl.CompanyRepositoryImpl;
import org.example.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
    CompanyRepository companyRepository = new CompanyRepositoryImpl();
    @Override
    public void saveCompany(Company company) {
        companyRepository.saveCompany(company);
    }

    @Override
    public void deleteCompanyById(Long id) {
    companyRepository.deleteCompanyById(id);
    }

    @Override
    public void update(Long id, Company company) {
    companyRepository.update(id,company);
    }
}
