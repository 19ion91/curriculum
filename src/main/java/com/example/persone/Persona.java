package com.example.persone;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.ArrayList;
@Entity
public class Persona {
	@Id
	@GeneratedValue
	private int id;
	private String Name;
	private String Surname;
	private ArrayList<String> Sports;
	private ArrayList<String> Skills;
	private int Height;
	private int Weight;
	public Persona() {}
	public Persona(String Name, String Surname) {
		this.Name=Name;
		this.Surname=Surname;
		this.Sports = new ArrayList<>();
		this.Skills = new ArrayList<>();
	}
	public ArrayList<String> getSkill() {
		return Skills;
	}
	public void setSkill(ArrayList<String> skill) {
		Skills.addAll(skill);
	}
	public ArrayList<String> getSport() {
		return Sports;
	}
	public void setSport(ArrayList<String> sport) {
		Sports.addAll(sport);
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int Weight) {
		this.Weight = Weight;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	public String getName() {
		return this.Name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public ArrayList<String> getSports() {
		return Sports;
	}
	public void setSports(ArrayList<String> sports) {
		Sports = sports;
	}
	public ArrayList<String> getSkills() {
		return Skills;
	}
	public void setSkills(ArrayList<String> skills) {
		Skills = skills;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
