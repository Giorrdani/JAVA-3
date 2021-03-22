import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box <T extends Fruit> {
    private final List <T> fruitList = new ArrayList<>();;


    private List<T> getFruitList(){
        return fruitList;
    }

    private void clear (){
        fruitList.clear();
    }

    public void show (List <T> box){
        List<T> list = box;
        System.out.println(list);
    }

    public double getWeight() {
        return fruitList.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public void put (T fruit){
        fruitList.add(fruit);
    }

    public void put (T... fruit){
        fruitList.addAll(Arrays.asList(fruit));
    }

    public void putAll (Box<T> box){
        fruitList.addAll(box.getFruitList());
        box.clear();
    }

    public <E extends Fruit> boolean compare (Box <E> box){
        return getWeight() == box.getWeight();
    }


}