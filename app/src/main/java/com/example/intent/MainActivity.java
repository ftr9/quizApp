package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private String[] questions = {
            "1. India is next to nepal.", //true
            "2. Kathmandu is capital city of nepal.", //true
            "3. Dhindo meal is the most popular Nepal dish.", //false //
            "4. The world’s highest mountain is in Nepal and is it called Everest.", //true,
            "5. When Everest was first climbed eraser was left at the top.", //false,
            "6. The flag of Nepal is made up from three flags. ", //false
            "7. Polo is a game played on horses but in Nepal dog is used. ", //false
            "8. In Nepal it is said when a young person loses a tooth if a bird sees it a new tooth will not grow.", //true
            "9. The national bird of Nepal is called Daphe ", //true
            "10. Each year around 3000 new cases of leprosy are found in Nepal. " //true
    };
    private boolean[] answers = {true,true,false,true,false,false,false,true,true,true};
    private  Button yesButton;
    private Button noButton;
    private TextView totalText;
    private  TextView totalScore;
    private int currentQuestionPointer = 0;
    private int score = 1;
    private TextView questionView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questionView =  findViewById(R.id.textView2);
        yesButton = findViewById(R.id.button2);
        noButton = findViewById(R.id.button3);
        totalText = findViewById(R.id.textView3);
        totalScore = findViewById(R.id.textView4);
        questionView.setText(questions[0]);

    }

    public void onYesClicked(View view){
        if(currentQuestionPointer == questions.length-1){
            totalText.setText("Total score:");
            totalScore.setText(score + "/"+questions.length);

        }else{
            if(answers[currentQuestionPointer]){
                score++;
            }
            questionView.setText(questions[++currentQuestionPointer]);
        }
    }

    public void onNoClicked(View view){
        if(currentQuestionPointer == questions.length-1) {
            totalText.setText("Total score:");
            totalScore.setText(score + "/"+questions.length);
        }else {
            if (!answers[currentQuestionPointer]) {
                score++;
            }
            questionView.setText(questions[++currentQuestionPointer]);
        }
    }



}