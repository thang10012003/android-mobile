// Generated by view binder compiler. Do not edit!
package com.tdtu.englishvocabquiz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tdtu.englishvocabquiz.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NewTopicItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imViewAvatar;

  @NonNull
  public final TextView tvCountWord;

  @NonNull
  public final TextView tvCreatorName;

  @NonNull
  public final TextView tvTopicName;

  private NewTopicItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView imViewAvatar,
      @NonNull TextView tvCountWord, @NonNull TextView tvCreatorName,
      @NonNull TextView tvTopicName) {
    this.rootView = rootView;
    this.imViewAvatar = imViewAvatar;
    this.tvCountWord = tvCountWord;
    this.tvCreatorName = tvCreatorName;
    this.tvTopicName = tvTopicName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NewTopicItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NewTopicItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.new_topic_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NewTopicItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imViewAvatar;
      ImageView imViewAvatar = ViewBindings.findChildViewById(rootView, id);
      if (imViewAvatar == null) {
        break missingId;
      }

      id = R.id.tvCountWord;
      TextView tvCountWord = ViewBindings.findChildViewById(rootView, id);
      if (tvCountWord == null) {
        break missingId;
      }

      id = R.id.tvCreatorName;
      TextView tvCreatorName = ViewBindings.findChildViewById(rootView, id);
      if (tvCreatorName == null) {
        break missingId;
      }

      id = R.id.tvTopicName;
      TextView tvTopicName = ViewBindings.findChildViewById(rootView, id);
      if (tvTopicName == null) {
        break missingId;
      }

      return new NewTopicItemBinding((LinearLayout) rootView, imViewAvatar, tvCountWord,
          tvCreatorName, tvTopicName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
