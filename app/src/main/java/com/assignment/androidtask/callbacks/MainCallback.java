package com.assignment.androidtask.callbacks;

import com.assignment.androidtask.model.api.MachineResponse;

import java.util.List;

public interface MainCallback {

    void assetsList(List<MachineResponse.DataBean.AssetsBean> value);

}
