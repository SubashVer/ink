package com.example.ink;

import com.example.ink.Ink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InkRepository extends JpaRepository<Ink, Integer>{
	

}
