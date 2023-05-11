package com.innovator.resort.repositories;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

import com.innovator.resort.models.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

}
