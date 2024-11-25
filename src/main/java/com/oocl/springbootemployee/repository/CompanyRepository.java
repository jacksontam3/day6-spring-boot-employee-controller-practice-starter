package com.oocl.springbootemployee.repository;

import com.oocl.springbootemployee.entity.Company;
import com.oocl.springbootemployee.entity.Employee;
import com.oocl.springbootemployee.entity.Gender;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CompanyRepository {
    List<Company> companies = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();

    public CompanyRepository() {
        Employee jackson = new Employee(1L, "Jackson", 18, Gender.FEMALE, 90000.0);
        Employee don = new Employee(2L, "Don", 18, Gender.MALE, 50000.0);
        Employee zane = new Employee(3L, "Zane", 18, Gender.MALE, 10000.0);
        employees.add(jackson);
        employees.add(don);
        employees.add(zane);
        companies.add(new Company(1L, "Company1", employees));
        companies.add(new Company(2L, "Company2"));
        companies.add(new Company(3L, "Company3"));
    }

    public List<Company> getAll() {
        return companies;
    }
}