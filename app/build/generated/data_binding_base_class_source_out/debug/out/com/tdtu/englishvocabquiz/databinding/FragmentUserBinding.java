// Generated by view binder compiler. Do not edit!
package com.tdtu.englishvocabquiz.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.tdtu.englishvocabquiz.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentUserBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSignOut;

  @NonNull
  public final TableRow tbRow2;

  @NonNull
  public final TableRow tbRow3;

  @NonNull
  public final TableRow tbRow4;

  @NonNull
  public final TextView tvCreateDate;

  @NonNull
  public final TextView tvEdit;

  @NonNull
  public final TextView tvGender;

  @NonNull
  public final TextView tvNameUser;

  @NonNull
  public final TextView tvPhoneNumber;

  @NonNull
  public final TextView tvUid;

  @NonNull
  public final ShapeableImageView uploadImgView;

  private FragmentUserBinding(@NonNull LinearLayout rootView, @NonNull Button btnSignOut,
      @NonNull TableRow tbRow2, @NonNull TableRow tbRow3, @NonNull TableRow tbRow4,
      @NonNull TextView tvCreateDate, @NonNull TextView tvEdit, @NonNull TextView tvGender,
      @NonNull TextView tvNameUser, @NonNull TextView tvPhoneNumber, @NonNull TextView tvUid,
      @NonNull ShapeableImageView uploadImgView) {
    this.rootView = rootView;
    this.btnSignOut = btnSignOut;
    this.tbRow2 = tbRow2;
    this.tbRow3 = tbRow3;
    this.tbRow4 = tbRow4;
    this.tvCreateDate = tvCreateDate;
    this.tvEdit = tvEdit;
    this.tvGender = tvGender;
    this.tvNameUser = tvNameUser;
    this.tvPhoneNumber = tvPhoneNumber;
    this.tvUid = tvUid;
    this.uploadImgView = uploadImgView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSignOut;
      Button btnSignOut = ViewBindings.findChildViewById(rootView, id);
      if (btnSignOut == null) {
        break missingId;
      }

      id = R.id.tbRow2;
      TableRow tbRow2 = ViewBindings.findChildViewById(rootView, id);
      if (tbRow2 == null) {
        break missingId;
      }

      id = R.id.tbRow3;
      TableRow tbRow3 = ViewBindings.findChildViewById(rootView, id);
      if (tbRow3 == null) {
        break missingId;
      }

      id = R.id.tbRow4;
      TableRow tbRow4 = ViewBindings.findChildViewById(rootView, id);
      if (tbRow4 == null) {
        break missingId;
      }

      id = R.id.tvCreateDate;
      TextView tvCreateDate = ViewBindings.findChildViewById(rootView, id);
      if (tvCreateDate == null) {
        break missingId;
      }

      id = R.id.tvEdit;
      TextView tvEdit = ViewBindings.findChildViewById(rootView, id);
      if (tvEdit == null) {
        break missingId;
      }

      id = R.id.tvGender;
      TextView tvGender = ViewBindings.findChildViewById(rootView, id);
      if (tvGender == null) {
        break missingId;
      }

      id = R.id.tvNameUser;
      TextView tvNameUser = ViewBindings.findChildViewById(rootView, id);
      if (tvNameUser == null) {
        break missingId;
      }

      id = R.id.tvPhoneNumber;
      TextView tvPhoneNumber = ViewBindings.findChildViewById(rootView, id);
      if (tvPhoneNumber == null) {
        break missingId;
      }

      id = R.id.tvUid;
      TextView tvUid = ViewBindings.findChildViewById(rootView, id);
      if (tvUid == null) {
        break missingId;
      }

      id = R.id.uploadImgView;
      ShapeableImageView uploadImgView = ViewBindings.findChildViewById(rootView, id);
      if (uploadImgView == null) {
        break missingId;
      }

      return new FragmentUserBinding((LinearLayout) rootView, btnSignOut, tbRow2, tbRow3, tbRow4,
          tvCreateDate, tvEdit, tvGender, tvNameUser, tvPhoneNumber, tvUid, uploadImgView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
