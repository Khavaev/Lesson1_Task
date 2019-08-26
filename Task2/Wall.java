package Task2;

public class Wall extends Obstacle {
    int height;

    public Wall (int height) {
        this.height = height;
    }

    public void doIt (Competitor competitor) {
        competitor.jump(height);
    }
}
