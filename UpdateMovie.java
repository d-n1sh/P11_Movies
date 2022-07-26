package sg.edu.rp.c346.id21012612.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class UpdateMovie extends AppCompatActivity {

    ArrayList<Movie> alMovie;
    EditText title;
    EditText genre;
    EditText year;
    Spinner spnRating;
    Button btnUpdate;
    Button btnDelete;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_movie);

        title = findViewById(R.id.edittTitle);
        genre = findViewById(R.id.edittGenre);
        year = findViewById(R.id.edittYear);
        spnRating = findViewById(R.id.spinnerRating);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        btnCancel = findViewById(R.id.btnCancel);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int x = 0; x < alMovie.size(); x++) {
                    alMovie.get(x).setTitle(title.getText().toString());
                    alMovie.get(x).setGenre(genre.getText().toString());
                    alMovie.get(x).setYear(year.getText().toString());
                    alMovie.get(x).setRating(spnRating);
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UpdateMovie.this, ShowMovie.class);
                startActivity(i);
            }
        });

    }
}