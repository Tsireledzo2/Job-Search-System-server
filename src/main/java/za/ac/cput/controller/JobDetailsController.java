package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.JobDetails;
import za.ac.cput.service.impl.JobDetailsService;

import java.util.List;

@CrossOrigin(origins = " http://localhost:5173/")
@RestController
public class JobDetailsController {

    @Autowired
    public JobDetailsService jobDetailsService;
    @PostMapping("/createJob")
    public JobDetails create(@RequestBody JobDetails jobDetails){
        return jobDetailsService.create(jobDetails);
    }

    @GetMapping("/getJob/{jobNumber}")
    public JobDetails read(@PathVariable String jobNumber){
        return jobDetailsService.read(jobNumber);
    }

    @PostMapping("/updateJob")
    public JobDetails update(@RequestBody JobDetails jobDetails){
        return jobDetailsService.update(jobDetails);
    }

    @DeleteMapping("/deleteJob/{jobNumber}")
    public boolean delete(@PathVariable String jobNumber){
        return jobDetailsService.delete(jobNumber);
    }

    @GetMapping("/getAllJobs")
    public List<JobDetails> getAll(){
        return jobDetailsService.getAll();
    }
}
