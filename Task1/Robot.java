package Task1;

public class Robot {
    int run;
    double jump;

    public Robot (int run, double jump){
        this.run = run;
        this.jump = jump;
    }

    public void info (){
        System.out.println ("Робот бежит " + run + " метров");
        System.out.println ("Робот прыгает на высоту на " + jump + " метра");
    }

}
class MainRobot {

    public static void main(String[] args) {
        Robot robot1 = new Robot(350, 1.2);

        robot1.info();
    }

}