package com.springcodes2;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class QuestionTest {  
public static void main(String[] args) {  
    Resource r=new ClassPathResource("Spring2.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Question q=(Question)factory.getBean("q");  
    q.displayInfo();  
      
}}

