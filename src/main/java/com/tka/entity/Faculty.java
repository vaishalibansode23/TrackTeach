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
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int facultyId;
	String facultyName;
	String email;
	String contact;

	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="deptId")
	private Department department;
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "faculty")
//	List<Faculty_Attendence> facultyAttendence;

}
