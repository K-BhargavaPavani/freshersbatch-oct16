package com.springcodes2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	//private String answer;
	private List<String> answer;
	//private Set<String> answer;
public Question() {}  
public Question(int questionId, String question, List<String> answer
		) {  
    super();  
    this.questionId = questionId;  
    this.question = question;  
    this.answer = answer;  
}  
  
public void displayInfo(){  
    System.out.println(questionId +" "+ question);  
    System.out.println("Answer is:");  
    Iterator<String> itr= answer.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  }}