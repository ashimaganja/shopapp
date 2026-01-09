package com.twosix.shopapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Emperor {

    //@Autowired //field injection here
    private King king;

    //@Primary , @Qualifierf

    //constructor injection
    public Emperor(King king){
        this.king = king;
    }

    public void build(){
        king.speak();
        System.out.println("Ahahahahhahha");
    }
}
