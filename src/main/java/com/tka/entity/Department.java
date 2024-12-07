package com.tka.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int deptId;
	@Column(nullable = false)
	String deptName;
	

	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
//     List<Faculty> faculty;
//	
	@OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
	@JsonIgnore
    private Set<Faculty> faculties;

    @OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Course> courses;
	
	

}
