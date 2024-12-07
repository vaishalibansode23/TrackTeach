package com.tka.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	

//	@ManyToOne
//	@JoinColumn(name="courseId")
//	private Course course;
//	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "subject")
//	List<ClassSchedule> classSchedule;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
	//@JsonIgnore
    private Course course;

    @ManyToMany(mappedBy = "subjects",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Faculty> faculties;

    @OneToMany(mappedBy = "subject",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<ClassSchedule> classSchedules;
	
	

}
