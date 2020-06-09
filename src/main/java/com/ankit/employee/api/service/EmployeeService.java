package com.ankit.employee.api.service;

import com.ankit.employee.api.model.Employee;
import com.ankit.employee.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAllEmploy() {
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> findByEmployeeId(Integer employeeId) {
        return employeeRepository.findById(employeeId);
    }

    public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
}
