package pas.au.pcf.springcloudgcp.spanner;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository <Employee, String> {
}
