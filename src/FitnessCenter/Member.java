package FitnessCenter;

public class Member {
	private String name;
	private String surname;
	private double height;
	private double weight;
	
	public Member(String name, String surname, double height, double weight) {
		this.name = name;
		this.surname = surname;
		this.height = height;
		this.weight = weight;
    }

	public void setName(String name) {
		this.name = name;
    }

	public void setSurname(String surname) {
		this.surname = surname;
    }

	public void setHeight(double height) {
		this.height = height;
    }

	public void setWeight(double weight) {
		this.weight = weight;
    }

	public String getName() {
		return this.name;
    }

	public String getSurname() {
		return this.surname;
    }
	
	public double getHeight() {
		return this.height;
    }

	public double getWeight() {
		return this.weight;
	}

	public void displayMember() {
		System.out.println(getName() + "\t" + getSurname() + "\t" + getHeight()+ "\t" + getWeight());
	}

	public double BMI() {
		return weight/Math.pow(height,2);
	}

	public String weightStat(Member mem) {
		if(mem.BMI()<18.5)
			return "thin";
		else if(mem.BMI()>=18.5 && mem.BMI()<=24.9)
			return "normal";
		else if(mem.BMI()<=25 && mem.BMI()<=29.9)
			return "fat ass";
		else
			return "obese";
	}
}
