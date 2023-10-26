package geekbrains.lesson7.src.main.java.ru.geekbrains.lesson7.observer;

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(String companyName, Vacancy vacancy);

}
