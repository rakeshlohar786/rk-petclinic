package com.ex.rkpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="visits")
public class Visit extends BaseEntity {

	/**@Rakesh 13-Dec-2020 eclipse transfer code needs to be modified
	public Visit(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	//@Rakesh 13-Dec-2020 end**/

	@Column(name="date")
    private LocalDate date;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;



   
    /**@Rakesh start 13-Dec-2020
    public Visit() {
    	super();
    }
    
    
	public LocalDate getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
    //@Rakesh end 13-Dec-2020**/
    
}
