package controlers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.Note;
import services.NoteService;

@RestController
@RequestMapping(NoteControler.BASE_URL)
public class NoteControler {

	public static final String BASE_URL = "/api/v1/notes";
	
	public final NoteService noteService;
	
	public NoteControler(NoteService noteService) {
		this.noteService = noteService;
		
	}
	
	@GetMapping
	List<Note> getAllNotes() {
		return noteService.findAllNotes();
	} 
}
