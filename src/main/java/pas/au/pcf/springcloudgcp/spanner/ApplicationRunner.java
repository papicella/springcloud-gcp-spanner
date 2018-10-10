package pas.au.pcf.springcloudgcp.spanner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.stream.Stream;

@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {

    public ApplicationRunner(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private EmployeeRepository employeeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        employeeRepository.deleteAll();
        Stream.of ("pas", "lucia", "lucas", "siena")
                .map(name -> new Employee(UUID.randomUUID().toString(), name))
                .map(employeeRepository::save)
                .forEach(System.out::println);
    }
}
