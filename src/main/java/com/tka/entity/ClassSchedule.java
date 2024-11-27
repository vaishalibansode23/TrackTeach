package com.tka.entity;


import java.time.LocalTime;
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
public class ClassSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int schedulId;
	String dayOfWeek;
	LocalTime endTime;
	LocalTime stratTime;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="clsId")
	private Classroom classroom;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="subjectId")
	private Subject subject;
//	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "classschedule")
//	List<Faculty_Attendence> facultyAttendence;

	
	

	

}
