package MicroServices.ReportsService.Repo;


import MicroServices.ReportsService.Entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long> {

}
