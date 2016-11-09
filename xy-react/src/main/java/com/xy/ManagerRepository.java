package com.xy;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.Repository;

/**
 * Created by xyduan on 11/7/16.
 */
@RepositoryRestResource(exported = false)
public interface ManagerRepository extends Repository<Manager, Long>{
    Manager save(Manager manager);
    Manager findByName(String name);
}
