package com.example.restdemo.services;

import java.util.List;

import com.example.restdemo.domain.Note;

public interface NoteService {
	
	Note findNoteById(Long id);
	
	List<Note> findAllNotes();

	Note saveNote(Note note); 
}
