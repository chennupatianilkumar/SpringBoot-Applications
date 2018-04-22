package com.egiants.SpringBoot;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/getStudent")
    public Student getStudent(Student st)
    {
    	//return "hi";
    	
    	//Student st = new Student();
    	st.setName("sairam");
    	st.setCountry("India"); 
    	 
    	
    	return st;  
    }
}