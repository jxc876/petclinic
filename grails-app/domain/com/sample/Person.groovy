package com.sample

class Person {

	String firstName
	String lastName
	String email
	int age
	
	static hasMany = [pets:Pet]
	
    static constraints = {
    }
}
