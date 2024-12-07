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
import javax.persistence.JoinTable;
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
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int facultyId;
	String facultyName;
	String email;
	String contact;

	
	
	
//	@ManyToOne
//	@JoinColumn(name="deptId")
//	private Department department;
//	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "faculty")
//	List<Faculty_Attendence> facultyAttendence;

	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
	@JsonIgnore
    private Department department;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
      name = "faculty_subject",
      joinColumns = @JoinColumn(name = "faculty_id"),
      inverseJoinColumns = @JoinColumn(name = "subject_id"))
    @JsonIgnore
    private Set<Subject> subjects;

    @OneToMany(mappedBy = "faculty",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Faculty_Attendence> facultyAttendances;
    
    @OneToMany(mappedBy = "faculty",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<ClassSchedule> classSchedules;
}
