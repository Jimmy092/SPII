package water;

public class ConfluenceSegment extends RiverSegment implements HasPower {
	
	private RiverSegment right;
	private RiverSegment left;
	
	public ConfluenceSegment(String name, double length, double power, RiverSegment right, RiverSegment left) {
		super(name, length, power);
		if(right==null||left==null){
			throw new IllegalArgumentException("null value found");
		}
		this.left=left;
		this.right=right;
		// TODO Auto-generated constructor stub
	}

	public RiverSegment getRight() {
		return right;
	}

	public RiverSegment getLeft() {
		return left;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return super.getLength();
	}

	@Override
	public double longestPath() {
		// TODO Auto-generated method stub
		return this.getLength()+Math.max(right.getLength(),left.getLength());
	}

	public double getPower() {
		// TODO Auto-generated method stub
		return super.getPower()+right.getPower()+left.getPower();
	}
	
	public double getSinglePower() {
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
