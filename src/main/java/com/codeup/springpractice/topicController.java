package com.codeup.springpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class topicController {
    //instance of the service class
    @Autowired
    private TopicService topicService;

    /**
     * a json respond with a list of topics (array of topics)
     * /**>>>The generated JSON has key  names corresponding to property names of the Topic class.
     * the JSON values are the values of those properties.**/
    @RequestMapping("/topics") //maps only to GET method by default.
    public List<Topic> getAllTopics(){

        return topicService.getAllTopics();
    }

}
