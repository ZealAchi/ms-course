package com.padre.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.padre.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Long>{

}
