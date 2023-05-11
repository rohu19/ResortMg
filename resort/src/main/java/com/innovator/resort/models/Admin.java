package com.innovator.resort.models;

import org.hibernate.annotations.CollectionIdJdbcType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Admin {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String resortFeature;
	private Integer capacityRoom;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getResortFeature() {
		return resortFeature;
	}

	public void setResortFeature(String resortFeature) {
		this.resortFeature = resortFeature;
	}

	public Integer getCapacityRoom() {
		return capacityRoom;
	}

	public void setCapacityRoom(Integer capacityRoom) {
		this.capacityRoom = capacityRoom;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender="
				+ gender + ", resortFeature=" + resortFeature + ", capacityRoom=" + capacityRoom + "]";
	}

}
