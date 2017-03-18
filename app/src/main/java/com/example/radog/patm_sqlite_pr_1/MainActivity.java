package com.example.radog.patm_sqlite_pr_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.etFirstName) EditText etFirstName;
    @BindView(R.id.etLastName) EditText etLastName;
    @BindView(R.id.etAddress) EditText etAddress;
    @BindView(R.id.etSalary) EditText etSalary;
    @BindView(R.id.tvData) TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.ibtnAdd)
    private void ibtnAdd() {

    }

    @OnClick(R.id.ibtnUpdate)
    private void ibtnUpdate() {

    }

    @OnClick(R.id.ibtnDelete)
    private void ibtnDelete() {

    }

    @OnClick(R.id.ibtnShow)
    private void ibtnShow() {

    }
}
