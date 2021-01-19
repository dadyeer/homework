package Animals.homework;

public class Cat extends Animals {
    public Cat() {
        super(200, 0);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat cannot swim   ");

    }

    @Override
    public void run(int distance) {
        if (distance > maxDistanceRun) {
            System.out.println(String.format
                    ("Distance %s is to much for cat. Good distance is %s",
                            distance,
                            maxDistanceRun
                    ));
        } else {
            System.out.println("Cat is running   " + distance);
        }
    }
}
