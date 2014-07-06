package com.acmsong.susustomach;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class B extends Activity {

	private TextView tv1;
	private TextView tv2;
	private TextView tv3;
	private TextView tv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b);

		tv1 = (TextView) findViewById(R.id.txt_simpleaction);
		tv1.setOnClickListener(new MyTextViewListener("simpleaction"));
		
		tv2 = (TextView) findViewById(R.id.txt_coldaction);
		tv2.setOnClickListener(new MyTextViewListener("coldaction"));
		
		tv3 = (TextView) findViewById(R.id.txt_toeaction);
		tv3.setOnClickListener(new MyTextViewListener("toeaction"));
		
		tv4 = (TextView) findViewById(R.id.txt_twelveaction);
		tv4.setOnClickListener(new MyTextViewListener("twelveaction"));
	}

	class MyTextViewListener implements OnClickListener {
		private String param;

		public MyTextViewListener(String p) {
			param = p;
		}

		@Override
		public void onClick(View v) {
			// 生成一个Intent对象
			Intent intent = new Intent();

			// 附加数据Extras
			intent.putExtra("textIntent", param);

			intent.setClass(B.this, ShowContent.class);
			startActivity(intent);
		}

	}
}
