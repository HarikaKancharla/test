package com.inc.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

@Controller
@Entity
@Table(name="inc_employee")
public class Inc_employee {

		@Id
	    @Column(name="EMP_ID")
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private int id;
		
		@Column
		private String EMP_NAME;
		
		@Column
		private int DEPARTMENT_ID;
		
		@Column
		private int DESIGNATION_ID;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEMP_NAME() {
			return EMP_NAME;
		}
		public void setEMP_NAME(String eMP_NAME) {
			EMP_NAME = eMP_NAME;
		}
		public int getDEPARTMENT_ID() {
			return DEPARTMENT_ID;
		}
		public void setDEPARTMENT_ID(int dEPARTMENT_ID) {
			DEPARTMENT_ID = dEPARTMENT_ID;
		}
		public int getDESIGNATION_ID() {
			return DESIGNATION_ID;
		}
		public void setDESIGNATION_ID(int dESIGNATION_ID) {
			DESIGNATION_ID = dESIGNATION_ID;
		}
		
}
