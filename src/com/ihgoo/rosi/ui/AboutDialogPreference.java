package com.ihgoo.rosi.ui;

import com.ihgoo.rosi.R;

import android.content.Context;
import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;

public class AboutDialogPreference extends DialogPreference {
	private final String LOG_TAG = getClass().getSimpleName();

	public AboutDialogPreference(Context paramContext,
			AttributeSet paramAttributeSet) {
		super(paramContext, paramAttributeSet);
	}

	protected void onBindDialogView(View paramView) {
		Log.v(this.LOG_TAG, "onBindDialogView");
		((WebView) paramView).loadUrl("file:///android_asset/html/about.html");
	}

	public void onClick(DialogInterface paramDialogInterface, int paramInt) {
		Log.v(this.LOG_TAG, "onClick");
	}

	protected View onCreateDialogView() {
		Log.v(this.LOG_TAG, "onCreateDialogView");
		return ((LayoutInflater) getContext().getSystemService(
				"layout_inflater")).inflate(R.layout.dialog_about, null);
	}
}
