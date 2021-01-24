package catsanddogs;

public class Cat {
    private boolean isSatiety;

    public boolean isSatiety() {
        return isSatiety;
    }

    public void eat(Plate plate){
        isSatiety = plate.decrease(10);

    }
    @Override
    public String toString() {
        return "Cat" +
                "{" + "isSatiety=" + isSatiety +
                '}';
    }
}

