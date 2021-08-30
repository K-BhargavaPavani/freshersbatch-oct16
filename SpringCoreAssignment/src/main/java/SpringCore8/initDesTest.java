package com.springcodes8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcodes8.initDesTest;

public class initDesTest{
public static void main(String[] args) throws Exception
{
    ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext("Spring8.xml");
 cap.close();
}
}