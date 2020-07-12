package com.example.calculadoraments.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            switch (input)
            {
                case 1:
                    return " ● MeNTS es una calculadora que permite a los profesionales médicos dar prioridad a aquellas intervenciones quirúrgicas que se vieron afectadas por la aparición del nuevo COVID-19." +
                            "\n" +
                            "\n" +
                            " ● MeNtS apoya a la toma de decisiones basada en una calificación objetiva que permite decidir si realizar o no un procedimiento quirúrgico en tiempos de pandemia.";
                case 2:
                    return " ● Diseñada en una sencilla escala de 1 a 5 donde un valor más alto corresponde a un peor resultado perioperatorio del paciente, un mayor riesgo de transmisión de COVID-19 al equipo de atención y/o un mayor uso de recursos hospitalarios durante la pandemia. " +
                            "\n" +
                            "\n" +
                            " ● La escala se aplica a distintos aspectos dentro de tres factores generales: procedimiento, paciente y enfermedad." +
                            "\n" +
                            "\n"+
                            " ● La calculadora se basa en medidas objetivas y probabilidades clínicas percibidas que traducidas en la escala generada y acumulando los diferentes resultados se obtiene un puntaje acumulado MeNTS que permite apoyar la toma de decisiones." +
                            "\n" +
                            "\n" +
                            " ● AÑADIR QUÉ INDICA RESULTADOS FINALES RANGOS";
            }
            return null;
            //return "Hello world from section: " + input;
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}