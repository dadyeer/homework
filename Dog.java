package Animals.homework;

public class Dog extends Animals{
    public Dog() {
        super(500, 10);
    }

    @Override
    public void swim(int distance) {
        if(distance > maxDistanceSwim) {
            System.out.println(String.format
                    ("Distance %s is to much for dog. Good distance is %s",
                            distance,
                            maxDistanceSwim
                    ));
        }else {
        System.out.println("Dog is swimming   "+ distance);
        }

    }

    @Override
    public void run(int distance) {
        if(distance > maxDistanceRun) {
            System.out.println(String.format
                    ("Distance %s is to much for Dog. Good distance is %s",
                            distance,
                            maxDistanceRun
                    ));
        }else {
        System.out.println("Dog is running   "+ distance);
        }

    }
}
