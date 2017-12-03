package com.omrobbie.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private TextView tv_menu_name, tv_menu_price;
    private String name, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setupEnv();

        name = getIntent().getStringExtra("name");
        price = getIntent().getStringExtra("price");

        setData(name, price);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mn_shop:
                Toast.makeText(this, "Anda membeli " + name + " seharga " + price, Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupEnv() {
        tv_menu_name = (TextView) findViewById(R.id.tv_menu_name);
        tv_menu_price = (TextView) findViewById(R.id.tv_menu_price);
    }

    private void setData(String name, String price) {
        tv_menu_name.setText(name);
        tv_menu_price.setText(price);
    }
}
