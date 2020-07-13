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

public class Second2Fragment extends Fragment {

    RadioGroup grupo21;
    RadioGroup grupo22;
    RadioGroup grupo23;
    RadioGroup grupo24;
    RadioGroup grupo25;
    RadioGroup grupo26;
    RadioGroup grupo27;
    RadioGroup grupo28;

    int sumaPaciente;
    int sumaProcePaci;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second2, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        grupo21 = view.findViewById(R.id.grupo21);
        grupo22 = view.findViewById(R.id.grupo22);
        grupo23 = view.findViewById(R.id.grupo23);
        grupo24 = view.findViewById(R.id.grupo24);
        grupo25 = view.findViewById(R.id.grupo25);
        grupo26 = view.findViewById(R.id.grupo26);
        grupo27 = view.findViewById(R.id.grupo27);
        grupo28 = view.findViewById(R.id.grupo28);

        view.findViewById(R.id.irenfermedad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selected_id_grupo21 = grupo21.indexOfChild(getView().findViewById(grupo21.getCheckedRadioButtonId()));
                int selected_id_grupo22 = grupo22.indexOfChild(getView().findViewById(grupo22.getCheckedRadioButtonId()));
                int selected_id_grupo23 = grupo23.indexOfChild(getView().findViewById(grupo23.getCheckedRadioButtonId()));
                int selected_id_grupo24 = grupo24.indexOfChild(getView().findViewById(grupo24.getCheckedRadioButtonId()));
                int selected_id_grupo25 = grupo25.indexOfChild(getView().findViewById(grupo25.getCheckedRadioButtonId()));
                int selected_id_grupo26 = grupo26.indexOfChild(getView().findViewById(grupo26.getCheckedRadioButtonId()));
                int selected_id_grupo27 = grupo27.indexOfChild(getView().findViewById(grupo27.getCheckedRadioButtonId()));
                int selected_id_grupo28 = grupo28.indexOfChild(getView().findViewById(grupo28.getCheckedRadioButtonId()));
                //suma fragmento anterior
                int suma_previa_proce = Second2FragmentArgs.fromBundle(getArguments()).getSumaProcedimiento();

                sumaPaciente = selected_id_grupo21 + selected_id_grupo22 + selected_id_grupo23 + selected_id_grupo24 + selected_id_grupo25 + selected_id_grupo26 + selected_id_grupo27 + selected_id_grupo28 + 8;
                sumaProcePaci = suma_previa_proce + sumaPaciente;

               // Toast.makeText(getContext(), "" + sumaPaciente, Toast.LENGTH_SHORT).show();


                Second2FragmentDirections.ActionSecond2FragmentToFirst3Fragment seguir_enfermedad = Second2FragmentDirections.actionSecond2FragmentToFirst3Fragment();
                seguir_enfermedad.setSumaProcePacient(sumaProcePaci);
                NavHostFragment.findNavController(Second2Fragment.this).navigate(seguir_enfermedad);


//                NavHostFragment.findNavController(Second2Fragment.this)
  //                      .navigate(R.id.action_Second2Fragment_to_First3Fragment);

            }
        });
        view.findViewById(R.id.volverinstrucdesdepaci).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Second2Fragment.this)
                        .navigate(R.id.action_Second2Fragment_to_instrucciones);
            }
        });
    }
}