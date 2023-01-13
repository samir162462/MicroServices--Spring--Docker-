package MicroServices.UserService.Controller;


import MicroServices.UserService.Entity.RestResponse.UserRestResponse;
import MicroServices.UserService.Entity.User;
import MicroServices.UserService.Entity.VO.Report;
import MicroServices.UserService.Rest.RestService;
import MicroServices.UserService.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("users")
public class UserController {

    UserService userService;
    RestService restService;

    @Autowired
    public UserController(UserService userService, RestService restService) {
        this.userService = userService;
        this.restService = restService;
    }

    @GetMapping("/{userId}")
    public UserRestResponse getUser(@PathVariable Long userId){
        log.info("Inside Fetch User of Controller ");
        User user = userService.getUser(userId);
        Report report = restService.handleRestReport(user.getReportId());

        return new UserRestResponse(user,report);

    }

    @PostMapping({"/save"})
    public ResponseEntity<?> addReport(@RequestBody User user) {
        log.info("Inside Save User of Controller ");
        return this.userService.saveUser(user);
    }
}
