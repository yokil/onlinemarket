package net.sombra.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.sombra.dao.DAO;

@Repository
public abstract class DAOimpl<T> implements DAO<T> {
	  @Autowired
	    private SessionFactory sessionFactory;
	  
	  private Class<T> entityClass;
	  
	  	protected DAOimpl() {
	  		ParameterizedType genericSuperclass = (ParameterizedType) getClass()
	  	             .getGenericSuperclass();
	  	        this.entityClass = (Class<T>) genericSuperclass
	  	             .getActualTypeArguments()[0];
	  	}
	 
	    public void add(T t) {
	        sessionFactory.getCurrentSession().save(t);
	    }
	 
	    @SuppressWarnings("unchecked")
		public List<T> getList() {
	 
	        return sessionFactory.getCurrentSession().createCriteria(entityClass).list();
	    }
	 
	    public void remove(Integer id) {
	    	T t = (T) sessionFactory.getCurrentSession().get(entityClass, id);
	        if (null != t) {
	            sessionFactory.getCurrentSession().delete(t);
	        }
	 
	    }
}
