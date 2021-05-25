// package Solution.FrescoArrayList;

public class Passenger {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	float fare;

	public Passenger(int id, float fare)
	    {
	        this.id=id;
	        this.fare=fare;
	    }
}
