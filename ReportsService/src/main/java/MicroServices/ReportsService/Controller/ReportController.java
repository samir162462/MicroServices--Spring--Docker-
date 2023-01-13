package MicroServices.ReportsService.Controller;


import MicroServices.ReportsService.Entity.Report;
import MicroServices.ReportsService.Service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/report")
public class ReportController {

    final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }


    @GetMapping("/{reportId}")
    public Report getReport(@PathVariable Long reportId){
        log.info("Inside find Report of Controller ");

        return reportService.getReportById(reportId);
    }
    @PostMapping("/save")
    public ResponseEntity<?> addReport(@RequestBody Report report){
        log.info("Inside Save Report of Controller ");
        return  reportService.addReport(report);
    }
}
