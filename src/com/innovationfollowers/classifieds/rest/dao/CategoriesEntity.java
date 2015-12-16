package com.innovationfollowers.classifieds.rest.dao;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.resource.Categories;

@Entity
@Table(name="categories")
public class CategoriesEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8868134092098089533L;
	
	@Id
	@GeneratedValue
	@Column(name="category_id")
	private Long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	public CategoriesEntity() {
	}
	
	public CategoriesEntity(Categories categories)
	{
		try {
			BeanUtils.copyProperties(this, categories);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
