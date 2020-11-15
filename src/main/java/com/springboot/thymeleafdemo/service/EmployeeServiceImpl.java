package com.springboot.thymeleafdemo.service;

import com.springboot.thymeleafdemo.dao.EmployeeRepository;
import com.springboot.thymeleafdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee employee = null;

        if(result.isPresent()){
            employee = result.get();
        }
        else {
            throw new RuntimeException("Did not find employee id - " + id);
        }

        return employee;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void prepareStartData(){

        if (findAll().isEmpty()) {

            Employee employee1 = new Employee(
                    "Employee1",
                    "Employee1",
                    "employee1@mail.com"
            );

            Employee employee2 = new Employee(
                    "Employee2",
                    "Employee2",
                    "employee2@mail.com"
            );

            Employee employee3 = new Employee(
                    "Employee3",
                    "Employee3",
                    "employee3@mail.com"
            );

            save(employee1);
            save(employee2);
            save(employee3);
        }
    }
}
