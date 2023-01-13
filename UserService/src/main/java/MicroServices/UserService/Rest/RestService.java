package MicroServices.UserService.Rest;


import MicroServices.UserService.Entity.VO.Report;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Slf4j
@Service
public class RestService {

    RestTemplate restTemplate;

    @Autowired
    public RestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    //--------Rest Report Section---------
    public Report handleRestReport(long reportId) throws RuntimeException{
        log.info("Inside rest service -> report ");
        Report report = restTemplate.getForObject("http://localhost:8081/report/"+reportId,Report.class);

        return report;
    }


}
