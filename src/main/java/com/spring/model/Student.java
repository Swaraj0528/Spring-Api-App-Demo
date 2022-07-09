package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	
	@Id
	private Integer id;
	@NotNull(message = "Name is mandatory")
	private String studentName;
	@NotBlank(message = "Stream is mandatory")
	private String stream;
	
}
