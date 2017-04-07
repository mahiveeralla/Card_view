package myproject.card_view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.audiofx.BassBoost;
import android.media.audiofx.PresetReverb;
import android.provider.ContactsContract;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends ActionBarActivity {

    private DrawerLayout drawerLayout;
    private ListView listView;


    // private Button login,registation;
    // BottomBar mbottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigationdrawer);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawerlist);
        listView=(ListView)findViewById(R.id.drawerlist1);

     /*   login=(Button)findViewById(R.id.login);
        registation=(Button)findViewById(R.id.registation);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });*/



        /*stubList = (ViewStub) findViewById(R.id.stub_list);
        stubGrid = (ViewStub) findViewById(R.id.mygridview);

        stubList.inflate();
        stubGrid.inflate();

        listView = (ListView) findViewById(R.id.myListview);
        gridView = (GridView) findViewById(R.id.mygridview);

        getProductList();
        SharedPreferences sharedPreferences = getSharedPreferences("ViewMode", MODE_PRIVATE);
        currentViewMode = sharedPreferences.getInt("currentViewMode", View_Mode_ListView);

        listView.setOnItemClickListener(onItemClick);
        gridView.setOnItemClickListener(onItemClick);
        switchView();

    }

    private void switchView() {
        if (View_Mode_ListView == currentViewMode) ;
        stubList.setVisibility(View.VISIBLE);
        stubGrid.setVisibility(View.GONE);
    }
    {
        stubList.setVisibility(View.GONE);
        stubGrid.setVisibility(View.VISIBLE);
    }

    MainActivity() {

    }

    private void setAdapters(){
       if (View_Mode_ListView==currentViewMode){
           listViewAdapter=new ListViewAdapter(this,R.layout.list_item,productList);
           listView.setAdapter(listViewAdapter);
       }else {
           gridViewAdapter=new GridViewAdapter(this,R.layout.grid_item,productList);
           gridView.setAdapter(gridViewAdapter);
       }
   }





    public List<Product>getProductList(){
        productList=new ArrayList<>();
        productList.add(new Product(R.drawable.usa,"Title 1","This is descrption 1"));
        productList.add(new Product(R.drawable.usa,"Title 2","This is descrption 2"));
        productList.add(new Product(R.drawable.usa,"Title 3","This is descrption 3"));
        productList.add(new Product(R.drawable.usa,"Title 4","This is descrption 4"));
        productList.add(new Product(R.drawable.usa,"Title 5","This is descrption 5"));
        productList.add(new Product(R.drawable.usa,"Title 6","This is descrption 6"));
        productList.add(new Product(R.drawable.usa,"Title 7","This is descrption 7"));
        productList.add(new Product(R.drawable.usa,"Title 8","This is descrption 8"));
        productList.add(new Product(R.drawable.usa,"Title 9","This is descrption 9"));
        productList.add(new Product(R.drawable.usa,"Title 10","This is descrption 10"));
        return productList;
    }

    private int Position;
    AdapterView.OnItemClickListener onItemClick=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            int position;
            Toast.makeText(getApplicationContext(),productList.get(Position).getTitle() + " - "+productList.get(Position).getDescription(),Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_menu_1:
                if (View_Mode_ListView==currentViewMode){
                    currentViewMode=View_Mode_GridView;
                } else {
                    currentViewMode=View_Mode_ListView;
                }
                switchView();
                SharedPreferences sharedPreferences= getSharedPreferences("ViewMode",MODE_PRIVATE);
                Editor editor= (Editor) sharedPreferences.edit();
                editor.putInt("currentViewMode",currentViewMode);
                editor.commit();
                break;
        }
        return true;
    }

    private class Editor {
    }

    private class Product {
        public String getTitle() {

        }


    }*/
    }
}
