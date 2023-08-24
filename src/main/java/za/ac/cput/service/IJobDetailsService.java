package za.ac.cput.service;

import za.ac.cput.domain.JobDetails;

import java.util.List;

public interface IJobDetailsService extends IService < JobDetails , String >  {

//    public List< JobDetails > getAll();
public List<JobDetails> getAll();
}
