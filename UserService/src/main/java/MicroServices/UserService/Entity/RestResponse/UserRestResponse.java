package MicroServices.UserService.Entity.RestResponse;

import MicroServices.UserService.Entity.User;
import MicroServices.UserService.Entity.VO.Report;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRestResponse {
    User user;
    Report report;
}
