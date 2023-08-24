package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.JobDetails;
import za.ac.cput.repository.IJobDetailsRepository;
import za.ac.cput.service.IJobDetailsService;

import java.util.List;

@Service
public class JobDetailsService implements IJobDetailsService {

    private IJobDetailsRepository jobDetailsRepository;

    @Autowired
    private JobDetailsService(IJobDetailsRepository jobDetailsRepository) {
        this.jobDetailsRepository = jobDetailsRepository;
    }

    @Override
    public JobDetails create(JobDetails jobDetails) {
        return jobDetailsRepository.save(jobDetails);
    }

    @Override
    public JobDetails read(String jobNumber) {
        return jobDetailsRepository.findById(jobNumber).orElse(null);
    }

    @Override
    public JobDetails update(JobDetails jobDetails) {
        if(this.jobDetailsRepository.existsById(jobDetails.getJobNumber()))
            return this.jobDetailsRepository.save(jobDetails);
        return null;
    }

    @Override
    public boolean delete(String jobNumber) {
        if(this.jobDetailsRepository.existsById(jobNumber)) {
            this.jobDetailsRepository.deleteById(jobNumber);
            return true;
        }
        return false;
    }

    @Override
    public List<JobDetails> getAll() {
        return jobDetailsRepository.findAll();
    }
}
