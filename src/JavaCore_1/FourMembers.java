package JavaCore_1;
import java.util.Random;

public class FourMembers {
    public static void main(String[] args) {
        String[] s = {"Степан", "Богдан", "Кирилл", "Александр"};//инициализация массива участников
        JavaCore_1.Team team = new JavaCore_1.Team("\"Звезда\"", s );
        Course c = new Course();                             //массив из 4 дистанций
        team.showMembers();                                  //вывод всех участнииков команды на экран
        c.doIt(team);                                        //пройти дистанцию,выбранную рандомно
        team.showResults();                                  //вывод всех участнииков команды на экран
    }
}
