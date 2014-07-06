package com.acmsong.susustomach;

import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.acmsong.Utils.AllUtils;

public class ShowContent extends Activity {
	
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_showcontent);

		Intent intent = getIntent();
		String value = intent.getStringExtra("textIntent");
		tv = (TextView)findViewById(R.id.txt);
		tv.setMovementMethod(ScrollingMovementMethod.getInstance());
		tv.setTextColor(Color.BLACK);

		try {
			InputStream inputStream = getResources().openRawResource(
					R.raw.class.getField(value).getInt(new R.drawable()));
			tv.setText(AllUtils.getString(inputStream));

		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
