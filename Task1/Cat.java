package Task1;

public class Cat {
    int run;
    double jump;

    public Cat (int run, double jump){
        this.run = run;
        this.jump = jump;
    }

    public void info (){
        System.out.println ("Кошка бежит " + run + " метров");
        System.out.println ("Кошка прыгает на высоту на " + jump + " метра");
    }

}
class MainCat {

    public static void main(String[] args) {
        Cat cat1 = new Cat(200, 2.3);

        cat1.info();
    }
}
