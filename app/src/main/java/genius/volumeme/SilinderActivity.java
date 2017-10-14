package genius.volumeme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SilinderActivity extends AppCompatActivity {
    private EditText edtRadius, edtTinggi;
    private Button btnHitung;
    private TextView txtVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silinder);

        getSupportActionBar().setTitle("Hitung Volume Silinder");

        edtRadius = (EditText) findViewById(R.id.edt_radius3);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi3);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtVolume = (TextView) findViewById(R.id.txt_volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = edtRadius.getText().toString().trim();
                String tinggi = edtTinggi.getText().toString().trim();

                double r = Double.parseDouble(radius);
                double t = Double.parseDouble(tinggi);
                double volume = 22  * r * r * t / 7;

                txtVolume.setText("Volume : " + volume);
            }
        });
    }
}
