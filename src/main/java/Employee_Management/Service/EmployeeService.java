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


    public ResponseEntity<Employee> updateEmployee(Long id, Employee employee) {

        Employee oldEmployee  =  employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id:" + id));


        oldEmployee.setFirstName(employee.getFirstName());
        oldEmployee.setLastName(employee.getLastName());
        oldEmployee.setEmailId(employee.getEmailId());
        oldEmployee.setWorkRole(employee.getWorkRole());

        Employee updatedEmployee = employeeRepository.save(oldEmployee);
        return  ResponseEntity.ok(updatedEmployee);

    }
}
