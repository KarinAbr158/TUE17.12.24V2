package com.example.tue171224;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MemePlayer> memePlayers = new ArrayList<>();
    int[] memeImages = {R.drawable.baseline_play_arrow_24, R.drawable.baseline_stop_24, R.drawable.baseline_skip_next_24, R.drawable.baseline_skip_previous_24};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void setMemePlayers(){
        String[] memeNames = getResources().getStringArray(R.array.play_gallery);

        for(int i = 0; i < memeNames.length; i++){
            memePlayers.add(new MemePlayer(memeNames[i],
                    memeImages[i]);
        }
    }
}