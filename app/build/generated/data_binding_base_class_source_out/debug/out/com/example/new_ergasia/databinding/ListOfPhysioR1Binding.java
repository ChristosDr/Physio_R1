// Generated by view binder compiler. Do not edit!
package com.example.new_ergasia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
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

public final class ListOfPhysioR1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView BottomNav;

  @NonNull
  public final Button eisodosAdminButton;

  @NonNull
  public final ConstraintLayout headerRowR1;

  @NonNull
  public final TextView listAFMR1;

  @NonNull
  public final TextView listAddresR1;

  @NonNull
  public final TextView listNameR1;

  @NonNull
  public final TextView listPhysioR1;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final TableRow rowHeaderR1;

  @NonNull
  public final TableLayout tablePhysioR1;

  private ListOfPhysioR1Binding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView BottomNav, @NonNull Button eisodosAdminButton,
      @NonNull ConstraintLayout headerRowR1, @NonNull TextView listAFMR1,
      @NonNull TextView listAddresR1, @NonNull TextView listNameR1, @NonNull TextView listPhysioR1,
      @NonNull ImageView logo, @NonNull TableRow rowHeaderR1, @NonNull TableLayout tablePhysioR1) {
    this.rootView = rootView;
    this.BottomNav = BottomNav;
    this.eisodosAdminButton = eisodosAdminButton;
    this.headerRowR1 = headerRowR1;
    this.listAFMR1 = listAFMR1;
    this.listAddresR1 = listAddresR1;
    this.listNameR1 = listNameR1;
    this.listPhysioR1 = listPhysioR1;
    this.logo = logo;
    this.rowHeaderR1 = rowHeaderR1;
    this.tablePhysioR1 = tablePhysioR1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListOfPhysioR1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListOfPhysioR1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_of_physio_r1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListOfPhysioR1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BottomNav;
      BottomNavigationView BottomNav = ViewBindings.findChildViewById(rootView, id);
      if (BottomNav == null) {
        break missingId;
      }

      id = R.id.eisodos_admin_button;
      Button eisodosAdminButton = ViewBindings.findChildViewById(rootView, id);
      if (eisodosAdminButton == null) {
        break missingId;
      }

      ConstraintLayout headerRowR1 = (ConstraintLayout) rootView;

      id = R.id.list_AFM_r1;
      TextView listAFMR1 = ViewBindings.findChildViewById(rootView, id);
      if (listAFMR1 == null) {
        break missingId;
      }

      id = R.id.list_addres_r1;
      TextView listAddresR1 = ViewBindings.findChildViewById(rootView, id);
      if (listAddresR1 == null) {
        break missingId;
      }

      id = R.id.list_name_r1;
      TextView listNameR1 = ViewBindings.findChildViewById(rootView, id);
      if (listNameR1 == null) {
        break missingId;
      }

      id = R.id.list_physio_r1;
      TextView listPhysioR1 = ViewBindings.findChildViewById(rootView, id);
      if (listPhysioR1 == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.row_header_r1;
      TableRow rowHeaderR1 = ViewBindings.findChildViewById(rootView, id);
      if (rowHeaderR1 == null) {
        break missingId;
      }

      id = R.id.table_physio_r1;
      TableLayout tablePhysioR1 = ViewBindings.findChildViewById(rootView, id);
      if (tablePhysioR1 == null) {
        break missingId;
      }

      return new ListOfPhysioR1Binding((ConstraintLayout) rootView, BottomNav, eisodosAdminButton,
          headerRowR1, listAFMR1, listAddresR1, listNameR1, listPhysioR1, logo, rowHeaderR1,
          tablePhysioR1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
