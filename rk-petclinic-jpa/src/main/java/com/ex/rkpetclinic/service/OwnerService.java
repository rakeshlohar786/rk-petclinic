package com.ex.rkpetclinic.service;

import com.ex.rkpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
