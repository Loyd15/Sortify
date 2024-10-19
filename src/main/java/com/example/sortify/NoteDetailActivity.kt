package com.example.sortify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sortify.databinding.ActivityNoteDetailBinding

class NoteDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNoteDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoteDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val note = intent.getStringExtra("NOTE")
        binding.noteTextView.text = note
    }
}
