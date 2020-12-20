package com.ex.rkpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="pets")
public class Pet extends BaseEntity {

	/**@Rakesh 13-Dec-2020 eclipse transfer code needs to be modified
	public Pet(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public Pet() {
		super();
	}
**/
	//@Rakesh 13-Dec-2020 end

	@ManyToOne
    @JoinColumn(name="type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name="owner_id")
    private Owner owner;

    @Column(name="birth_date")
    private LocalDate birthDate;

    @Column(name="name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
    private Set<Visit> visits = new HashSet<Visit>();

    
    //@Rakesh 13-Dec-2020 start

	public PetType getPetType() {
		return petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getName() {
		return name;
	}

	public Set<Visit> getVisits() {
		return visits;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}
    
    //@Rakesh 13-Dec-2020 end


}
