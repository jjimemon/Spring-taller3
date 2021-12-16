package com.nttdata.eclipse_spring_taller3_JJM.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NttdataClientRepositoryI extends JpaRepository<NttdataClient, Integer> {

	public List<NttdataClient> findByNameAndLastName(String name, String lastname);
}
