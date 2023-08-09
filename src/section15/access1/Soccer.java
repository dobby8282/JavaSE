package section15.access1;

public class Soccer implements Cloneable{
	
	public String team;
	public String location;
	public int since;
	public String league;
	
	public Soccer(
			String team,
			String location,
			int since,
			String league
			) {
		
		this.team = team;
		this.location = location;
		this.since = since;
		this.league = league;
	}
	
	@Override
	public String toString() {
		return team + "@" + league;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object callClone() throws CloneNotSupportedException {
		return clone();
	}
	
	
	
	

}


