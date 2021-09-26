package com.tpoint.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Title implements Serializable {

	private static final long serialVersionUID = -3946330575979662105L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "topic_name")
	private String topicName;

	@OneToMany(targetEntity = Concept.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "title_id", referencedColumnName = "id")
	private List<Concept> concept;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public List<Concept> getConcept() {
		return concept;
	}

	public void setConcept(List<Concept> concept) {
		this.concept = concept;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Title [id=");
		builder.append(id);
		builder.append(", topicName=");
		builder.append(topicName);
		builder.append(", concept=");
		builder.append(concept);
		builder.append("]");
		return builder.toString();
	}

}
