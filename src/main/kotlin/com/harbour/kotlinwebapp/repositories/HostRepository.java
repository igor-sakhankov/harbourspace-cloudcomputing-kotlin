package com.harbour.kotlinwebapp.repositories;

import com.harbour.kotlinwebapp.entities.Host;
import org.springframework.data.repository.CrudRepository;

public interface HostRepository extends CrudRepository<Host, Long> {

}
