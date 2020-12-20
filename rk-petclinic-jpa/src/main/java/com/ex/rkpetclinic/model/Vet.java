package com.ex.rkpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="vets")
public class Vet extends Person {

	
	/**@Rakesh 13-Dec-2020 eclipse shift transferred
    public Vet(Long id, String firstName, String lastName) {
		super(id, firstName, lastName);
		// TODO Auto-generated constructor stub
	}
    
    public Vet() {
    	super();
    }
    //@Rakesh 13-Dec-2020**/

	private static final long serialVersionUID = 4552L;
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="vet_specialities", joinColumns = @JoinColumn(name="vet_id"),
    inverseJoinColumns = @JoinColumn(name="speciality_id"))

	//@Rakesh 13-Dec-2020 eclipse code shift transferred
	private Set<Speciality> specialities = new HashSet<>();

	
	/**@Rakesh 13-Dec-2020 eclipse code shift transferred
	public Set<Speciality> getSpecialities() {
		return specialities;
	//@Rakesh 13-Dec-2020	
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}**/
    
    


}
