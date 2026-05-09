package com.example.sqliteapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    EditText txtId, txtNombre, txtCorreo, txtTelefono;
    Button btnGuardar, btnConsultar,
            btnActualizar, btnEliminar;

    TextView txtResultado;

    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtId = findViewById(R.id.txtId);
        txtNombre = findViewById(R.id.txtNombre);
        txtCorreo = findViewById(R.id.txtCorreo);
        txtTelefono = findViewById(R.id.txtTelefono);

        btnGuardar = findViewById(R.id.btnGuardar);
        btnConsultar = findViewById(R.id.btnConsultar);
        btnActualizar = findViewById(R.id.btnActualizar);
        btnEliminar = findViewById(R.id.btnEliminar);

        txtResultado = findViewById(R.id.txtResultado);

        dbHelper = new DatabaseHelper(this);

        btnGuardar.setOnClickListener(v -> {

            String nombre = txtNombre.getText().toString();
            String correo = txtCorreo.getText().toString();
            String telefono = txtTelefono.getText().toString();

            if(nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty()){

                Toast.makeText(this,
                        "Complete todos los campos",
                        Toast.LENGTH_SHORT).show();

            }else{

                SQLiteDatabase db = dbHelper.getWritableDatabase();

                ContentValues values = new ContentValues();

                values.put("nombre", nombre);
                values.put("correo", correo);
                values.put("telefono", telefono);

                db.insert("usuarios", null, values);

                Toast.makeText(this,
                        "Usuario guardado",
                        Toast.LENGTH_SHORT).show();
            }
        });
        btnConsultar.setOnClickListener(v -> {

            SQLiteDatabase db = dbHelper.getReadableDatabase();

            Cursor cursor = db.rawQuery(
                    "SELECT * FROM usuarios",
                    null);

            String datos = "";

            while(cursor.moveToNext()){

                datos += "ID: " + cursor.getInt(0) + "\n";
                datos += "Nombre: " + cursor.getString(1) + "\n";
                datos += "Correo: " + cursor.getString(2) + "\n";
                datos += "Telefono: " + cursor.getString(3) + "\n\n";
            }

            txtResultado.setText(datos);
        });
        btnActualizar.setOnClickListener(v -> {

            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();

            values.put("nombre", txtNombre.getText().toString());
            values.put("correo", txtCorreo.getText().toString());
            values.put("telefono", txtTelefono.getText().toString());

            db.update(
                    "usuarios",
                    values,
                    "id=?",
                    new String[]{txtId.getText().toString()}
            );

            Toast.makeText(this,
                    "Usuario actualizado",
                    Toast.LENGTH_SHORT).show();
        });
        btnEliminar.setOnClickListener(v -> {

            SQLiteDatabase db = dbHelper.getWritableDatabase();

            db.delete(
                    "usuarios",
                    "id=?",
                    new String[]{txtId.getText().toString()}
            );

            Toast.makeText(this,
                    "Usuario eliminado",
                    Toast.LENGTH_SHORT).show();
        });
    }
}