package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button topButton;
    Button bottomButton;
    int storyIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyIndex == 1 || storyIndex == 2) {
                    t3Story();
                } else if (storyIndex == 3) {
                    storyTextView.setText(R.string.T6_End);
                    hideButtons();
                }
            }

            private void t3Story() {
                storyTextView.setText(R.string.T3_Story);
                topButton.setText(R.string.T3_Ans1);
                bottomButton.setText(R.string.T3_Ans2);
                storyIndex = 3;
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyIndex == 1) {
                    t2Story();
                } else if (storyIndex == 3) {
                    storyTextView.setText(R.string.T5_End);
                    hideButtons();
                } else if (storyIndex == 2) {
                    storyTextView.setText(R.string.T4_End);
                    hideButtons();
                }
            }

            private void t2Story() {
                storyTextView.setText(R.string.T2_Story);
                topButton.setText(R.string.T2_Ans1);
                bottomButton.setText(R.string.T2_Ans2);
                storyIndex = 2;
            }
        });
    }

    void hideButtons() {
        topButton.setVisibility(View.GONE);
        bottomButton.setVisibility(View.GONE);
    }
}
