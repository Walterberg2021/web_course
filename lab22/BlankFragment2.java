package com.example.lab2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class BlankFragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_null,button_plus,button_minus,button_multiply,button_division,button_equal,button_point,button_clear;
    private EditText ed1;
    private float Value1, Value2;
    private boolean mAddition, mSubtract, mMultiplication, mDivision;
    private Button button_operation;
    private boolean mxx;

    public BlankFragment2() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static BlankFragment2 newInstance(String param1, String param2) {
        BlankFragment2 fragment = new BlankFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button_null = view.findViewById(R.id.button_null);
        button_1 = view.findViewById(R.id.button_1);
        button_2 = view.findViewById(R.id.button_2);
        button_3 = view.findViewById(R.id.button_3);
        button_4 = view.findViewById(R.id.button_4);
        button_5 = view.findViewById(R.id.button_5);
        button_6 = view.findViewById(R.id.button_6);
        button_7 = view.findViewById(R.id.button_7);
        button_8 = view.findViewById(R.id.button_8);
        button_9 = view.findViewById(R.id.button_9);
        button_plus = view.findViewById(R.id.button_p);
        button_division = view.findViewById(R.id.button_d);
        button_minus = view.findViewById(R.id.button_m);
        button_multiply = view.findViewById(R.id.button_mul);
        button_equal = view.findViewById(R.id.button_equal);
        button_point = view.findViewById(R.id.button_point);
        button_clear = view.findViewById(R.id.button_clear);
        button_operation = view.findViewById(R.id.button_operation);
        ed1 = view.findViewById(R.id.editText);


        button_null.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(null);
                ed1.setText(ed1.getText() + "0");
                Log.i("mylog", "click0in2");
            }
        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
                Log.i("mylog", "click1in2");
            }
        });


        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
                Log.i("mylog", "click2in2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
                Log.i("mylog", "click3in2");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
                Log.i("mylog", "click4in2");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
                Log.i("mylog", "click5in2");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
                Log.i("mylog", "click6in2");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
                Log.i("mylog", "click7in2");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
                Log.i("mylog", "click8in2");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
                Log.i("mylog", "click9in2");
            }
        });

        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
                Log.i("mylog", "clickpointin2");
            }
        });

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("mylog", "clickClearin2");
                ed1.setText("");
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("mylog", "clickminusin2");
                Value1 = Float.parseFloat(ed1.getText() + "");
                mSubtract = true ;
                ed1.setText(null);
            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("mylog", "clickmultin2");
                Value1 = Float.parseFloat(ed1.getText() + "");
                mMultiplication = true ;
                ed1.setText(null);
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("mylog", "clickplusin2");

                if (ed1 == null){
                    ed1.setText("");
                }else {
                    Value1 = Float.parseFloat(ed1.getText() + "");
                    mAddition = true;
                    ed1.setText(null);
                }
            }
        });
        button_operation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("mylog", "clickoperation");
                Value1 = Float.parseFloat(ed1.getText() + "");
                mxx = true ;
                ed1.setText(Value1/100 + "");

            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("mylog", "clickeqlin2");
                Value2 = Float.parseFloat(ed1.getText() + "");

                if (mAddition == true){

                    ed1.setText(Value1 + Value2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    ed1.setText(Value1 - Value2 + "");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    ed1.setText(Value1 * Value2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    ed1.setText(Value1 / Value2 + "");
                    mDivision=false;
                }
                if (mxx == true){
                    ed1.setText(Value1/100 + "");
                    mxx = false;
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}