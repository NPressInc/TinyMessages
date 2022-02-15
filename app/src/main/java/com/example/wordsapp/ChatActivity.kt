package com.example.wordsapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wordsapp.adapters.ConversationAdapter
import com.example.wordsapp.databinding.ConversationFragmentBinding
import com.example.wordsapp.models.Message
import java.util.*
import com.example.wordsapp.Identity


class ChatActivity: AppCompatActivity() {
    private lateinit var adapter: ConversationAdapter

    private var ID = Identity()

    private var _binding: ConversationFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conversation_fragment)

        binding.messageList.layoutManager = LinearLayoutManager(this)
        adapter = ConversationAdapter(this)
        binding.messageList.adapter = adapter

        binding.btnSend.setOnClickListener {
            if (binding.txtMessage.text.isNotEmpty()) {
                val message = Message(
                    ID.user,
                    binding.txtMessage.text.toString(),
                    Calendar.getInstance().timeInMillis
                )

                // Make API call here
                Log.i("ChatActivity", "Sending Message:" + binding.txtMessage.text.toString())

                Toast.makeText(
                    applicationContext,
                    "Response was not successful",
                    Toast.LENGTH_SHORT
                ).show()


            } else {
                Toast.makeText(
                    applicationContext,
                    "Message should not be empty",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }



}