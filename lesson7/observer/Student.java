package geekbrains.lesson7.src.main.java.ru.geekbrains.lesson7.observer;

public class Student implements Observer{

    private String name;
    private int salary = 2000;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (this.salary <= vacancy.getMaxSalary()&& new String(vacancy.getVacancy()).equals("Студент")){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy.getMaxSalary());
            this.salary = vacancy.getMaxSalary();

        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
