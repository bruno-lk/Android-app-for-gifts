package com.example.presentes;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddGiftClass extends MainActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_gift_activity);
	}
	
	public void addGiftButton(View v){
		Toast.makeText(this, "Presente adicionado!",Toast.LENGTH_SHORT).show();
	}
}
