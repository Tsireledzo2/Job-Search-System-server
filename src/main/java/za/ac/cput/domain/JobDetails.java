package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobDetails {
    @Id
    private String jobNumber;
    private String jobName;
    private String jobDescription;
    private String jobRequirements;
    private String jobLocation;
    private String companyName;

    public JobDetails() {}

    public JobDetails(Builder builder) {
        this.jobNumber = builder.jobNumber;
        this.jobName = builder.jobName;
        this.jobDescription = builder.jobDescription;
        this.jobRequirements = builder.jobRequirements;
        this.jobLocation = builder.jobLocation;
        this.companyName = builder.companyName;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public String getJobName() {
        return jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getJobRequirements() {
        return jobRequirements;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "JobDetails{" +
                "jobNumber='" + jobNumber + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobRequirements='" + jobRequirements + '\'' +
                ", jobLocation='" + jobLocation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public static class Builder{

        private String jobNumber;
        private String jobName;
        private String jobDescription;
        private String jobRequirements;
        private String jobLocation;
        private String companyName;

        public Builder setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }

        public Builder setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }

        public Builder setJobRequirements(String jobRequirements) {
            this.jobRequirements = jobRequirements;
            return this;
        }

        public Builder setJobLocation(String jobLocation) {
            this.jobLocation = jobLocation;
            return this;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder copy(JobDetails jobDetails) {
            this.jobNumber = jobDetails.jobNumber;
            this.jobName = jobDetails.jobName;
            this.jobDescription = jobDetails.jobDescription;
            this.jobRequirements = jobDetails.jobRequirements;
            this.jobLocation = jobDetails.jobLocation;
            this.companyName = jobDetails.companyName;
            return this;
        }

        public JobDetails build() {
            return new JobDetails(this);
        }
    }
}
