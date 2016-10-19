package com.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoProperties {
	
	
	@Value("${com.cloud.name}")
	private String name ; 
	@Value("${com.cloud.age}")
	private Integer age ; 
	@Value("${com.cloud.content}")
	private String content ;
	@Override
	public String toString() {
		return "DemoProperties [name=" + name + ", age=" + age + ", content="
				+ content + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	} 
	

	
	
}
