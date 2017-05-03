package com.DinhVietDe.onclickinxml;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText edta,edtb;
	Button bttong;
	TextView txtxkq;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edta=(EditText)findViewById(R.id.editsoa);
		edtb=(EditText)findViewById(R.id.editb);
		bttong=(Button)findViewById(R.id.btntong);
		txtxkq=(TextView)findViewById(R.id.kq);
	}
public void tong (View v)
{
	int a=Integer.parseInt(edta.getText()+"");
	int b=Integer.parseInt(edtb.getText()+"");
	txtxkq.setText((a+b)+"");
	
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
