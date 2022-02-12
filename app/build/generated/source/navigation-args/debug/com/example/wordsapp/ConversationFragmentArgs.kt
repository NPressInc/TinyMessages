package com.example.wordsapp

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class ConversationFragmentArgs(
  val id: String
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("id", this.id)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ConversationFragmentArgs {
      bundle.setClassLoader(ConversationFragmentArgs::class.java.classLoader)
      val __id : String?
      if (bundle.containsKey("id")) {
        __id = bundle.getString("id")
        if (__id == null) {
          throw IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue")
      }
      return ConversationFragmentArgs(__id)
    }
  }
}
