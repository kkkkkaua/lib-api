package api.domain.enums;

import java.util.HashMap;
import java.util.Map;

public enum StreetType {
	STREET("Street"),
	AVENUE("Avenue"),
	BOULEVARD("Boulevard"),
	ROAD("Road"),
	SQUARE("Square"),
	ALLEY("Alley"),
	PARKWAY("Parkway");
	
	  private static final Map<String, StreetType> streetTypeMap = new HashMap<>();

	  static {
			for (StreetType streetType : StreetType.values()) {
			    streetTypeMap.put(streetType.getType(), streetType);
			}
	  }
	
	private String type;
	
	private StreetType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
    public static StreetType getStreetType(String type) {
        return streetTypeMap.get(type);
    }
}
