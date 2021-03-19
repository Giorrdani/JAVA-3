import java.util.ArrayList;
import java.util.List;

class Box <T extends Fruit> {
    Apple apple = new Apple();
    Orange orange = new Orange();
    float weightBox = 0.0f;

    public void show (List <T> box){
        List<T> list = box;
        System.out.println(list);
    }

    public float getWight (List <T> box) {
            for (T x : box) {
                if (x instanceof Apple) {
                    weightBox += apple.weight;
                }if (x instanceof Orange){
                    weightBox += orange.weight;
                }
            }
        return weightBox;
    }

    public boolean compare (Box box){
        if (this.weightBox == box.weightBox) {
            return true;
        }
        return false;
    }

    public void transfer (List <T> box){

    }

    public void addFruit (Object obj) {

    }

}