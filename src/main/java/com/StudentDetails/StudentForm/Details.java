package com.StudentDetails.StudentForm;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Details {
      @Id     
      private int id;
      private String name;
      private String rollno;
      private String year;
      private String batch;
      private long phoneno;
      private long guardianno;
      private String address;
      private String projects;
      private String certification;
      private String internships;
      private String activities;
      private double cgpa;
      private double percentage;
      private int historyofarrears;
      private int problemsolving;
      private String cocircular;
      private String extracircular;

	  
	  public Details() 
	  {
		
	  }	 
	  
	  public Details(int id, String name, String rollno, String year, String batch, long phoneno, long guardianno,
				String address, String projects, String certification, String internships, String activities, double cgpa,
				double percentage, int historyofarrears, int problemsolving, String cocircular, String extracircular) {
			super();
			this.id = id;
			this.name = name;
			this.rollno = rollno;
			this.year = year;
			this.batch = batch;
			this.phoneno = phoneno;
			this.guardianno = guardianno;
			this.address = address;
			this.projects = projects;
			this.certification = certification;
			this.internships = internships;
			this.activities = activities;
			this.cgpa = cgpa;
			this.percentage = percentage;
			this.historyofarrears = historyofarrears;
			this.problemsolving = problemsolving;
			this.cocircular = cocircular;
			this.extracircular = extracircular;
		}

	  
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public long getGuardianno() {
		return guardianno;
	}

	public void setGuardianno(long guardianno) {
		this.guardianno = guardianno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getInternships() {
		return internships;
	}

	public void setInternships(String internships) {
		this.internships = internships;
	}

	public String getActivities() {
		return activities;
	}

	public void setActivities(String activities) {
		this.activities = activities;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getHistoryofarrears() {
		return historyofarrears;
	}

	public void setHistoryofarrears(int historyofarrears) {
		this.historyofarrears = historyofarrears;
	}

	public int getProblemsolving() {
		return problemsolving;
	}

	public void setProblemsolving(int problemsolving) {
		this.problemsolving = problemsolving;
	}

	public String getCocircular() {
		return cocircular;
	}

	public void setCocircular(String cocircular) {
		this.cocircular = cocircular;
	}

	public String getExtracircular() {
		return extracircular;
	}

	public void setExtracircular(String extracircular) {
		this.extracircular = extracircular;
	}

	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", rollno=" + rollno + ", year=" + year + ", batch=" + batch
				+ ", phoneno=" + phoneno + ", guardianno=" + guardianno + ", address=" + address + ", projects="
				+ projects + ", certification=" + certification + ", internships=" + internships + ", activities="
				+ activities + ", cgpa=" + cgpa + ", percentage=" + percentage + ", historyofarrears="
				+ historyofarrears + ", problemsolving=" + problemsolving + ", cocircular=" + cocircular
				+ ", extracircular=" + extracircular + "]";
	}

}
