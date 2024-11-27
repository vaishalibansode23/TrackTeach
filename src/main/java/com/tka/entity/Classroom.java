package com.tka.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int clsId;
	@Column(name="clsRoomName" ,nullable=false)
	String clsName;
	

//	
//	@OneToMany(cascade = CascadeType.ALL/*,mappedBy = "classroom"*/)
//	@JoinColumn(name="clsId")
//	List<ClassSchedule> classSchedule;
	

}
