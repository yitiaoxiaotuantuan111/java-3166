package com.delong.colletions.list;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
//静态导入
//import static java.util.Comparator.*;
//import static java.lang.Math.*;
/**
 * List常用的实现类：Vector ArrayList LinkedList
 * Vector和ArrayList的区别：
 * <p>
 * HashSet和HashMap
 */
public class ListExample
{
    public static void main (String[] args)
    {
        //        new  ListExample().testArrayListByString();
        new ListExample().testArrayListByObject();
    }

    public void testArrayListByString ()
    {
        List<String> list = new ArrayList<>();

        list.add("bbb");
        list.add("aaa");
        list.add("ddd");
        list.add("ccc");
        list.add("aaa");

        //        System.out.println(list.size());

        Collections.sort(list);

        System.out.println(list);

    }

    public void testArrayListByObject ()
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

        //        System.out.println(list);
        //以命名外部类的方式实现排序
        //        Collections.sort(list, new MyComparator());
        //        Collections.sort(list, new MyComparator()::compare);

        //以命名内部类的方式排序
        //        Collections.sort(list, new MyInnerComparator());

        //以匿名内部类的方式排序
        //        Collections.sort(list, new Comparator<Student>()
        //        {
        //            @Override
        //            public int compare (Student o1, Student o2)
        //            {
        //                return o1.getId() - o2.getId();
        //            }
        //        });

        //以lambda表达式的方式实现排序
        //lambda表达式语法： ->左边是匿名内部类中方法的形参，
        //右边是匿名内部类中方法的实现，
        //        Collections.sort(list, (Student o1, Student o2)
        //                -> {return o1.getId() - o2.getId();});

        //        Collections.sort(list, (a, b)
        //                -> {return a.getId() - b.getId();});


        //        System.out.println(list);

        //        list.forEach(new Consumer<Student>()
        //        {
        //            @Override
        //            public void accept (Student student)
        //            {
        //                System.out.println(student);
        //            }
        //        });

        //        list.forEach(abc -> System.out.println(abc));

        //        list.stream().forEach(a -> System.out.println(a));

        //         list.stream().filter(s ->  {return  s.getId() > 2;})
        //                 .forEach(s->System.out.println(s));


        list.sort(Comparator.comparing(Student::getId));

//        System.out.println(list);

        list.forEach(s -> System.out.println(s));
    }

    //以命名的内部类方式排序
    public class MyInnerComparator implements Comparator<Student>
    {
        @Override
        public int compare (Student o1, Student o2)
        {
            return o1.getName().compareTo(o2.getName());
        }
    }

}


