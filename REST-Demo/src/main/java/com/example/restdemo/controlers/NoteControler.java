package com.example.restdemo.controlers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.domain.Note;
import com.example.restdemo.services.NoteService;

@RestController
@RequestMapping(NoteControler.BASE_URL)
public class NoteControler { //class with REST mapping
	public static final String BASE_URL = "/api/v1/notes";
	
	public final NoteService noteService;
	
	public NoteControler(NoteService noteService) {
		this.noteService = noteService;	
	}
	
	//GET
	@GetMapping
	List<Note> getAllNotes() {
		return noteService.findAllNotes();
	}
	
	//GET with specified id
	@GetMapping("/{id}")
	public Note getNoteById(@PathVariable Long id) {
		return noteService.findNoteById(id);
	}
	
	//POST
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Note saveNote(@RequestBody Note note) {
		return noteService.saveNote(note);
	}
}
