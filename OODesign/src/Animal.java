class Animal {
	
	int age;

	public Animal(int dogsAge) {
		age = dogsAge;
	}
  
	public void run(int feet) {
		System.out.println("Your animal ran " + feet + " feet!");
	}
  
	public int getAge() {
		return age;
	}
  
	public static void main(String[] args) {
	    Dog spike = new Dog(5);
	    spike.bark();
	    spike.run(40);
	    int spikeAge = spike.getAge();
	    System.out.println(spikeAge);
	
	    Cat spikee = new Cat(5);
	    spikee.meow();
	    spikee.run(40);
	    int spikeeAge = spikee.getAge();
	    System.out.println(spikeeAge);
	}

}