package com.example.presentes;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFriendClass extends MainActivity {
	
	EditText editName;//, editDate;
	String name;
	//Date data;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_friend_activity);
		
		editName = (EditText)findViewById(R.id.editName);
		//editDate = (EditText)findViewById(R.id.editDate);
	}
	
	public void buttonsAddFriend(View v){
		switch(v.getId()){
		case R.id.imageButton1:
			Toast.makeText(this,"Abrir galeria\nEscolher foto",Toast.LENGTH_SHORT).show();
			break;

		case R.id.add_present_button:
			name = editName.getText().toString();
			Toast.makeText(this, name + " adicionado!",Toast.LENGTH_SHORT).show();
			break;
		}
	}

}
