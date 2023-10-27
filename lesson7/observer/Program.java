package geekbrains.lesson7.src.main.java.ru.geekbrains.lesson7.observer;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company geekBrains = new Company("GeekBrains", jobAgency);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Middle middle1 = new Middle("Midlle #1");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(middle1);
        Vacancy vac1 = new Vacancy(120000, "Middle", google);
        Vacancy vac2 = new Vacancy(95000, "Мастер", yandex);
        Vacancy vac3 = new Vacancy(98000, "Студент", geekBrains);
        for (int i = 0; i < 3; i++){
            vac1.needEmployee(vac1,google);
            vac2.needEmployee(vac2,yandex);
            vac3.needEmployee(vac3,geekBrains);
        }
    }

}
