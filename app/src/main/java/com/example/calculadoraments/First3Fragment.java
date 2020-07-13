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

public class First3Fragment extends Fragment {

    RadioGroup grupo31;
    RadioGroup grupo32;
    RadioGroup grupo33;
    RadioGroup grupo34;
    RadioGroup grupo35;
    RadioGroup grupo36;


    int sumaEnfermedad;
    int sumaTotal;

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

                int selected_id_grupo21 = grupo31.indexOfChild(getView().findViewById(grupo31.getCheckedRadioButtonId()));
                int selected_id_grupo22 = grupo32.indexOfChild(getView().findViewById(grupo32.getCheckedRadioButtonId()));
                int selected_id_grupo23 = grupo33.indexOfChild(getView().findViewById(grupo33.getCheckedRadioButtonId()));
                int selected_id_grupo24 = grupo34.indexOfChild(getView().findViewById(grupo34.getCheckedRadioButtonId()));
                int selected_id_grupo25 = grupo35.indexOfChild(getView().findViewById(grupo35.getCheckedRadioButtonId()));
                int selected_id_grupo26 = grupo36.indexOfChild(getView().findViewById(grupo36.getCheckedRadioButtonId()));
                //suma fragmento anterior
                int suma_previa_proce_paci = First3FragmentArgs.fromBundle(getArguments()).getSumaProcePacient();

                sumaEnfermedad = selected_id_grupo21 + selected_id_grupo22 + selected_id_grupo23 + selected_id_grupo24 + selected_id_grupo25 + selected_id_grupo26 + 6;
                sumaTotal = suma_previa_proce_paci + sumaEnfermedad;

               // Toast.makeText(getContext(), "" + sumaEnfermedad, Toast.LENGTH_SHORT).show();

                First3FragmentDirections.ActionFirst3FragmentToSecondFragment seguir_finalresult = First3FragmentDirections.actionFirst3FragmentToSecondFragment();
                seguir_finalresult.setSumaFinalresult(sumaTotal);
                NavHostFragment.findNavController(First3Fragment.this).navigate(seguir_finalresult);

       //         NavHostFragment.findNavController(First3Fragment.this)
         //               .navigate(R.id.action_First3Fragment_to_SecondFragment);
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