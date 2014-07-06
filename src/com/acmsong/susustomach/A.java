package com.acmsong.susustomach;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class A extends Activity {

	private TextView tv1;
	private TextView tv2;
	private TextView tv3;
	private TextView tv4;
	private TextView tv5;
	private TextView tv6;
	private TextView tv7;
	private TextView tv8;
	private TextView tv9;
	private TextView tv10;
	private TextView tv11;
	private TextView tv12;
	private TextView tv13;
	private TextView tv14;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a);

		tv1 = (TextView) findViewById(R.id.txt_morning);
		tv1.setOnClickListener(new MyTextViewListener("morning"));

		tv2 = (TextView) findViewById(R.id.txt_illnesstip);
		tv2.setOnClickListener(new MyTextViewListener("illnesstip"));

		tv3 = (TextView) findViewById(R.id.txt_fiveheal);
		tv3.setOnClickListener(new MyTextViewListener("fiveheal"));

		tv4 = (TextView) findViewById(R.id.txt_normalfood);
		tv4.setOnClickListener(new MyTextViewListener("normalfood"));

		tv5 = (TextView) findViewById(R.id.txt_threeseven);
		tv5.setOnClickListener(new MyTextViewListener("threeseven"));

		tv6 = (TextView) findViewById(R.id.txt_stopeat);
		tv6.setOnClickListener(new MyTextViewListener("stopeat"));

		tv7 = (TextView) findViewById(R.id.txt_everyillness);
		tv7.setOnClickListener(new MyTextViewListener("everyillness"));

		tv8 = (TextView) findViewById(R.id.txt_warnthing);
		tv8.setOnClickListener(new MyTextViewListener("warnthing"));

		tv9 = (TextView) findViewById(R.id.txt_raremethod);
		tv9.setOnClickListener(new MyTextViewListener("raremethod"));

		tv10 = (TextView) findViewById(R.id.txt_dayhealth);
		tv10.setOnClickListener(new MyTextViewListener("dayhealth"));

		tv11 = (TextView) findViewById(R.id.txt_dontsix);
		tv11.setOnClickListener(new MyTextViewListener("dontsix"));

		tv12 = (TextView) findViewById(R.id.txt_errorfour);
		tv12.setOnClickListener(new MyTextViewListener("errorfour"));

		tv13 = (TextView) findViewById(R.id.txt_bean);
		tv13.setOnClickListener(new MyTextViewListener("bean"));

		tv14 = (TextView) findViewById(R.id.txt_irritatefood);
		tv14.setOnClickListener(new MyTextViewListener("irritatefood"));
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

			intent.setClass(A.this, ShowContent.class);
			startActivity(intent);
		}

	}
}
