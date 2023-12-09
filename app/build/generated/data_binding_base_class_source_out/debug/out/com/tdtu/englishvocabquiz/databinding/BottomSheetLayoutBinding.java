// Generated by view binder compiler. Do not edit!
package com.tdtu.englishvocabquiz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.tdtu.englishvocabquiz.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnCancel;

  @NonNull
  public final LinearLayout layoutFolder;

  @NonNull
  public final LinearLayout layoutTopic;

  private BottomSheetLayoutBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnCancel,
      @NonNull LinearLayout layoutFolder, @NonNull LinearLayout layoutTopic) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.layoutFolder = layoutFolder;
    this.layoutTopic = layoutTopic;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancel;
      ImageView btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.layoutFolder;
      LinearLayout layoutFolder = ViewBindings.findChildViewById(rootView, id);
      if (layoutFolder == null) {
        break missingId;
      }

      id = R.id.layoutTopic;
      LinearLayout layoutTopic = ViewBindings.findChildViewById(rootView, id);
      if (layoutTopic == null) {
        break missingId;
      }

      return new BottomSheetLayoutBinding((LinearLayout) rootView, btnCancel, layoutFolder,
          layoutTopic);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}