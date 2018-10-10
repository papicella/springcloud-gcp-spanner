package pas.au.pcf.springcloudgcp.spanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRest {
    private EmployeeRepository employeeRepository;

    public EmployeeRest(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping ("/emp-rest")
    public Iterable<Employee> getAll () {
        return employeeRepository.findAll();
    }
}
