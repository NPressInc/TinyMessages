package com.example.wordsapp

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

class ConversationsDirections private constructor() {
  private data class ActionConversationsToConversationFragment(
    val id: String
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_conversations_to_conversationFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("id", this.id)
      return result
    }
  }

  companion object {
    fun actionConversationsToConversationFragment(id: String): NavDirections =
        ActionConversationsToConversationFragment(id)
  }
}
