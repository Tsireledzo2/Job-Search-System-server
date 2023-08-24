package za.ac.cput.factory;

import za.ac.cput.domain.JobDetails;

public class JobDetailsFactory {

    public static JobDetails buildJobDetails(
            String jobNumber,
            String jobName,
            String jobDescription,
            String jobRequirements,
            String jobLocation,
            String companyName)
    {

        JobDetails jobDetails = new JobDetails.Builder()
                .setJobNumber(jobNumber)
                .setJobName(jobName)
                .setJobDescription(jobDescription)
                .setJobRequirements(jobRequirements)
                .setJobLocation(jobLocation)
                .setCompanyName(companyName)
                .build();
        return jobDetails;
    }
}
