package course.examples.permissionexample.boomUser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class BoomUserActivity extends Activity {

	// String used to represent the dangerous operation
	private static final String ACTION_BOOM = "course.examples.permissionexample.boom.boom_action";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.boom_user_layout);

		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {

			// Called when the user clicks on the Detonate Button
			@Override
			public void onClick(View v) {
				
				// Create an implicit Intent using the Action String ACTION_BOOM
				// Launch an Activity that can receive the Intent using Activity.startActivity()  
				startActivity(new Intent(ACTION_BOOM));
			}
		});
	}
}
