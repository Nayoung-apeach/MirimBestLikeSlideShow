package kr.hs.emirim.s2019w04.mirimbestlikeslideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class ResultActivity extends AppCompatActivity{
    Button prev;
    Button next;
    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        flipper = (ViewFlipper) findViewById(R.id.flipper);
        prev = (Button) findViewById(R.id.prev);
        next = (Button) findViewById(R.id.next);
        prev.setOnClickListener((View.OnClickListener) this);
        next.setOnClickListener((View.OnClickListener) this);
    }
    public ResultActivity(View v){
        if(v==prev){
            flipper.showPrevious();
        }
        else if(v==next){
            flipper.showNext();
        }
    }
}