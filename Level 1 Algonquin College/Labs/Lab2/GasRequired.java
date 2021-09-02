package Lab2;

public class GasRequired {						//this class is responsible for calculating gas required from milage and distance to be travelled  
	private double milage;					//it contains instance variables milage, distance and gasRequired
	private double distance;
	private double gasRequired;
	
	
	public GasRequired()							//Default constructor and initiating it with 0
	{ milage=0;
	  distance=0;
	  gasRequired=0;
	}
	
	public double getMilage()      			 //accessor for milage
	{
		return milage;
	}
	public void setMilage(double milage)   		//mutator for milage
	{
		this.milage=milage;
	}
	public double getDistance()					//accessor for distance
	{
		return distance;
	}
	public void setDistance(double distance)	//mutator for distance
	{
		this.distance=distance;
	}
	public void CalculateGasRequired()			//method that calculates gas required from distance and milage
	{
		gasRequired= Math.round((milage*distance)/100);		//rounding off gas required to a whole number as per the requirement														
	}
	public double getGasRequired()				//accessor for gas required 
	{
		return gasRequired;
	}
}
