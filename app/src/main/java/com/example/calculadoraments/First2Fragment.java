package com.example.calculadoraments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class First2Fragment extends Fragment {

    RadioGroup grupo11;
    RadioGroup grupo12;
    RadioGroup grupo13;
    RadioGroup grupo14;
    RadioGroup grupo15;
    RadioGroup grupo16;
    RadioGroup grupo17;

    int sumaProcedimiento;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first2, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        grupo11 = view.findViewById(R.id.grupo11);
        grupo12 = view.findViewById(R.id.grupo12);
        grupo13 = view.findViewById(R.id.grupo13);
        grupo14 = view.findViewById(R.id.grupo14);
        grupo15 = view.findViewById(R.id.grupo15);
        grupo16 = view.findViewById(R.id.grupo16);
        grupo17 = view.findViewById(R.id.grupo17);



        view.findViewById(R.id.button_facpaciente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// Obtenemos el valor seleccionado por radio group
                int selected_id_grupo11 = grupo11.indexOfChild(getView().findViewById(grupo11.getCheckedRadioButtonId()));
                int selected_id_grupo12 = grupo12.indexOfChild(getView().findViewById(grupo12.getCheckedRadioButtonId()));
                int selected_id_grupo13 = grupo13.indexOfChild(getView().findViewById(grupo13.getCheckedRadioButtonId()));
                int selected_id_grupo14 = grupo14.indexOfChild(getView().findViewById(grupo14.getCheckedRadioButtonId()));
                int selected_id_grupo15 = grupo15.indexOfChild(getView().findViewById(grupo15.getCheckedRadioButtonId()));
                int selected_id_grupo16 = grupo16.indexOfChild(getView().findViewById(grupo16.getCheckedRadioButtonId()));
                int selected_id_grupo17 = grupo17.indexOfChild(getView().findViewById(grupo17.getCheckedRadioButtonId()));

                sumaProcedimiento = selected_id_grupo11 + selected_id_grupo12 + selected_id_grupo13 + selected_id_grupo14 + selected_id_grupo15 + selected_id_grupo16 + selected_id_grupo17 + 7;

                Toast.makeText(getContext(), "" + sumaProcedimiento, Toast.LENGTH_SHORT).show();


                NavHostFragment.findNavController(First2Fragment.this)
                       .navigate(R.id.action_First2Fragment_to_Second2Fragment);
            }
        });
        view.findViewById(R.id.button_volverinicio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(First2Fragment.this)
                        .navigate(R.id.action_First2Fragment_to_FirstFragment);
            }
        });
    }
}