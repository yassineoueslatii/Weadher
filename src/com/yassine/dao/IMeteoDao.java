package com.yassine.dao;

import java.util.List;

import com.yassine.entities.Meteo;

public interface IMeteoDao {
	public void save(Meteo meteo) ;
	public List<Meteo> getListMeteo();
	public void remove(int id);

}
