package ru.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class DuplicatesOfValuesTest {

    private Integer[] original = {1, 2, 3, 4, 1, 2, 3, 3, 5, 6, 2, 3, 1};
    private List<Integer> originalList = Arrays.asList(original);

    private Integer[] notUnique = {1, 2, 3, 3, 2, 3, 1};
    private List<Integer> notUniqueList = Arrays.asList(notUnique);

    private Integer[] unique = {1, 2, 3, 4, 5, 6};
    private List<Integer> uniqueList = Arrays.asList(unique);

    @Test

    public void duplicatesTest() {

        DuplicatesOfValues d = new DuplicatesOfValues();

        System.out.println("original list is: " + d.Duplicates(originalList).get("originalList"));
        System.out.println("unique list is: " + d.Duplicates(originalList).get("uniqueList"));
        System.out.println("not unique list is: " + d.Duplicates(originalList).get("notUniqueList"));


        Assert.assertEquals(d.Duplicates(originalList).get("originalList"), originalList);
        Assert.assertEquals(d.Duplicates(originalList).get("uniqueList"), uniqueList);
        Assert.assertEquals(d.Duplicates(originalList).get("notUniqueList"), notUniqueList);

    }
}