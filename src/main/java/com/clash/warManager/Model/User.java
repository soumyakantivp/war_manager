package com.clash.warManager.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String email;
	private String password;
	private String playerId;
	private int townHall;
	private String name;

	@OneToMany
	private List<Enemy> enemy;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getTownHall() {
		return townHall;
	}

	public void setTownHall(int townHall) {
		this.townHall = townHall;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Enemy> getEnemy() {
		return enemy;
	}

	public void setEnemy(List<Enemy> enemy) {
		this.enemy = enemy;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", playerId=" + playerId + ", townHall=" + townHall
				+ ", name=" + name + ", enemy=" + enemy + "]";
	}
}
