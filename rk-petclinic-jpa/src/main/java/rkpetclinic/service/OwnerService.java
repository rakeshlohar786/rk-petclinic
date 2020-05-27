package rkpetclinic.service;

import rkpetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);


}
