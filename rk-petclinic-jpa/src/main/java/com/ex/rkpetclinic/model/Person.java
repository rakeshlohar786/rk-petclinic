package com.ex.rkpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

	/**@Rakesh start 13-Dec-2020
	public Person() {
		
	}	
	**@Rakesh start 13-Dec-2020**/
	
    public Person(Long id,String firstName,String lastName){
      super(id);
      this.firstName = firstName;
      this.lastName =lastName;
    }

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;


  //@Rakesh start 13-Dec-2020
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
  //@Rakesh end 13-Dec-2020
    
    


}
