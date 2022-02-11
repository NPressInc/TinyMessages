/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.wordsapp.adapters

import android.os.Build
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.wordsapp.data.DataSource
import com.example.wordsapp.R
import  com.example.wordsapp.LetterListFragmentDirections
import com.example.wordsapp.models.ConversationPeek

/**
 * Adapter for the [RecyclerView] in [MainActivity].
 */
class ConversationsAdapter :
    RecyclerView.Adapter<ConversationsAdapter.ConversationsViewHolder>() {

    // Generates a [CharRange] from 'A' to 'Z' and converts it to a list

    val dataset = DataSource.ConversationPeeks

    public var onItemClick: ((ConversationPeek) -> Unit)? = null

    /**
     * Provides a reference for the views needed to display items in your list.
     */
    class ConversationsViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val IconView: ImageView = view.findViewById(R.id.ConvoIcon)
        val TitleView: TextView = view.findViewById(R.id.ConvoTitle)
        val DetailView: TextView = view.findViewById(R.id.ConvoDetails)
        val DateView: TextView = view.findViewById(R.id.ConvoDateTime)
    }

    /**
     * Creates new views with R.layout.conversation_item_view as its template
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversationsViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.conversation_item_view, parent, false)

        // Setup custom accessibility delegate to set the text read
        return ConversationsViewHolder(layout).listen { pos, type ->
            val item = dataset.get(pos)
            Log.i("ConversationsAdapter",item.Title)
        }
    }

    /**
     * Replaces the content of an existing view with new data
     */
    override fun onBindViewHolder(holder: ConversationsViewHolder, position: Int) {
        val convo = dataset.get(position)
        holder.IconView.setImageResource(convo.imageResourceId)

        holder.TitleView.text = convo.Title

        holder.DetailView.text = convo.Details

        holder.DateView.text = convo.DateTime



        // Assigns a [OnClickListener] to the button contained in the [ViewHolder]
        /*
        holder.setOnClickListener {
            // Create an action from WordList to DetailList
            // using the required arguments
            val action = LetterListFragmentDirections.actionLetterListFragmentToWordListFragment(letter = holder.button.text.toString())
            // Navigate using that action
            holder.view.findNavController().navigate(action)
        }
        */

    }

    fun <T : RecyclerView.ViewHolder> T.listen(event: (position: Int, type: Int) -> Unit): T {
        itemView.setOnClickListener {
            event.invoke(getAdapterPosition(), getItemViewType())
        }
        return this
    }




    // Setup custom accessibility delegate to set the text read with
    // an accessibility service
    companion object Accessibility : View.AccessibilityDelegate() {


        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onInitializeAccessibilityNodeInfo(
            host: View?,
            info: AccessibilityNodeInfo?
        ) {
            super.onInitializeAccessibilityNodeInfo(host, info)
            // With `null` as the second argument to [AccessibilityAction], the
            // accessibility service announces "double tap to activate".
            // If a custom string is provided,
            // it announces "double tap to <custom string>".
            val customString = host?.context?.getString(R.string.look_up_words)
            val customClick =
                AccessibilityNodeInfo.AccessibilityAction(
                    AccessibilityNodeInfo.ACTION_CLICK,
                    customString
                )
            info?.addAction(customClick)
        }
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }


    override fun getItemCount(): Int {
        return dataset.size
    }
}