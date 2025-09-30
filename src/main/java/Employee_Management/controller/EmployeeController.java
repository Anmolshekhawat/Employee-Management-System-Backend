package Employee_Management.controller;


import Employee_Management.Entity.Employee;
import Employee_Management.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/employees")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    // Create employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String ,Boolean>> deleteEmployee(@PathVariable long id)
    {
        return employeeService.deleteEmployeeById(id);
    }
}



