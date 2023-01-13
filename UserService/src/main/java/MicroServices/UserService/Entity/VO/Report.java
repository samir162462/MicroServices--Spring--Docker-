package MicroServices.UserService.Entity.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {

    long reportId;
    String reportName;
    String reportLocation;
    String data;

}
