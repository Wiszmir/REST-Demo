package services;

import java.util.List;

import domain.Note;

public interface NoteService {
	
	Note findNoteById(Long id);
	
	List<Note> findAllNotes(); 
}
