package entity;

import java.util.Comparator;
import java.util.Date;

public class People implements Comparable<People> {
	
	private String name;
	private int age;
	private String sex;
	private String religion;
	private String mother_tongue;
	private String country;
	private String location;
	private String education;
	private String profession;
	private String status;
	private Date date;
	private int degree;

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public People() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMother_tongue() {
		return mother_tongue;
	}

	public void setMother_tongue(String mother_tongue) {
		this.mother_tongue = mother_tongue;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public People(String name, int age, String sex, String religion, 
			String mother_tongue, String country,
			String location, String education, String profession, String status, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.religion = religion;
		this.mother_tongue = mother_tongue;
		this.country = country;
		this.location = location;
		this.education = education;
		this.profession = profession;
		this.status = status;
		this.date = date;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", sex=" + sex + ", religion=" + religion + ", mother_tongue="
				+ mother_tongue + ", country=" + country + ", location=" + location + ", education=" + education
				+ ", profession=" + profession + ", status=" + status + ", date=" + date + ", degree=" + degree + "]";
	}

	

	@Override
	public int compareTo(People o) {
		// TODO Auto-generated method stub
		if (this.degree < o.getDegree()) {
            return 1;
        } else {
            return -1;
        }
	}


	
}
