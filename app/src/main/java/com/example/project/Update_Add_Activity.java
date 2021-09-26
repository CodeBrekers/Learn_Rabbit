package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Update_Add_Activity extends AppCompatActivity {

    EditText name_input, address_input, number_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_add);

        name_input = findViewById(R.id.add_name_input);
        address_input = findViewById(R.id.add_address_input);
        number_input = findViewById(R.id.add_number_input);
        add_button = findViewById(R.id.add_add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(Update_Add_Activity.this);
                myDB.addContact(name_input.getText().toString().trim(),
                        address_input.getText().toString().trim(),
                        Integer.valueOf(number_input.getText().toString().trim()));
                Toast.makeText(Update_Add_Activity.this, "Contact added", Toast.LENGTH_SHORT).show();

                Intent objectlistView = new Intent(Update_Add_Activity.this, AddActivity.class);
                startActivity(objectlistView);
            }
        });
    }
}