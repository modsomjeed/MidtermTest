package th.ac.pim.midtermtest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GetResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_get_result);
		setResult(42);
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.get_result, menu);
		return true;
	}

}
