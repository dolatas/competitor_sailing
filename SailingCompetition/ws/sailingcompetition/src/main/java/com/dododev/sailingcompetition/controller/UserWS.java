package com.dododev.sailingcompetition.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dododev.sailingcompetition.model.BaseObject;
import com.dododev.sailingcompetition.model.Coach;
import com.dododev.sailingcompetition.model.Competitor;
import com.dododev.sailingcompetition.model.User;

@RestController
@RequestMapping("ws/user")
public class UserWS {

	@RequestMapping("/getAll")
    public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping("/getById/{userId}")
    public User getUser(@PathVariable Long userId) {
		// TODO Auto-generated method stub

		return null;
	}

}
