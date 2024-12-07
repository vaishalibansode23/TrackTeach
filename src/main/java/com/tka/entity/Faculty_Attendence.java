package com.tka.entity;

import java.time.LocalDate;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Faculty_Attendence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int attendenceId;
	LocalDate date;
	@Column(nullable = false)
	String status;
	

	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="classScheduleId")
//	private ClassSchedule classschedule;
//	
//	@ManyToOne
//	@JoinColumn(name="facultyId")
//	private Faculty faculty;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id")
	@JsonIgnore
    private Faculty faculty;

	
	
	

}
