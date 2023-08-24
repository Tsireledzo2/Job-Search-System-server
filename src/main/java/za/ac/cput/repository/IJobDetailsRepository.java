package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.JobDetails;

import java.util.List;

@Repository
public interface IJobDetailsRepository extends JpaRepository< JobDetails , String > {
//    public List< JobDetails > getAll();
//public List<JobDetails> getAll();
}
