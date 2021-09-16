package com.delong.colletions.list;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>
{
    @Override
    public int compare (Student o1, Student o2)
    {
        return o2.getId() - o1.getId();
    }
}
