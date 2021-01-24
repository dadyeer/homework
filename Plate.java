package catsanddogs;

public class Plate {
    public int size;
    public int capasity;

    public Plate() {
        this(25,25);
    }

    public Plate(int size, int capasity) {
        this.size = size;
        this.capasity = capasity;
    }

    public boolean decrease(int requestSize){
        if(requestSize>size){
            return false;
        }
        size -= requestSize;
        return true;
    }
    public void addfood(int size){
        if(size<=capasity){
            int temp = this.size + size;
            this.size = temp <=capasity?temp:capasity;

        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "size=" + size +
                '}';
    }
}
