package bigatimapps.com.example.diegol.sonsbichos;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView btn_cao;
    private ImageView btn_gato;
    private ImageView btn_leao;
    private ImageView btn_macaco;
    private ImageView btn_ovelha;
    private ImageView btn_vaca;
    private MediaPlayer mediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cao = findViewById(R.id.img_cao);
        btn_gato = findViewById(R.id.img_gato);
        btn_leao = findViewById(R.id.img_leao);
        btn_macaco = findViewById(R.id.img_macaco);
        btn_ovelha = findViewById(R.id.img_ovelha);
        btn_vaca = findViewById(R.id.img_vaca);

        btn_cao.setOnClickListener(this);
        btn_gato.setOnClickListener(this);
        btn_leao.setOnClickListener(this);
        btn_macaco.setOnClickListener(this);
        btn_ovelha.setOnClickListener(this);
        btn_vaca.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_cao:
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.cao);
                tocarSom();
                break;

            case R.id.img_gato:
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.gato);
                tocarSom();
                break;

            case R.id.img_leao:
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.leao);
                tocarSom();
                break;

            case R.id.img_macaco:
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.macaco);
                tocarSom();
                break;

            case R.id.img_ovelha:
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.ovelha);
                tocarSom();
                break;

            case R.id.img_vaca:
                mediaplayer = MediaPlayer.create(MainActivity.this, R.raw.vaca);
                tocarSom();
                break;
        }
    }

    private void tocarSom() {
        if (mediaplayer != null) {
            mediaplayer.start();
        }
    }

    private void pararSom() {
        if (mediaplayer != null) {
            mediaplayer.pause();
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaplayer != null) {
            mediaplayer.stop();
            mediaplayer.release();
            Toast.makeText(this, "App Fechado", Toast.LENGTH_SHORT).show();
        }
        super.onDestroy();
    }
}
