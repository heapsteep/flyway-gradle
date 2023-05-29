package com.heapsteep.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PERSONS")
public class Person {
	@Id
	@GeneratedValue
	private int id;
	private String first_name;
	private String last_name;
	private String mobile;
}
