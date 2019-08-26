package Task1;

public class Human {
    int run;
    double jump;

    public Human (int run, double jump){
        this.run = run;
        this.jump = jump;
    }

    public void info (){
        System.out.println ("Человек бежит " + run + " метров");
        System.out.println ("Человек прыгает на высоту на " + jump + " метра");
    }

}
class MainHuman {

    public static void main(String[] args) {
        Human human1 = new Human(150, 1.5);

        human1.info();
    }

}