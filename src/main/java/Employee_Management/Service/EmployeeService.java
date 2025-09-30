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

    public ResponseEntity<Map<String , Boolean>> deleteEmployeeById(long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee Not found"));

        employeeRepository.delete(employee);

        Map<String, Boolean> response = new HashMap<>();
        response.put("delete",Boolean.TRUE);
        return  ResponseEntity.ok(response);
    }
}
