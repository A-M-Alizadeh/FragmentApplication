package com.example.fragmentapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentTwo:Fragment(R.layout.fragment_two){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val seekBar = view.findViewById<SeekBar>(R.id.seekBar)
        val b = view.findViewById<Button>(R.id.frag2Button)
        b.setOnClickListener {
            seekBar.progress = 50
            Toast.makeText(context, "Progress is ${seekBar.progress}", Toast.LENGTH_SHORT).show()
        }
    }

}