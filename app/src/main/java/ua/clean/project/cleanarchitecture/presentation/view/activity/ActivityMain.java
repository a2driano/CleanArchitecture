package ua.clean.project.cleanarchitecture.presentation.view.activity;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ua.clean.project.cleanarchitecture.R;
import ua.clean.project.cleanarchitecture.presentation.login.LoginFragment;

public class ActivityMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startFragment();
    }

    private void startFragment() {
        FragmentManager manager = getSupportFragmentManager();
        LoginFragment fragment = LoginFragment.newInstance();
        manager.beginTransaction()
                .add(R.id.container, fragment, LoginFragment.class.getSimpleName())
                .commit();
    }
}
