package pas.au.pcf.springcloudgcp.spanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "employee")
public class Employee {

    @Id
    @PrimaryKey
    private String id;

    @Column (name = "name")
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
