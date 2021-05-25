package com.fresco;
import java.util.List;
class Passanger
{
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
    public Passanger(int id, float fare)
    {
        this.id=id;
        this.fare=fare;
    }
}
public class BusProb {
	public String output(int capacity, int stops, List<String> listOfInputStrings, String query) {
		String outstring = "";
		ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
		ArrayList<String> passengerIn = new ArrayList<String>();
		ArrayList<String> passengerOut = new ArrayList<String>();
		ArrayList<String> passengerPays06 = new ArrayList<String>();
		ArrayList<String> passengerPays03 = new ArrayList<String>();
		ArrayList<String> passengerPays = new ArrayList<String>();
        int onTheBus=0;
        int outTheBus=0;

		// looping through number of stops
		for (int i = 0; i < stops; i++) {
            int currentPassCount = 0;
            float fare = 0f;
            
				// split listOfInputStrings to get all passengers
				String[] currentPass = listOfInputStrings.get(i).split(" ");

				currentPassCount = passengerIn.size();
				// looping through each passenger at one stop to count number of passengers in bus
				for (String p : currentPass) {
					// storing sign to add/remove passenger
					char sign = p.charAt(0);
					if (sign == '+') {
                        onTheBus++;
						currentPassCount+=1;
					} else {
                        outTheBus++;
						currentPassCount-=1;
					}
                    // System.out.println("passenger id = "+p+",currentcount = "+currentPassCount);
				}

				// calculating fare till current stop
				if (currentPassCount <= Math.ceil((double) capacity / 4)) {
					fare = (float) (capacity + capacity * 0.6);
				} else if (currentPassCount <= Math.ceil((double) capacity / 2)) {
					fare = (float) (capacity + capacity * 0.3);
				} else {
					fare = (float) capacity;
				}
                
                // looping through each passenger at one stop
				for (String p : currentPass) {
					// storing sign to add/remove passenger
					char sign = p.charAt(0);
					// storing passengerId in string
					String passnegerIdStr = p.substring(1);
					int passnegerId = Integer.parseInt(passnegerIdStr);

					// checking and adding passenger to passengerList
					if (sign == '+') {
						boolean flag = true;
						for (Passenger psg : passengerList) {
							if (psg.getId() == passnegerId) {
								flag = false;
								float temp = psg.getFare();
								// update fare
								psg.setFare(fare + temp);
							}
						}
						if (flag) {
							passengerList.add(new Passenger(passnegerId, fare));
						}
						passengerOut.remove(passnegerIdStr);
						passengerIn.add(passnegerIdStr);
					}
					// checking and adding passenger to passengerList ends

					else {
						passengerIn.remove(passnegerIdStr);

					}
				}

			// }
            // System.out.println("currentcount = "+currentPassCount);
            // System.out.println("fare = "+fare);
		}
        // System.out.println("on the bus = "+onTheBus+"out the bus = "+outTheBus);
        if (query.equals("1")) {
        outstring = onTheBus + " passengers got on the bus and "+outTheBus+" passengers got out of the bus";

				} 
                else if (query.equals("2")) {
                    float f1 = 
				}
                //  else if (query.equals("3")) {

				// } else if (query.equals("4")) {

				// } else if (query.equals("5")) {

				// }
        
        passengerList.forEach((n) -> System.out.println(n.getFare()));


		return outstring;
	}

}
