package com.yassine.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="meteo")
public class Meteo {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="code")
private int code ;
@Column(name="titre")
private String titre ;
@Column(name="des")
private String desc;
public Meteo(String titre, String desc) {
	super();
	this.titre = titre;
	this.desc = desc;
}

public Meteo() {
	
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}

	
}
