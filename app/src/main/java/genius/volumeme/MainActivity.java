package genius.volumeme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cube = (Button) findViewById(R.id.btnCube);
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, CubeActivity.class);
                startActivity(intent);
            }
        });

        Button silinder = (Button) findViewById(R.id.btnSilinder);
        silinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, SilinderActivity.class);
                startActivity(intent);
            }
        });
        Button limas = (Button) findViewById(R.id.btnLimas);
        limas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, LimasActivity.class);
                startActivity(intent);
            }
        });
        Button bola = (Button) findViewById(R.id.btnBola);
        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, BolaActivity.class);
                startActivity(intent);

            }
        });

        Button exit = (Button) findViewById(R.id.btn_exit);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}






