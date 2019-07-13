package com.codeup.springpractice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    /**
     * Return a Rest response to the URL "/hello" to sat "Hi"
     * */
    @RequestMapping("/hello") //maps only to GET method by default.
    public String sayHi(){
        return "Hi";
    }

}
