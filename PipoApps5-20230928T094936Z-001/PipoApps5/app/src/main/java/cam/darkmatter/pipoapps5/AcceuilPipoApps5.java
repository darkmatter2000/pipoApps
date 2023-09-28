package cam.darkmatter.pipoapps5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import cam.darkmatter.pipoapps5.piposhop.AcceuilPipoShop;

public class AcceuilPipoApps5 extends AppCompatActivity {

    private ImageButton lanceracceuilpiposhop ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuilpipoapps5);


        this.lanceracceuilpiposhop = findViewById(R.id.Buttonpshop);
        lanceracceuilpiposhop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lanceracceuilpiposhop = new Intent(getApplicationContext(), AcceuilPipoShop.class);
                startActivity(lanceracceuilpiposhop);
                onPause();

            }
        });


    }
}
