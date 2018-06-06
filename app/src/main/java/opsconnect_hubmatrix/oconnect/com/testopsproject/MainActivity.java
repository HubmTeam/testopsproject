package opsconnect_hubmatrix.oconnect.com.testopsproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView txt = findViewById(R.id.txt);
		txt.setText("Welcome to Github");
		Toast.makeText(getApplicationContext(), " Hello cvdjhvcghvccghc ", Toast.LENGTH_LONG).show();
	}
}
