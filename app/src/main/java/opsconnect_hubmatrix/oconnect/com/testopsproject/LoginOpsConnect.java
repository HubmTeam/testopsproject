package opsconnect_hubmatrix.oconnect.com.testopsproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class LoginOpsConnect extends AppCompatActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView txt = findViewById(R.id.txt);
		txt.setText("Welcome Login Ops jbjh  gvjhsgvjs ");
		Toast.makeText(getApplicationContext(), " Hello Login  ", Toast.LENGTH_LONG).show();
	}
}
