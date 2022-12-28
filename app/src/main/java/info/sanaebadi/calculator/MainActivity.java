package info.sanaebadi.calculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import info.sanaebadi.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;
    private Double firstNumber, secondNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonPlus.setOnClickListener(view -> {
            firstNumber = Double.parseDouble(binding.edittextFirstNumber.getText().toString());
            secondNumber = Double.parseDouble(binding.edittextSecondNumber.getText().toString());

            binding.textviewResult.setText(firstNumber + secondNumber + "");


        });


        binding.buttonDivsion.setOnClickListener(view -> {
            firstNumber = Double.parseDouble(binding.edittextFirstNumber.getText().toString());
            secondNumber = Double.parseDouble(binding.edittextSecondNumber.getText().toString());

            binding.textviewResult.setText(firstNumber / secondNumber + "");


        });

        binding.buttonMinus.setOnClickListener(view -> {
            firstNumber = Double.parseDouble(binding.edittextFirstNumber.getText().toString());
            secondNumber = Double.parseDouble(binding.edittextSecondNumber.getText().toString());

            binding.textviewResult.setText(firstNumber - secondNumber + "");


        });


        binding.buttonMultiply.setOnClickListener(view -> {
            firstNumber = Double.parseDouble(binding.edittextFirstNumber.getText().toString());
            secondNumber = Double.parseDouble(binding.edittextSecondNumber.getText().toString());

            binding.textviewResult.setText(firstNumber * secondNumber + "");


        });


    }
}