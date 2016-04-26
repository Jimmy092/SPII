package water;

public class SourceSegment extends RiverSegment implements HasPower{
	
	String source;

	public SourceSegment(String name, double length, double power, String subSource) {
		super(name, length, power);
		if(subSource==null){
			throw new IllegalArgumentException("Illegal value "+subSource);
		}
		this.source=subSource;
		// TODO Auto-generated constructor stub
	}

	public String getSource() {
		return source;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return super.getLength();
	}

	@Override
	public double longestPath() {
		// TODO Auto-generated method stub
		return this.getPower();
	}

	@Override
	public double getPower() {
		// TODO Auto-generated method stub
		return super.getPower();
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
