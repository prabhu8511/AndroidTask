package com.assignment.androidtask.adapter;

import java.util.List;


public class RvAdapter extends BaseAdapter {
    private final int layoutId;
    private List<Object> items;

    public RvAdapter(int layoutId, List<Object> list) {
        this.layoutId = layoutId;
        this.items = list;
    }

    @Override
    protected Object getObjForPosition(int position) {
        return items.get(position);
    }

    @Override
    protected int getLayoutIdForPosition(int position) {
        return layoutId;
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    public List<Object> getItems() {
        return items;
    }
}