package com.delong.colletions.list;

import java.io.*;

public class TryCatchExample
{
    //阻塞式IO
    //IO的分类：字节流和字符流
    public void test ()
    {
        File file = new File("test.txt");

        //jdk1.7:try-with-resource:
        // 实现Closeable或AutoCloseable接口的类
        try( OutputStream os = new FileOutputStream(file);
                OutputStream os2 = new FileOutputStream(file);
        )
        {
            os.write(new byte[]{});
        }//多个catch合并成一个catch的前提是
        // 每一个catch捕获的异常之间不能有继承关系
        catch ( ExceptionInInitializerError | IOException e)
        {
            e.printStackTrace();
        }


    }
}
