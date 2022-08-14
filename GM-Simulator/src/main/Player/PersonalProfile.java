package main.Player;

import java.util.Random;

public class PersonalProfile {
	private String firstName, lastName;
	private int age, height, weight;
	public PersonalProfile(PositionName p) {
		Random r = new Random();
		generateHeight(p, r);
		generateWeight(p, r);
		age = (int) r.nextGaussian()*1+21;

	}
	public void generateHeight(PositionName p, Random r){
		double sd = r.nextGaussian();
		if(p == PositionName.DE || p == PositionName.TE || p == PositionName.DT || p == PositionName.QB || p == PositionName.LB ){
			height = 74 + (int)(sd*2);
		}else if(p == PositionName.OG || p == PositionName.OT || p == PositionName.C){
			height = 76 + (int)(sd*2);
		}else{
			height = 71 + (int)(sd*2);
		}
	}

	public void generateWeight(PositionName p, Random r){
		double sd = r.nextGaussian();
		if( p == PositionName.TE  ||  p == PositionName.LB){
			weight = 225 + (int)(sd*18);
		}else if(p == PositionName.DE || p == PositionName.DT){
			weight = 240 + (int)(sd*18);
		}else if(p == PositionName.OG || p == PositionName.OT || p == PositionName.C){
			weight = 265 + (int)(sd*18);
		}else if(p == PositionName.FB || p == PositionName.QB){
			weight = 210 + (int)(sd*18);
		}else{
			weight = 200 + (int)(sd*18);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
