package com.tka.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int subId;
	String subName;
	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="courseId")
	private Course course;
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "subject")
//	List<ClassSchedule> classSchedule;
	
	

}
