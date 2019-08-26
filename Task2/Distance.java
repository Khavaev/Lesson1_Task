package Task2;

public class Distance extends Obstacle{
    int distance;

    public Distance (int distance) {
        this.distance = distance;
    }

    public void doIt (Competitor competitor) {
        competitor.run(distance);
    }
}
