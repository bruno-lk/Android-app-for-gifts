package com.example.presentes;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		boolean flag = true;
		if (flag == true){
			setContentView(R.layout.activity_main);
		}else{
			setContentView(R.layout.friends_list_activity);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void addFriend(View v){
		switch(v.getId()){
		case R.id.add_new:
			Intent addFriend = new Intent(this, AddFriendClass.class);
			startActivity(addFriend);
			//Toast.makeText(this,"Chama outra tela",Toast.LENGTH_SHORT).show();
			break;

		case R.id.add_from_fb:
			Toast.makeText(this,"Chama integração com Facebook",Toast.LENGTH_SHORT).show();
			break;
		}
	}
}
