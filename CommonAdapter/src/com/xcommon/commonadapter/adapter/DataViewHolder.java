package com.xcommon.commonadapter.adapter;

import java.util.HashMap;

import android.view.View;

public class DataViewHolder {
	HashMap<Integer, View> mapView = new HashMap<Integer, View>();
	HashMap<String, Object> mapData = new HashMap<String, Object>();

	public void setView(int key, View v) {
		this.mapView.put(key, v);
	}

	@SuppressWarnings("unchecked")
	public <T> T getView(int key) {
		return (T) this.mapView.get(key);
	}

	@SuppressWarnings("unchecked")
	public <T> T getView(Class<T> clazz, int key) {
		return (T) this.mapView.get(key);
	}

	public void setData(String key, Object value) {
		mapData.put(key, value);
	}

	@SuppressWarnings("unchecked")
	public <T> T getData(String key) {
		return (T) mapData.get(key);
	}

	@SuppressWarnings("unchecked")
	public <T> T getData(Class<T> clazz, String key) {
		return (T) mapData.get(key);
	}
}
