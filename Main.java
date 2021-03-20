import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String [] arr = {"a", "b", "c", "d"};
        Integer [] arr2 = {2,4,5,6,7,8,9};
        replace(arr, 0,3);
        replacement(arr2);

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
    }

    //№1
    public static <T> void replace (T [] arr, int ind1, int ind2) {
        T a = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = a;
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
    }

    //№2
    public static <T> void replacement (T [] arr){
        List <T> list = Arrays.asList(arr);
        System.out.println(list);
    }


    }


