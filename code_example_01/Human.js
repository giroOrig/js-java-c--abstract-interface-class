export class Human{

	constructor(name, age){
		this.name = name;
		this.age = age;
		this.createHuman();
	}

	getName(){
		return this.name;
	}

	getAge(){
		return this.age;
	}

	createHuman(){
		alert("Persona creada");
	}
}

class Student extends Human{
    constructor(name, age, ID){
		super(name, age);
		this.ID = ID;
	}

	createHuman(){
		alert("Estudiante creado");
	}

	getId(){
		return this.ID;
	}
}