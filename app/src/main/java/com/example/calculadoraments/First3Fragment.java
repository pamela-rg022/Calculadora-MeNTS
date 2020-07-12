package com.example.calculadoraments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class First3Fragment extends Fragment {

    RadioGroup grupo31;
    RadioGroup grupo32;
    RadioGroup grupo33;
    RadioGroup grupo34;
    RadioGroup grupo35;
    RadioGroup grupo36;


    int sumaEnfermedad;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first3, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        grupo31 = view.findViewById(R.id.grupo31);
        grupo32 = view.findViewById(R.id.grupo32);
        grupo33 = view.findViewById(R.id.grupo33);
        grupo34 = view.findViewById(R.id.grupo34);
        grupo35 = view.findViewById(R.id.grupo35);
        grupo36 = view.findViewById(R.id.grupo36);

        view.findViewById(R.id.button_resultfinal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                NavHostFragment.findNavController(First3Fragment.this)
                        .navigate(R.id.action_First3Fragment_to_SecondFragment);
            }
        });
        view.findViewById(R.id.button_volverfacpaciente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(First3Fragment.this)
                        .navigate(R.id.action_First3Fragment_to_Second2Fragment);
            }
        });
    }
}