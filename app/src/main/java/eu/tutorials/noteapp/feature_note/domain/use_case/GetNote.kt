package eu.tutorials.noteapp.feature_note.domain.use_case

import eu.tutorials.noteapp.feature_note.domain.model.Note
import eu.tutorials.noteapp.feature_note.domain.repository.NoteRepository

class GetNote(private val repository: NoteRepository) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}