package com.example.restdemo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restdemo.domain.Note;
import com.example.restdemo.reppsitories.NoteRepository;

@Service
public class NoteServiceImpl implements NoteService {
	
	private final NoteRepository noteRepository; 
	
	public NoteServiceImpl(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}

	@Override
	public Note findNoteById(Long id) {
		return noteRepository.findById(id).get();
	}

	@Override
	public List<Note> findAllNotes() {
		return noteRepository.findAll();
	}

	@Override
	public Note saveNote(Note note) {
		return noteRepository.save(note) ;
	}
}
