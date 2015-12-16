package com.innovationfollowers.classifieds.rest.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.dao.CategoriesEntity;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Categories implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8868134092098089533L;
	
	@XmlElement(name="category_id")
	private Long id;
	
	@XmlElement(name="category_name")
	private String categoryName;
	
	public Categories() {
	}
	
	public Categories(CategoriesEntity categoriesEntity)
	{
		try {
			BeanUtils.copyProperties(this, categoriesEntity);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
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
