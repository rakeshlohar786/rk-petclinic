package com.ex.rkpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="owners")
public class Owner extends Person {

	
	
    @Builder
    public Owner(Long id,String firstName,String lastName,String address
    ,String city,String telephone,Set<Pet> pets){
     super(id,firstName,lastName);
     this.address= address;
     this.city=city;
     this.telephone=telephone;
     this.pets=pets;

    }

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();


    
	/**@Rakesh 13-Dec-2020 eclipse transfer code needs to be modified
    
    public Owner() {
    	super();
    }
    
	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	**@Rakesh 13-Dec-2020 end **/

}
