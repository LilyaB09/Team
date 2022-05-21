package JavaCore_1;
import java.util.Random;

public class Course {
    private String[] obstacle = {"\"бег\"", "\"лыжи\"", "\"плавание\"", "\"стрельба\""};    //массив дистанций
    public void doIt(JavaCore_1.Team t) {             //участники,прошедшие дистанцию,определяются случайным образом
        Random random = new Random();
        t.setTest("дистанцию " + obstacle[new Random().nextInt(obstacle.length)]);
        Random random1 = new Random();
        for (int j =0; j < 4; j++) {
            t.setResult(j, random1.nextBoolean());
        }

    }

}