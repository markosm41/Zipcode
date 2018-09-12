package com.markosm41gmail.zipcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private final zipcodes zipcodes = new Zipcodes ();
private EditText city_text; code_text;
private ListView listView;
private ArrayAdapter<Zipcode> adapter;
private List<Zipcode> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        city_text = findViewById(R.id.text_city);
        code_text = findViewById(R.id.text_code);
        listView = findViewById(R.id.ListView1);

    }
    public void  onSearch(View view){
        list = zipcodes.search(code_text.getText).toString(). trim(),city_text.getText()
                toString().trim());
adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);
listView.setAdapter(adapter);

    }
public void onClear(View view){
        code_text.setText("");
        city_tect.setCity("");
        list.clear();
        adapter.notifyDataSetChanged();
}

}
