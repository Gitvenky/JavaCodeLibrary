package com.venkatesh.collections;

import java.util.HashMap;
import java.util.Set;

import com.venkatesh.Joda.TimeAndDate;

public class HashMapLearning {

	public static void main(String[] args) {

		HashMap<String, String> bankNamesMap =  new HashMap<>();
		bankNamesMap.put("SBI", "State Bank Of India");
		bankNamesMap.put("SBH", "State Bank Of Hyd");
		
		Set<String> bankCodeSet = bankNamesMap.keySet();
		System.out.println(bankCodeSet);
		System.out.println(bankNamesMap.entrySet().toString());
		
		TimeAndDate tad1=  new TimeAndDate();
		TimeAndDate tad2=  new TimeAndDate();
		TimeAndDate tad3=  new TimeAndDate();
		System.out.println("the HashCodes of the three Time are "+tad1.hashCode()+", "
				+tad2.hashCode()+", "+ tad3.hashCode());
	}

}