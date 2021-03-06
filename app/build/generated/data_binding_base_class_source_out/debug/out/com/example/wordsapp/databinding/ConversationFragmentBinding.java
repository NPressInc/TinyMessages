// Generated by view binder compiler. Do not edit!
package com.example.wordsapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.wordsapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ConversationFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSend;

  @NonNull
  public final LinearLayout layoutMessageArea;

  @NonNull
  public final RecyclerView messageList;

  @NonNull
  public final EditText txtMessage;

  private ConversationFragmentBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSend,
      @NonNull LinearLayout layoutMessageArea, @NonNull RecyclerView messageList,
      @NonNull EditText txtMessage) {
    this.rootView = rootView;
    this.btnSend = btnSend;
    this.layoutMessageArea = layoutMessageArea;
    this.messageList = messageList;
    this.txtMessage = txtMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ConversationFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ConversationFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.conversation_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ConversationFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSend;
      Button btnSend = ViewBindings.findChildViewById(rootView, id);
      if (btnSend == null) {
        break missingId;
      }

      id = R.id.layout_messageArea;
      LinearLayout layoutMessageArea = ViewBindings.findChildViewById(rootView, id);
      if (layoutMessageArea == null) {
        break missingId;
      }

      id = R.id.messageList;
      RecyclerView messageList = ViewBindings.findChildViewById(rootView, id);
      if (messageList == null) {
        break missingId;
      }

      id = R.id.txtMessage;
      EditText txtMessage = ViewBindings.findChildViewById(rootView, id);
      if (txtMessage == null) {
        break missingId;
      }

      return new ConversationFragmentBinding((ConstraintLayout) rootView, btnSend,
          layoutMessageArea, messageList, txtMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
