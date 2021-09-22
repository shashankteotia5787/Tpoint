package com.tpoint.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class LoginResponsePojo {

	@JsonProperty("Success")
	private String success;

	@JsonProperty("Failure")
	private String failed;
	
	@JsonProperty("RESPONSE")
	private String response;
	
	

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getFailed() {
		return failed;
	}

	public void setFailed(String failed) {
		this.failed = failed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginResponsePojo [success=");
		builder.append(success);
		builder.append(", failed=");
		builder.append(failed);
		builder.append(", response=");
		builder.append(response);
		builder.append("]");
		return builder.toString();
	}

}
