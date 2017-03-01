package th.ac.pim.midtermtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button button1 = (Button)findViewById(R.id.button2);
		final EditText editText1 = (EditText)findViewById(R.id.editText1);
		final EditText editText2 = (EditText)findViewById(R.id.editText2);
		button1.setOnClickListener((new OnClickListener() {
			Intent intent = new Intent(MainActivity.this, WebActivity.class);
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if((editText1.getText().toString().equals("pim"))){
					if((editText2.getText().toString().equals("pim"))){
					startActivity(intent);
					}
			}}
		}));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
