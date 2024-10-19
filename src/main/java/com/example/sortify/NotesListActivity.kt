package com.example.sortify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sortify.databinding.ActivityNotesListBinding

class NotesListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotesListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotesListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val notes = listOf("Note 1", "Note 2", "Note 3") // Sample data

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@NotesListActivity)
            adapter = NotesAdapter(notes) { note ->
                // On click, open NoteDetailActivity
                val intent = Intent(this@NotesListActivity, NoteDetailActivity::class.java)
                intent.putExtra("NOTE", note)
                startActivity(intent)
            }
        }
    }
}
