package com.rizomm.m2.cours1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySecondService {

	@Autowired
	MyFirstService mf;
	
	public int myFunction() {
		return 0;
	}
	
	public int mySecondFunction() {
		return mf.myFirstFunction();
	}
}