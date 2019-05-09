package com.makersacademy.acebook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.makersacademy.acebook.model.DuplicateCheck.findDuplicates;
import static com.makersacademy.acebook.model.LastBuiltIn.lastBuiltInTimer; //importing the last file
import static com.makersacademy.acebook.model.SortBuiltIn.sortBuiltInTimer; //importing the sort file
import static com.makersacademy.acebook.model.ShuffleBuiltIn.shuffleBuiltInTimer; //importing the shuffle file

@RestController
public class ApiController {

    @RequestMapping(value = "/api/sort") //going to the api endpoint
    public String sort() { return sortBuiltInTimer(); //returning the sortBuiltInTimer method in timer file
    }


    @RequestMapping(value = "/api/shuffle") //going to the api endpoint
    public String shuffle() { return shuffleBuiltInTimer(); //returning the shuffleBuiltInTimer method in timer file
    }

    @RequestMapping(value = "/api/last") //going to the api endpoint
    public String last() { return lastBuiltInTimer(); //returning the shuffleBuiltInTimer method in timer file
    }

    @RequestMapping(value = "/api/duplicate") //going to the api endpoint
    public String duplicate() { return findDuplicates(); //returning the shuffleBuiltInTimer method in timer file
    }

}

//have 2 separate controllers because this one is returning JSON and the other is returning html