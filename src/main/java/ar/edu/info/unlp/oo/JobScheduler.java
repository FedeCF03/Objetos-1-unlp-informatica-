package ar.edu.info.unlp.oo;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected String strategy;

    public JobScheduler() {
        this.jobs = new ArrayList<>();
        this.strategy = "FIFO";
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public String getStrategy() {
        return this.strategy;
    }

    public List<JobDescription> getJobs() {
        return new ArrayList<>(jobs); // Return a copy to avoid external modification
    }

    public void setStrategy(String aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
        if (jobs.isEmpty()) {
            return null;
        }

        JobDescription nextJob = null;

        switch (strategy) {
            case "FIFO":
                nextJob = jobs.get(0);
                break;

            case "LIFO":
                nextJob = jobs.get(jobs.size() - 1);
                break;

            case "HighestPriority":
                nextJob = jobs.stream()
                    .max((j1, j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                    .orElse(null);
                break;

            case "MostEffort":
                nextJob = jobs.stream()
                    .max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                    .orElse(null);
                break;

            default:
                throw new IllegalArgumentException("Unknown strategy: " + strategy);
        }

        if (nextJob != null) {
            this.unschedule(nextJob);
        }

        return nextJob;
    }
}
