package com.tpoint.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic implements Serializable {

	private static final long serialVersionUID = -7546737629743083779L;

	@Id
	private Integer id;

	private String topic;

	private String topicDescription;

	private Date addedOn;

	private Date updateOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Topic [id=");
		builder.append(id);
		builder.append(", topic=");
		builder.append(topic);
		builder.append(", topicDescription=");
		builder.append(topicDescription);
		builder.append(", addedOn=");
		builder.append(addedOn);
		builder.append(", updateOn=");
		builder.append(updateOn);
		builder.append("]");
		return builder.toString();
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

}
