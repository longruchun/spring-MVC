package com.eshop.model;

import java.util.List;



public class sysmenu {
	   int id;

	   String text;
	   String href;	

       List<sysmenu> nodes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public List<sysmenu> getNodes() {
		return nodes;
	}

	public void setNodes(List<sysmenu> nodes) {
		this.nodes = nodes;
	}

	/**
	 * @param id
	 * @param text
	 * @param href
	 * @param nodes
	 */
	public sysmenu(int id, String text, String href, List<sysmenu> nodes) {
		super();
		this.id = id;
		this.text = text;
		this.href = href;
		this.nodes = nodes;
	}

	/**
	 * @param text
	 * @param href
	 * @param nodes
	 */
	public sysmenu(String text, String href, List<sysmenu> nodes) {
		super();
		this.text = text;
		this.href = href;
		this.nodes = nodes;
	}

	/**
	 * 
	 */
	public sysmenu() {
		super();
		// TODO Auto-generated constructor stub
	}
       
       
}
