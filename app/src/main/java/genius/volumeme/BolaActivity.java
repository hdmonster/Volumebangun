package genius.volumeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BolaActivity extends AppCompatActivity {
    private EditText edt_Radius;
    private Button btnHitung;
    private TextView txtVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        getSupportActionBar().setTitle("Hitung Volume Bola");

        edt_Radius = (EditText) findViewById(R.id.edt_radius);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtVolume = (TextView) findViewById(R.id.txt_volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String radius = edt_Radius.getText().toString().trim();


                double r = Double.parseDouble(radius);

                double volume = 4 * 22 * r * r * r / 21;

                txtVolume.setText("Volume : " + volume);

            }
        });
    }
}
