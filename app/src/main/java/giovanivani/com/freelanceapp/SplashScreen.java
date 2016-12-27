package giovanivani.com.freelanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends Activity {

    //Tempo da Splash Screen

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            /*
             * Exibindo a Splash Screen com um timer
             */

            @Override
            public void run() {
                // Esse método será executado sempre que o time acabar
                // Inicia a Activity Principal
                Intent i = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(i);

                // Fecha Activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
