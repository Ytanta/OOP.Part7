package geekbrains.lesson7.src.main.java.ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company implements Vacanc {

    private Random random = new Random();

    private String name;

    public String getName() {
        return name;
    }

    private Publisher jobAgency;

    private int maxSalary;

    private String vacancy;

    public Company(String name, Publisher jobAgency ) {
        this.name = name;
        this.jobAgency = jobAgency;
//        this.maxSalary = maxSalary;
//        this.vacancy = vacancy;
    }

    public void needEmployee(Vacancy vacancy){
       jobAgency.sendOffer(name, vacancy);
    }

    @Override
    public void tableVacancy(String name, Publisher jobAgency, int maxSalary, String vacancy) {



    }
}
