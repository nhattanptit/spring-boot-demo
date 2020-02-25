package tannv13.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tannv13.note.models.Note;


@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}