package ua.clean.project.cleanarchitecture.presentation.login;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.clean.project.cleanarchitecture.R;
import ua.clean.project.cleanarchitecture.databinding.FragmentLoginBinding;
import ua.clean.project.cleanarchitecture.presentation.users.UserFragment;
import ua.clean.project.cleanarchitecture.presentation.view.model.UserViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment implements LoginContract.ILoginView {
    private LoginContract.ILoginPresenter mLoginPresenter;

    public LoginFragment() {
        // Required empty public constructor
    }

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mLoginPresenter = new LoginPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_login, container, false);
        binding.setModel(new UserViewModel());
        binding.setListener(mLoginPresenter);

        return binding.getRoot();
    }

    @Override
    public void successRegistration() {
        getFragmentManager().beginTransaction()
                .replace(R.id.container, UserFragment.getInstance(), UserFragment.class.getSimpleName())
                .addToBackStack(null)
                .commit();
    }
}
