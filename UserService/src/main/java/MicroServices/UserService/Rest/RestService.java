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
    public Report handleRestReport(long reportId) {
        log.info("Inside rest service -> report ");
        try {
            Report report = restTemplate.getForObject("http://REPORTS/report/"+reportId,Report.class);
            return report;
        }catch (Exception e)
        {
            return null;

        }

    }


}
