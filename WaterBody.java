package water;

public class WaterBody {
	
private String name;
	
	public WaterBody(String name) {
		if(name==null){
			throw new IllegalArgumentException("null value found");
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "WaterBody [name=" + name + "]";
	}
/**
 * 	
 * @param WTArray
 * @return the most powerful waterbody in the array, returns null if there are no waterbodies that produce power
 */
public static WaterBody mostPowerful(WaterBody[] WTArray){
		
		if(WTArray==null){
			throw new IllegalArgumentException("null array");
		}
		
		WaterBody result = null;
		
		for(int i=0; i<WTArray.length-1; i++){
			if(WTArray[i] instanceof HasPower){
				if(result == null){
					result = WTArray[i];
				} else {
					HasPower currentElement = (HasPower)WTArray[i];
					HasPower temp = (HasPower)result;
					if(currentElement.getPower() > temp.getPower()){
						result = WTArray[i];
					}
				}
			}
		}
		return result;
	}
}
