package ua.clean.project.cleanarchitecture.presentation.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ua.clean.project.cleanarchitecture.R;
import ua.clean.project.cleanarchitecture.data.model.User;
import ua.clean.project.cleanarchitecture.presentation.presenter.UserPresenter;
import ua.clean.project.cleanarchitecture.presentation.presenter.contract.UserContract;
import ua.clean.project.cleanarchitecture.presentation.view.adapter.UserAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment implements UserContract.IUserView {
    private RecyclerView mRecyclerView;
    private UserContract.IUserPresenter mUserPresenter;
    private UserAdapter mUserAdapter;


    public UserFragment() {
        // Required empty public constructor
    }

    public static UserFragment getInstance() {
        return new UserFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mUserPresenter = new UserPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_user, container, false);

        mRecyclerView = rootView.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //invoke Adapter
        mUserPresenter.getData();
        return rootView;
    }

    @Override
    public void setData(List<User> list) {
        mUserAdapter = new UserAdapter(list);
        mRecyclerView.setAdapter(mUserAdapter);
    }
}
