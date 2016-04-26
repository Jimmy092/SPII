package water;

public class RiverNetwork extends WaterBody {
	
	private StillWaterBody flowingInto;
	private RiverSegment last;

	public RiverNetwork(String name, RiverSegment riverMouth, StillWaterBody end) {
		super(name);
		if(riverMouth==null){
			throw new IllegalArgumentException("null value found "+riverMouth);
		}
		if(end==null){
			throw new IllegalArgumentException("null value found "+end);
		}
		this.flowingInto=end;
		this.last=riverMouth;
		// TODO Auto-generated constructor stub
	}
	
	public double powerGenerated(){
		return last.getPower();
	}
	
	public double maxLength(){
		return last.longestPath();
	}

	public StillWaterBody getFlowsInto() {
		return flowingInto;
	}

	public RiverSegment getRiver() {
		return last;
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
