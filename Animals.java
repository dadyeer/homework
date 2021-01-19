package Animals.homework;

public abstract class Animals {
    public abstract void swim (int distance);
    public abstract void run (int distance);

    protected int maxDistanceRun;
    protected int maxDistanceSwim;

    public Animals (int maxDistanceRun, int maxDistanceSwim) {
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceSwim = maxDistanceSwim;
    }
}
