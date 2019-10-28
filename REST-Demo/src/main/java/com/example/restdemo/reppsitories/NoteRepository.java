package com.example.restdemo.reppsitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restdemo.domain.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
	

}
