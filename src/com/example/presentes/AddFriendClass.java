package com.example.presentes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFriendClass extends MainActivity {
	
	EditText editName;//need do add anniversary date;
	//String name;
	//Date data;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_friend_activity);
		
		editName = (EditText)findViewById(R.id.editName);
		//editDate = (EditText)findViewById(R.id.editDate);
	}
	
	public void buttons_AddFriend(View v){
		switch(v.getId()){
		case R.id.imageButton1:
			Toast.makeText(this,"Abrir galeria\nEscolher foto",Toast.LENGTH_SHORT).show();
			break;

		case R.id.add_friend_button:
			Friend newFriend = new Friend();//creat new object
			newFriend.name = editName.getText().toString();//add name to object newFriend
			//call function to create new friend
			System.out.println(newFriend);//test
			Toast.makeText(this, newFriend.name + " adicionado!",Toast.LENGTH_SHORT).show();
			this.finish();
			break;
			
		case R.id.add_gift_button:
			Intent addGift = new Intent(this, AddGiftClass.class);
			startActivity(addGift);
		}
	}

}
