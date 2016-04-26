package water;

public class Sea extends StillWaterBody implements HasPower{

	private double power;
	
	public Sea(String name, double area, double power) {
		super(name, area);
		if(power<0){
			throw new IllegalArgumentException("Illegal value "+power);
		}
		this.power=power;
		// TODO Auto-generated constructor stub
	}

	public double getPower() {
		return power;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return super.getArea();
	}

}
