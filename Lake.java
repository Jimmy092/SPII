package water;

public class Lake extends StillWaterBody {
	
	private String land;

	public Lake(String name, double area, String landMass) {
		super(name, area);
		if(landMass==null){
			throw new IllegalArgumentException("Illegal value "+landMass);
		}
		this.land=landMass;
		// TODO Auto-generated constructor stub
	}

	public String getLand() {
		return land;
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
