package com.delong.colletions.list;

import sun.net.www.content.text.Generic;

import java.util.ArrayList;

public class GenericExample<T, T2, S, S2>
{

    public static void main (String[] args)
    {
        int[] i={1,2,3,4,5};
        //通配字元
        GenericExample<?, ?, ?, ?> g1  =  new GenericExample<>();


        //capture

    }

    public <S> void compute(T n1, T2  n2, S  s1)
    {

    }

    public void test(S n1, S2  n2, T  t1)
    {

    }
}
