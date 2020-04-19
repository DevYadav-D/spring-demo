package com.example.demo.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;

@Service
public class HomeService {
	
	private final UserDao userDao;
	
	public HomeService(UserDao userDao) {
		this.userDao=userDao;
	}

	public List<String> getData() {
		return userDao.getUserNames();
	}

}
