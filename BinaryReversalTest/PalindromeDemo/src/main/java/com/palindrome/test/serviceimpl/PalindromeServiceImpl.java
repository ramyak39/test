package com.palindrome.test.serviceimpl;

import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.palindrome.test.bean.Bean;
import com.palindrome.test.repository.PalindromeRepository;
import com.palindrome.test.util.Util;


@Component
public class PalindromeServiceImpl {

	@Autowired
	private PalindromeRepository repository;
	
	public Bean storePalindrome(String input) {
		Bean bean = getLargestPalindrome(input);
		return repository.save(bean);		
	}
	
	private Bean getLargestPalindrome(String input) {
		StringTokenizer st = new StringTokenizer(input," ");
		String ps = "";
		while(st.hasMoreTokens()) {  
			StringBuilder sb = new StringBuilder(st.nextToken());
			if(sb.length() > ps.length() && sb.toString().equalsIgnoreCase(sb.reverse().toString())) {
					ps = sb.toString();
			} 
	    } 
		Bean bean = new Bean();
		bean.setId(Util.getShortGUID());
		bean.setValue(ps);
		return bean;
	}

	public Bean getPalindromeById(String id){
		return repository.findById(id).get();
	}
	
	public List<Bean> getAll(){
		return repository.findAll();
	}
}