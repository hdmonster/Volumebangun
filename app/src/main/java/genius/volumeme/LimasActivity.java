package genius.volumeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LimasActivity extends AppCompatActivity {
    private TextView txtVolume;
    private Button btnHitung;
    private EditText edtRadius, edtTinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas);

        getSupportActionBar().setTitle("Hitung Volume Kerucut");

        edtRadius = (EditText) findViewById(R.id.edt_radius2);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi1);

        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtVolume = (TextView) findViewById(R.id.txt_volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = edtRadius.getText().toString().trim();
                String tinggi = edtTinggi.getText().toString().trim();

                double r = Double.parseDouble(radius);
                double t = Double.parseDouble(tinggi);

                double volume = 1 * 22 * r * r * t / 21;

                txtVolume.setText("Volume : " + volume);
            }
        });
    }
}
