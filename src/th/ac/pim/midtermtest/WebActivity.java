package th.ac.pim.midtermtest;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class WebActivity extends Activity {

	ListView list;
	String[] web = { "Google Plus", "Twitter", "Windows", "Bing", "Itunes",
			"Wordpress", "Drupal" };
	Integer[] imageId = { R.drawable.image1, R.drawable.image2,
			R.drawable.image3, R.drawable.image4, R.drawable.image5,
			R.drawable.image6, R.drawable.image7

	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);

		CustomList adapter = new CustomList(WebActivity.this, web, imageId);
		list = (ListView) findViewById(R.id.list);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(WebActivity.this,
						"You Clicked at " + web[+position], Toast.LENGTH_SHORT)
						.show();
				
			
			if(web[+position] == "Twitter")
			{
				Intent intent = new Intent(WebActivity.this, GridActivity.class);
				startActivity(intent);
			}
			}
		});
		

	}
}
