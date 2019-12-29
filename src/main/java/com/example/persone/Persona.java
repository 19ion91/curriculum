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
	private String name;
	private String surname;
	private ArrayList<String> sports;
	private ArrayList<String> skills;
	private int height;
	private int weight;
	public Persona() {}
	public Persona(String Name, String Surname) {
		this.name=Name;
		this.surname=Surname;
		this.sports = new ArrayList<>();
		this.skills = new ArrayList<>();
	}
	public ArrayList<String> getSkill() {
		return skills;
	}
	public void setSkill(ArrayList<String> skill) {
		skills.addAll(skill);
	}
	public ArrayList<String> getSport() {
		return sports;
	}
	public void setSport(ArrayList<String> sport) {
		sports.addAll(sport);
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int Weight) {
		this.weight = Weight;
	}
	public int getHeight() {
		return height;
	}
	public void setheight(int height) {
		this.height = height;
	}
	public String getName() {
		return this.name;
	}
	public int getId() {
		return id;
	}
	public String getSurname() {
		return surname;
	}
}
