package com.clash.warManager.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ENEMY")
public class Enemy {

	@Id
	
	private int number;
	private int th;
	private String strength;
	private String notes;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getTh() {
		return th;
	}
	public void setTh(int th) {
		this.th = th;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Enemy [number=" + number + ", th=" + th + ", strength=" + strength + ", notes=" + notes + "]";
	}
}
