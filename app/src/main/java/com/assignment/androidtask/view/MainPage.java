package com.assignment.androidtask.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import com.assignment.androidtask.App;
import com.assignment.androidtask.Constants;
import com.assignment.androidtask.R;
import com.assignment.androidtask.adapter.RvAdapter;
import com.assignment.androidtask.callbacks.MainCallback;
import com.assignment.androidtask.databinding.ActivityMainPageBinding;
import com.assignment.androidtask.helper.PrefUtils;
import com.assignment.androidtask.model.MainViewModel;
import com.assignment.androidtask.model.api.MachineResponse;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends AppCompatActivity implements MainCallback {

    private ActivityMainPageBinding mActivityMainPageBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActivityMainPageBinding = DataBindingUtil.setContentView(this,R.layout.activity_main_page);

        MainViewModel mainViewModel = new MainViewModel();

        mActivityMainPageBinding.setMainPageModel(mainViewModel);

        mainViewModel.setCallbacks(this);

        mainViewModel.fetchAssets();
    }


    @Override
    public void assetsList(List<MachineResponse.DataBean.AssetsBean> value) {

        List<Object> assetsList = new ArrayList<>();

        assetsList.addAll(value);

        RvAdapter rvAdapter = new RvAdapter(R.layout.item_machine_list,assetsList);
        mActivityMainPageBinding.rvMain.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mActivityMainPageBinding.rvMain.setItemAnimator(new DefaultItemAnimator());
        mActivityMainPageBinding.rvMain.setAdapter(rvAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_logout:
                PrefUtils.setBoolean(Constants.LOGIN, false, App.getAppContext());
                PrefUtils.removeFromPrefs(App.getAppContext(),Constants.ACCESS_TOKEN);
                PrefUtils.removeFromPrefs(App.getAppContext(),Constants.COMPANY_ID);
                Intent intent = new Intent(MainPage.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}

