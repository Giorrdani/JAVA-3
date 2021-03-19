import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        String [] arr = {"a", "b", "c", "d"};
        Integer [] arr2 = {2,4,5,6,7,8,9};
        replace(arr, 0,3);
        replacement(arr2);*/

        List<Apple> appleList = new ArrayList<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();

        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);
        appleList.add(apple5);
        appleList.add(apple6);

        List<Orange> orangeList = new ArrayList<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        orangeList.add(orange1);
        orangeList.add(orange2);
        orangeList.add(orange3);
        orangeList.add(orange4);


        Box boxForApple = new Box();
        System.out.println(boxForApple);
        boxForApple.show(appleList);

/*
        System.out.println(boxForApple.getWight(appleList));


        Box boxForOrange = new Box();
        System.out.println(boxForOrange.getWight(orangeList));


        System.out.println(boxForApple.compare(boxForOrange));
*/
    }
    //№1
/*
    public static void replace (Object [] arr, int ind1, int ind2) {
        Object a = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = a;
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }
    //№2
    public static void replacement (Object [] arr){
        List list = Arrays.asList(arr);
        System.out.println(list);
    }
*/


}
