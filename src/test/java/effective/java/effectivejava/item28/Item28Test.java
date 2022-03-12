package effective.java.effectivejava.item28;

import effective.java.effectivejava.item29.code.BWCT;
import effective.java.effectivejava.item28.code.GenericArray;
import effective.java.effectivejava.item28.code.GenericList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Item28Test {

    @Test
    void test1() {

        GenericArray<Object> genericArray = new GenericArray<>();
        GenericArray<String> stringArray = new GenericArray<>();

        Object[] objectArray = genericArray.getArray();

        objectArray = stringArray.getArray();
        //공변


        GenericList<Object> genericList = new GenericList<>();

        List<Object> objects = new ArrayList<>();
        List<Object> list = genericList.getList();
        list = objects;
        GenericList<String> stringList = new GenericList<>();

        //List<String> strings = list; 에러, 불공변
    }

    @Test
    void test2() {
        BWCT<Integer> bwct = new BWCT<>();

        List<Integer> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        bwct.test(listA, listB);
    }
}
