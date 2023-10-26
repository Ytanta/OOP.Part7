package geekbrains.lesson7.src.main.java.ru.geekbrains.lesson7.observer;

public class Master implements Observer{

    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getMaxSalary()&& new String(vacancy.getVacancy()).equals("Master")){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getMaxSalary());
            this.salary = vacancy.getMaxSalary();
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
