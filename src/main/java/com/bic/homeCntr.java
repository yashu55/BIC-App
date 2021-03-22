package com.bic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeCntr {

    @RequestMapping("/")
    public String home() {
	System.out.println("in method");
	return "<h1>home Yassshhhh</h1>";
    }
}
