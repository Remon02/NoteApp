package eu.tutorials.noteapp.feature_note.presentation.notes

import eu.tutorials.noteapp.feature_note.domain.model.Note
import eu.tutorials.noteapp.feature_note.domain.util.NoteOrder
import eu.tutorials.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Decending),
    val isOrderSectionVisible: Boolean = false
)
