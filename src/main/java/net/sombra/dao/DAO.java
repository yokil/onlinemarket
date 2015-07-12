package net.sombra.dao;

import java.util.List;

public interface DAO<T> {
	 void add(T t);
	 List<T> getList();
	 void remove(Integer id);
}
