package Car;

public class Car {
	
	private Engine engine;
	private Tire[] tires = new Tire[4];
	private Driver driver;
	
	public Car(Engine engine, Tire[] tires) {
		this.engine = engine;
		this.tires = tires;
	}
	
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public void run() {
		driver.drive();
		engine.start();
		for(Tire tire : tires) {
			tire.move();
		}
	}

	public static void main(String[] args) {
		Engine engine = new Engine("BRADY", "PATS", 2018);
		Tire[] tires = new Tire[4];
		for(int i=0; i<tires.length; i++) {
			tires[i] = new Tire("GOODYEAR" + " " + (i+1), "EUROTRACK", 2018);
		}
		Driver driver = new Driver("MAHOMES", 25, 1);
		Car car = new Car(engine, tires);
		car.setDriver(driver);
		car.run();
	}
}
