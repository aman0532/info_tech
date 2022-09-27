package net.app.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasktable")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private long id;
	
   public Task() {
		super();
	}

public Task(long id, String employe_name, String job_title, String email, String addres, String city, String state,
			String p_E_C_1, String phone_number_1, String relation_1, String p_E_C_2, String phone_number_2,
			String relation_2) {
		super();
		this.id = id;
		this.employe_name = employe_name;
		this.job_title = job_title;
		this.email = email;
		this.addres = addres;
		this.city = city;
		this.state = state;
		this.P_E_C_1 = p_E_C_1;
		this.Phone_number_1 = phone_number_1;
		this.relation_1 = relation_1;
		this.P_E_C_2 = p_E_C_2;
		this.Phone_number_2 = phone_number_2;
		this.relation_2 = relation_2;
	}

public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmploye_name() {
		return employe_name;
	}

	public void setEmploye_name(String employe_name) {
		this.employe_name = employe_name;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getP_E_C_1() {
		return P_E_C_1;
	}

	public void setP_E_C_1(String p_E_C_1) {
		P_E_C_1 = p_E_C_1;
	}

	public String getPhone_number_1() {
		return Phone_number_1;
	}

	public void setPhone_number_1(String phone_number_1) {
		Phone_number_1 = phone_number_1;
	}

	public String getRelation_1() {
		return relation_1;
	}

	public void setRelation_1(String relation_1) {
		this.relation_1 = relation_1;
	}

	public String getP_E_C_2() {
		return P_E_C_2;
	}

	public void setP_E_C_2(String p_E_C_2) {
		P_E_C_2 = p_E_C_2;
	}

	public String getPhone_number_2() {
		return Phone_number_2;
	}

	public void setPhone_number_2(String phone_number_2) {
		Phone_number_2 = phone_number_2;
	}

	public String getRelation_2() {
		return relation_2;
	}

	public void setRelation_2(String relation_2) {
		this.relation_2 = relation_2;
	}

@Column(name="employe_name")	
   private String employe_name;
   

   @Column(name="job_title")	
   private String job_title;
   
   @Column(name="email")
   private String email;
   
   @Column(name="address")
   private String addres;
   
   @Column(name="city")
   private String city;
   
   @Column(name="state")
   private String state;
   
   @Column(name="P_E_C_1")
   private String P_E_C_1;
   
   @Column(name="Phone_numer_1")
   private String Phone_number_1;
   
   @Column(name="relation_1")
   private String relation_1;
   
   @Column(name="P_E_C_2")
   private String P_E_C_2;
   
   @Column(name="Phone_numer_2")
   private String Phone_number_2;
   
   @Column(name="relation_2")
   private String relation_2;
   
 
}
  