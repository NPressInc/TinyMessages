package com.example.wordsapp

import android.content.Context
import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.view.size
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wordsapp.adapters.ConversationAdapter
import com.example.wordsapp.adapters.ConversationsAdapter
import com.example.wordsapp.adapters.WordAdapter
import com.example.wordsapp.data.DataSource
import com.example.wordsapp.databinding.ConversationFragmentBinding
import com.example.wordsapp.databinding.FragmentWordListBinding
import com.example.wordsapp.models.Message
import java.util.*

class ConversationFragment : Fragment() {

    companion object {
        var ID = "id"
    }

    private var _binding: ConversationFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var Identity = Identity()

    private lateinit var recyclerView: RecyclerView

    private lateinit var ConversationID: String

    private lateinit var adapter: ConversationAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Retrieve the LETTER from the Fragment arguments
        arguments?.let {
            ConversationID = it.getString(ID).toString()

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ConversationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.messageList.layoutManager = LinearLayoutManager(context)
        adapter = ConversationAdapter(context)
        binding.messageList.adapter = adapter


        binding.btnSend.setOnClickListener {
            Log.i("Tab", "button listener is working")
            if (binding.txtMessage.text.isNotEmpty()) {
                val message = Message(
                    Identity.user,
                    binding.txtMessage.text.toString(),
                    Calendar.getInstance().timeInMillis,
                    "1234"
                )
                runOnUiThread {
                    adapter.addMessage(message)
                }


                binding.messageList.smoothScrollToPosition(binding.messageList.size * 100);

                // Make API call here
                Log.i("ChatActivity", "Sending Message:" + binding.txtMessage.text.toString())
                resetInput()
                Log.i("length Of Data", adapter.itemCount.toString())
            } else {
                Log.i("messages", "message Empty")
            }

        }

        val keyboardVisible = Rect()
        binding.messageList.getWindowVisibleDisplayFrame(keyboardVisible)


        // Set the viewModel for data binding - this allows the bound layout access
        // to all the data in the VieWModel

        //Log.i("ConversationFragment", ConversationID)

    }

    fun Fragment?.runOnUiThread(action: () -> Unit) {
        this ?: return
        if (!isAdded) return // Fragment not attached to an Activity
        activity?.runOnUiThread(action)
    }

    private fun resetInput() {
        // Clean text box
        binding.txtMessage.text.clear()
    }

}