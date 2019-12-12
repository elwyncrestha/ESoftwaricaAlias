package com.elvin.esoftwaricaalias.ui.fragment.student;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.elvin.esoftwaricaalias.R;

public class AddStudentFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_add_student, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        return root;
    }
}