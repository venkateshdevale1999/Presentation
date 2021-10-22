package com.th.repository;

import java.util.ArrayList;
import java.util.List;

import com.th.model.Person;

public class Personrepo {
	
		List<Person> plist;
	
		public Personrepo()
		{
		plist = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setPfname("venky");
		p1.setPlname("devale");
		p1.setPpno(123456);
		
		
		Person p2 = new Person();
		p2.setPfname("Rajesh");
		p2.setPlname("devale");
		p2.setPpno(345678);
		
	
		
		plist.add(p1);
		plist.add(p2);
		
		
		}
		
		public List<Person> getpersons(){
			
			return plist;
		}

}
