package imageforbutton.example.com.imageforbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  void imageButton(View view){

        ImageButton imagestorage= (ImageButton) findViewById(R.id.imageButton);
        imagestorage.setImageResource(R.drawable.eidmubarak);

        Toast.makeText(MainActivity.this,"Image Update Successfully",Toast.LENGTH_LONG).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
