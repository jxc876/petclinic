package com.sample

class Pet {

	String name
	String type
	int age
	
	static belongsTo = [owner:Person]
	
    static constraints = {
    }
}
