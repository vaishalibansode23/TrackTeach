package com.tka.entity;


import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
//	@ManyToOne
//	@JoinColumn(name="clsId")
//	private Classroom classroom;
//	
//	@ManyToOne
//	@JoinColumn(name="subjectId")
//	private Subject subject;
//	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "classschedule")
//	List<Faculty_Attendence> facultyAttendence;
	

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classroom_id")
    @JsonIgnore
    private Classroom classroom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    @JsonIgnore
    private Subject subject;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id")
    @JsonIgnore
    private Faculty faculty;

	
	

	

}
