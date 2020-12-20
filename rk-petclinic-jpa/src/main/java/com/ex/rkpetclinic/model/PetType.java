package com.ex.rkpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="types")
public class PetType extends BaseEntity {
	
	/**@Rakehs start @13-Dec-2020
	public PetType() {
		// TODO Auto-generated constructor stub
	}
	
	public PetType(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	
	//@Rakesh  13-Dec-2020 start
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
  //@Rakesh 13-Dec-2020 end
	**@Rakehs start @13-Dec-2020**/
	


	@Column(name="name")
    private String name;

	 
	
	
	

}
