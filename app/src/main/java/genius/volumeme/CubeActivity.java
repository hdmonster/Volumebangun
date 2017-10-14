package genius.volumeme;

import android.content.Intent;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CubeActivity extends AppCompatActivity {
    private EditText edtSisi;
    private Button btnHitung;
    private TextView txtVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        getSupportActionBar().setTitle("Hitung Volume Cube");

        edtSisi = (EditText) findViewById(R.id.edt_sisi);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtVolume = (TextView) findViewById(R.id.txt_volume);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sisi = edtSisi.getText().toString().trim();

                double s = Double.parseDouble(sisi);

                double volume = s * s * s;

                txtVolume.setText("Volume : " + volume);
            }

        });


    }
}
