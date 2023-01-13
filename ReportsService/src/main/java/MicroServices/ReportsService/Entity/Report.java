package MicroServices.ReportsService.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long reportId;
    String reportName;
    String reportLocation;
    String data;

}
