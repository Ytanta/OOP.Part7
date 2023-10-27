package geekbrains.lesson7.src.main.java.ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company  {

    private Random random = new Random();

    private String name;

    public String getName() {
        return name;
    }

    private Publisher jobAgency;

    public Publisher getJobAgency() {
        return jobAgency;
    }

    private int maxSalary;

    private String vacancy;

    public Company(String name, Publisher jobAgency ) {
        this.name = name;
        this.jobAgency = jobAgency;
    }


}
