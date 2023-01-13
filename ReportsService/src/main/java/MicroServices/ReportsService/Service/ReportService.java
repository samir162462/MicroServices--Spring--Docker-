package MicroServices.ReportsService.Service;


import MicroServices.ReportsService.Entity.Report;
import MicroServices.ReportsService.Exception.ReportNotFoundException;
import MicroServices.ReportsService.Repo.ReportRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class ReportService {

    ReportRepository reportRepository;


    @Autowired
    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }


    public Report getReportById(Long reportId) {
        log.info("Inside find Report of Service ");

        Optional<Report> report = Optional.ofNullable(reportRepository.findById(reportId).orElseThrow(() -> new ReportNotFoundException("The Report not found with this ID" + reportId)));
        return report.get();
    }

    public ResponseEntity<?> addReport(Report report) {
        log.info("Inside Save Report of Service ");

        return ResponseEntity.of(Optional.of(reportRepository.save(report)));
    }
}
