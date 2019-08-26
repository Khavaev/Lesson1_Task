package Task2;

public class Competition implements Competitor{

    int runMax;
    int jumpMax;
    boolean active;


    public boolean onDistance () {
        return active;
    }

    public void run (int distance) {
        if (distance <= runMax) {
            System.out.println("Участник пробежал дистанцию");
        } else {
            System.out.println("Участник не смог пробежать дистанцию");
            active = false;
        }
    }

    public void jump (int height) {
        if (height < jumpMax) {
            System.out.println("Участник взял высоту");
        } else {
            System.out.println("Участник не взял высоту");
            active = false;
        }
    }

    public void info () {
        if (active == true) {
            System.out.println("Участник прошёл полосу препятствий");
        } else {
            System.out.println("Увчастник не прошёл полосу препятствий");
        }
    }
}
