package water;

public abstract class RiverSegment extends WaterBody implements HasPower{
	
	private double length;
	private double power;


	public RiverSegment(String name, double length, double power) {
		super(name);
		if(length<=0){
			throw new IllegalArgumentException("Illegal value "+length);
		}
		if(power<0){
			throw new IllegalArgumentException("Illegal value "+power);
		}
		this.length=length;
		this.power=power;
		// TODO Auto-generated constructor stub
	}

	public double getLength() {
		return length;
	}

	public double getPower() {
		return power;
	}
	
	public double longestPath(){
		return this.longestPath();
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


}
