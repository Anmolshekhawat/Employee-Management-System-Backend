package Employee_Management.Service;

import Employee_Management.Entity.Employee;
import Employee_Management.Exception.ResourceNotFoundException;
import Employee_Management.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;



    public Employee save(Employee employee) {
        return  employeeRepository.save(employee);
    }

    public ResponseEntity<Employee> getEmployeeById(Long id) {

        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));
        return ResponseEntity.ok(employee);
    }

}
