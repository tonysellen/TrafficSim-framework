package core;

import java.util.Random;

public class Car {
	private int velocity;
	private int acceleration;
	private int max_velocity;
	private double decelaration_probability;
	
	public Car()
	{
		this.velocity = 1;
		this.acceleration = 0;
		this.max_velocity = 1;
		this.decelaration_probability = 0.0;
	}
	
	public Car(int velocity, int acceleration, int max_velocity)
	{
		if(velocity < 1)
		{
			this.velocity = 1;
			this.acceleration = 0;
		}
		else
		{
			this.velocity = velocity;
			this.acceleration = acceleration;
		}
		this.max_velocity = max_velocity < this.velocity ? this.velocity : max_velocity;
		this.decelaration_probability = 0.0;
	}
	
	public double getDecelaration_probability() {
		return decelaration_probability;
	}

	public void setDecelaration_probability(double decelaration_probability) {
		this.decelaration_probability = decelaration_probability;
	}

	public int getMax_velocity() {
		return max_velocity;
	}

	public void setMax_velocity(int max_velocity) {
		this.max_velocity = max_velocity;
	}

	public int getAcceleration() {
		if(new Random().nextDouble() <= decelaration_probability)
		{
			acceleration = acceleration > 1 ? acceleration -1 : 0;
		}
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}
	
	public int getVelocity()
	{
		return velocity;
	}
	
	public void setVelocity(int velocity)
	{
		this.velocity = velocity;
	}
}
