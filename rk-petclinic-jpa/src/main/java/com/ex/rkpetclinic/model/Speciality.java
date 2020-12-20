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
@Table(name="spcialities")
public class Speciality extends BaseEntity {

	/**@Rakesh 13-Dec-2020 eclipse transfer code needs to be modified
	public Speciality(Long id) {
		super(id);
	}
	//@Rakesh 13-Dec-2020 end**/
	
	@Column(name="description")
    private String decription;

	
	/**@Rakehs start @13-Dec-2020
	
	public String getDecription() {
		return decription;
	}

	public Speciality() {
		super();
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}
	@Rakehs end @13-Dec-2020**/


}
