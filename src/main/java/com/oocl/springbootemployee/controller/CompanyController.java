package com.oocl.springbootemployee.controller;

import com.oocl.springbootemployee.entity.Company;
import com.oocl.springbootemployee.repository.CompanyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("companies")
@RestController
public class CompanyController {
    private final CompanyRepository companyRepository;

    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companyRepository.getAll();
    }
}