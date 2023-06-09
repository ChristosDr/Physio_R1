// Generated by view binder compiler. Do not edit!
package com.example.new_ergasia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.new_ergasia.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMakeAnAppointmentR9Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView BottomNav;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final TextView textView;

  private ActivityMakeAnAppointmentR9Binding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView BottomNav, @NonNull CalendarView calendarView,
      @NonNull ImageView logo, @NonNull TextView textView) {
    this.rootView = rootView;
    this.BottomNav = BottomNav;
    this.calendarView = calendarView;
    this.logo = logo;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMakeAnAppointmentR9Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMakeAnAppointmentR9Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_make_an_appointment_r9, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMakeAnAppointmentR9Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BottomNav;
      BottomNavigationView BottomNav = ViewBindings.findChildViewById(rootView, id);
      if (BottomNav == null) {
        break missingId;
      }

      id = R.id.calendarView;
      CalendarView calendarView = ViewBindings.findChildViewById(rootView, id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityMakeAnAppointmentR9Binding((ConstraintLayout) rootView, BottomNav,
          calendarView, logo, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
