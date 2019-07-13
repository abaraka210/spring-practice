package com.codeup.springpractice;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            //constructor calls
            new Topic("one", "torfu","berri atat"),
            new Topic("two", "torasdffu","berasdffadsri atasdfasdfat"),
            new Topic("three", "toafdrfu","berasdfadfri ataadfasdft"),
            new Topic("four", "asdf","berri atadfasdfasdfat")
    );

    public List<Topic> getAllTopics(){
        return topics;
    }

}
