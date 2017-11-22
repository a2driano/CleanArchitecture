package ua.clean.project.cleanarchitecture.presentation.activity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ua.clean.project.cleanarchitecture.R;
import ua.clean.project.cleanarchitecture.presentation.fragment.FragmentLogin;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startFragment();
    }

    private void startFragment() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentLogin fragment = FragmentLogin.newInstance();
        manager.beginTransaction()
                .add(R.id.container, fragment, FragmentLogin.class.getSimpleName())
                .addToBackStack(null)
                .commit();


    }
}
