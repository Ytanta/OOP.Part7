package geekbrains.lesson7.src.main.java.ru.geekbrains.lesson7.observer;

import java.util.Random;

class Vacancy {
    private Random random = new Random();
    private int maxSalary;

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public String getVacancy() {
        return vacancy;
    }

    private String vacancy;
    private Company company;

    public Vacancy(int maxSalary, String vacancy, Company company) {
        this.maxSalary = random.nextInt(maxSalary);
        ;
        this.vacancy = vacancy;
        this.company = company;
    }

    public void needEmployee(Vacancy vacancy, Company company) {
        company.getJobAgency().sendOffer(company.getName(), vacancy);
    }
}


