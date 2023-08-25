package section19.access1;

import java.io.Serializable;

public class PokemonVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String no;
	private String name;
	private String type;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
