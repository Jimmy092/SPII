package water;

public abstract class StillWaterBody extends WaterBody {
	
	private double area;

	public StillWaterBody(String name, double area) {
		super(name);
		if(area<=0){
			throw new IllegalArgumentException("Illegal value "+ area);
		}
		this.area=area;
		// TODO Auto-generated constructor stub
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

	public double getArea() {
		return area;
	}

}
