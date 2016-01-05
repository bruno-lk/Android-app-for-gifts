package com.example.presentes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class AddFriendClass extends MainActivity{
	
	EditText editName, editDate;
	String name;
	Calendar date;
	DatePickerDialog datePickerDialog;
	SimpleDateFormat dateFormatter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_friend_activity);
		
		editName = (EditText)findViewById(R.id.editName);
		editDate = (EditText)findViewById(R.id.editDate);
		
		dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
	}
	
	void setDateTimeField(){
		
		date = Calendar.getInstance();
	}
	
	public void buttons_AddFriend(View v){
		switch(v.getId()){
		case R.id.imageButton1:
			Toast.makeText(this,"Abrir galeria\nEscolher foto",Toast.LENGTH_SHORT).show();
			break;

		case R.id.add_friend_button:
			name = editName.getText().toString();
			//date = 
			Friend newFriend = new Friend(name);//create new object and add name to object newFriend
			//call function to create new friend on BD
			
			Toast.makeText(this, newFriend.name + " adicionado!",Toast.LENGTH_SHORT).show();
			this.finish();//finish the intent
			break;
			
		case R.id.add_gift_button:
			Intent addGift = new Intent(this, AddGiftClass.class);
			startActivity(addGift);
			break;
			
		case R.id.editDate:
			setDateTimeField();
			break;
		}
	}

}
