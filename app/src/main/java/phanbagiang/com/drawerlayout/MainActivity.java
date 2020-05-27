package phanbagiang.com.drawerlayout;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DrawerLayout myDrawerLayout;
    ActionBarDrawerToggle myToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        myDrawerLayout=findViewById(R.id.dwContent);
        myToggle=new ActionBarDrawerToggle(this,myDrawerLayout,R.string.open,R.string.close);
        myDrawerLayout.addDrawerListener(myToggle);
        myToggle.syncState();
         //show icon draw in actionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(myToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
