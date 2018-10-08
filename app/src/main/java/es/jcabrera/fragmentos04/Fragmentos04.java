package es.jcabrera.fragmentos04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

public class Fragmentos04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos04);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        WindowManager wm = getWindowManager();
        Display pantalla = wm.getDefaultDisplay();

        if (pantalla.getRotation() == Surface.ROTATION_90 || pantalla.getRotation() == Surface.ROTATION_270){
            Fragmento2 fragmento2 = new Fragmento2();
            fragmentTransaction.replace(android.R.id.content, fragmento2)
                    .commit();
        }else {
            Fragmento1 fragmento1 = new Fragmento1();
            fragmentTransaction.replace(android.R.id.content, fragmento1)
                    .commit();
        }

    }

}
