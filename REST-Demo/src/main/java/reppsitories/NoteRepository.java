 package reppsitories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
	

}
