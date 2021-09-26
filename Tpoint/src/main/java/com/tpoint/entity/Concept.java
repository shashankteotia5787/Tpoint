package com.tpoint.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Concept implements Serializable {

	private static final long serialVersionUID = 8533314607297866324L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "title_id")
	private Integer titleid;

	@Column(name = "concept_name")
	private String conceptName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTitleid() {
		return titleid;
	}

	public void setTitleid(Integer titleid) {
		this.titleid = titleid;
	}

	public String getConceptName() {
		return conceptName;
	}

	public void setConceptName(String conceptName) {
		this.conceptName = conceptName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Concept [id=");
		builder.append(id);
		builder.append(", titleid=");
		builder.append(titleid);
		builder.append(", conceptName=");
		builder.append(conceptName);
		builder.append("]");
		return builder.toString();
	}

}
