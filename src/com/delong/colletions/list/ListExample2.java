package com.delong.colletions.list;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample2
{


    /**
     * 高阶函数：
     * 1. 函数名可以作为变量的值
     * 2. 函数名可以作为另一个函数的参数：行为的参数化
     * 3. 函数名可以作为一个函数的返回值
     */
    public static void main (String[] args)
    {
        new ListExample2().testArrayListByObject();
        new ListExample2().testStream();

        //testVarParam(new int[]{1, 3, 2, 5});
        //testVarParam("zhhangsan", 12,32,35);
    }

    public static void testVar98Param(String name, int... nums)
    {
        System.out.println(name + ", " + Arrays.toString(nums));
    }

    public void testArrayListByObject ()
    {
        List<Student> list = testData();

        //        Collections.sort(list, new Comparator<Student>()
//        {
//            @Override
//            public int compare (Student o1, Student o2)
//            {
//                return o1.getId() - o2.getId();
//            }
//        });
//
//        for (Student student : list)
//        {
//            System.out.println(student);
//        }

        list.sort(Comparator.comparing(Student::getId));

//        list.forEach(s -> System.out.println(s));

    }

    private List<Student> testData ()
    {
        Student s1 = new Student(1, "zhangsan");
        Student s2 = new Student(2, "lisi");
        Student s3 = new Student(3, "wangwu");
        Student s4 = new Student(4, "zhaoliu");
        Student s5 = new Student(5, "chenqi");

        List<Student> list = new ArrayList<>();

        list.add(s2);
        list.add(s5);
        list.add(s4);
        list.add(s3);
        list.add(s1);
        return list;
    }

    private void testStream ()
    {
        List<Student> list = testData();
        //       Stream<Student> stream = list.stream();
        //       stream.forEach(s -> System.out.println(s));

        //        list.stream().filter(s -> s.getId() >= 2).
        //                forEach(s -> System.out.println(s));
        //
        //        list.stream().filter(s -> s.getId() >= 2).
        //                forEach(s -> System.out.println(s));
        //并行流
        //        list.stream().forEach(s -> System.out.println(s));

        list.stream().forEach(System.out::println);
    }

}


