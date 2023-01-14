package MicroServices.AppGateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/usersServiceFallBack")
    public String usersServiceCallBack(){
        return "Users take more than expected!";
    }

    @GetMapping("/ReportServiceFallBack")
    public String ReportServiceCallBack(){
        return "Reports take more than expected!";
    }
}
