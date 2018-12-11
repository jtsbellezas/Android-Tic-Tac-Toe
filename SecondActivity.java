package com.example.akaybanez.ybanez_4;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SecondActivity extends AppCompatActivity {
    TextView timer;

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16;
    int[] alphabetArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    int index;
    String corr, inco;
    //int correctScore, incorrectScore;

    private int[] btns = new int[]{
            R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6,
            R.id.button7, R.id.button8, R.id.button9,
            R.id.button10, R.id.button11, R.id.button12,
            R.id.button13, R.id.button14, R.id.button15,
            R.id.button16
    };

    private static final String FORMAT ="%02d";
    int buttonNumber = 1;
    int firstNumber, secondNumber;
    int firstClick, secondClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        timer = (TextView) findViewById(R.id.timerTxt);

        __init__();

        button1.setTag("0");
        button2.setTag("1");
        button3.setTag("2");
        button4.setTag("3");
        button5.setTag("4");
        button6.setTag("5");
        button7.setTag("6");
        button8.setTag("7");
        button9.setTag("8");
        button10.setTag("9");
        button11.setTag("10");
        button12.setTag("11");
        button13.setTag("12");
        button14.setTag("13");
        button15.setTag("14");
        button16.setTag("15");

        shuffleArray(alphabetArray);

        //correctScore = Integer.parseInt(cr.getText().toString());
        //incorrectScore = Integer.parseInt(incr.getText().toString());

        final String questionMark = this.getResources().getString(R.string.unknown);
        boolean []chosen_already = new boolean[8];
        String atrr = "";

        //Timer
        CountDownTimer cdTimer = new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText(String.valueOf((int) (millisUntilFinished / 1000)));

                button1.setClickable(false);
                button2.setClickable(false);
                button3.setClickable(false);
                button4.setClickable(false);
                button5.setClickable(false);
                button6.setClickable(false);
                button7.setClickable(false);
                button8.setClickable(false);
                button9.setClickable(false);
                button10.setClickable(false);
                button11.setClickable(false);
                button12.setClickable(false);
                button13.setClickable(false);
                button14.setClickable(false);
                button15.setClickable(false);
                button16.setClickable(false);
            }
            @Override
            public void onFinish() {
                timer.setText(" ");

                for (int i = 0; i < 16; i++) {
                    Button btn = findViewById(btns[i]);
                    btn.setText(questionMark);
                    btn.setClickable(true);
                }
            }
        }; cdTimer.start();

        for(int i = 0; i < 16; i++) {
            Button btn = findViewById(btns[i]);
           // convAlpha(btn, i);
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button1, theCard);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button2, theCard);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button3, theCard);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button4, theCard);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button5, theCard);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button6, theCard);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button7, theCard);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button8, theCard);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button9, theCard);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button10, theCard);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button11, theCard);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button12, theCard);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button13, theCard);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button14, theCard);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button15, theCard);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                checkAlpha(button16, theCard);
            }
        });

        /*new CountDownTimer(4000, 1000) { // adjust the milli seconds here

            public void onTick(long millisUntilFinished) {

                timer.setText(""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                button1.setClickable(false);
                button2.setClickable(false);
                button3.setClickable(false);
                button4.setClickable(false);
                button5.setClickable(false);
                button6.setClickable(false);
                button7.setClickable(false);
                button8.setClickable(false);
                button9.setClickable(false);
                button10.setClickable(false);
                button11.setClickable(false);
                button12.setClickable(false);
                button13.setClickable(false);
                button14.setClickable(false);
                button15.setClickable(false);
                button16.setClickable(false);
            }

            public void onFinish() {
                for(int i = 0; i < 16; i++){
                    Button btn = findViewById(btns[i]);
                    btn.setText(questionMark);
                    btn.setClickable(true);
                }
            }
        }.start();*/

    }

    static void shuffleArray(int[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }


    private void convAlpha(Button btn, int index) {
        if(alphabetArray[index] == 1) {
            btn.setText("A");
        } else if(alphabetArray[index] == 2) {
            btn.setText("B");
        } else if(alphabetArray[index] == 3) {
            btn.setText("C");
        } else if(alphabetArray[index] == 4) {
            btn.setText("D");
        } else if(alphabetArray[index] == 5) {
            btn.setText("E");
        } else if(alphabetArray[index] == 6) {
            btn.setText("F");
        } else if(alphabetArray[index] == 7) {
            btn.setText("G");
        } else if(alphabetArray[index] == 8) {
            btn.setText("H");
        } else if(alphabetArray[index] == 9) {
            btn.setText("A");
        } else if(alphabetArray[index] == 10) {
            btn.setText("B");
        } else if(alphabetArray[index] == 11) {
            btn.setText("C");
        } else if(alphabetArray[index] == 12) {
            btn.setText("D");
        } else if(alphabetArray[index] == 13) {
            btn.setText("E");
        } else if(alphabetArray[index] == 14) {
            btn.setText("F");
        } else if(alphabetArray[index] == 15) {
            btn.setText("G");
        } else if(alphabetArray[index] == 16) {
            btn.setText("H");
        }
    }
    private void checkAlpha(Button btn, int index) {

        if(alphabetArray[index] == 1) {
            btn.setText("A");
        } else if(alphabetArray[index] == 2) {
            btn.setText("B");
        } else if(alphabetArray[index] == 3) {
            btn.setText("C");
        } else if(alphabetArray[index] == 4) {
            btn.setText("D");
        } else if(alphabetArray[index] == 5) {
            btn.setText("E");
        } else if(alphabetArray[index] == 6) {
            btn.setText("F");
        } else if(alphabetArray[index] == 7) {
            btn.setText("G");
        } else if(alphabetArray[index] == 8) {
            btn.setText("H");
        } else if(alphabetArray[index] == 9) {
            btn.setText("A");
        } else if(alphabetArray[index] == 10) {
            btn.setText("B");
        } else if(alphabetArray[index] == 11) {
            btn.setText("C");
        } else if(alphabetArray[index] == 12) {
            btn.setText("D");
        } else if(alphabetArray[index] == 13) {
            btn.setText("E");
        } else if(alphabetArray[index] == 14) {
            btn.setText("F");
        } else if(alphabetArray[index] == 15) {
            btn.setText("G");
        } else if(alphabetArray[index] == 16) {
            btn.setText("H");
        }

        if(buttonNumber == 1) {
            firstNumber = alphabetArray[index];
            if(firstNumber > 8) {
                firstNumber = firstNumber - 8;
            }
            buttonNumber = 2;
            firstClick = index;

            btn.setEnabled(false);
        } else if(buttonNumber == 2) {
            secondNumber = alphabetArray[index];
            if(secondNumber > 8) {
                secondNumber = secondNumber - 8;
            }
            buttonNumber = 1;
            secondClick = index;

            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 2000);
        }
    }

    private void calculate() {
        if(firstNumber == secondNumber) {
            if(firstClick == 0) {
                button1.setOnClickListener(null);
                button1.setPressed(true);
            } else if(firstClick == 1) {
                button2.setOnClickListener(null);
                button2.setPressed(true);
            } else if(firstClick == 2) {
                button3.setOnClickListener(null);
                button3.setPressed(true);
            } else if(firstClick == 3) {
                button4.setOnClickListener(null);
                button4.setPressed(true);
            } else if(firstClick == 4) {
                button5.setOnClickListener(null);
                button5.setPressed(true);
            } else if(firstClick == 5) {
                button6.setOnClickListener(null);
                button6.setPressed(true);
            } else if(firstClick == 6) {
                button7.setOnClickListener(null);
                button7.setPressed(true);
            } else if(firstClick == 7) {
                button8.setOnClickListener(null);
                button8.setPressed(true);
            } else if(firstClick == 8) {
                button9.setOnClickListener(null);
                button9.setPressed(true);
            } else if(firstClick == 9) {
                button10.setOnClickListener(null);
                button10.setPressed(true);
            } else if(firstClick == 10) {
                button11.setOnClickListener(null);
                button11.setPressed(true);
            } else if(firstClick == 11) {
                button12.setOnClickListener(null);
                button12.setPressed(true);
            } else if(firstClick == 12) {
                button13.setOnClickListener(null);
                button13.setPressed(true);
            } else if(firstClick == 13) {
                button14.setOnClickListener(null);
                button14.setPressed(true);
            } else if(firstClick == 14) {
                button15.setOnClickListener(null);
                button15.setPressed(true);
            } else if(firstClick == 15) {
                button16.setOnClickListener(null);
                button16.setPressed(true);
            }

            if(secondClick == 0) {
                button1.setOnClickListener(null);
                button1.setPressed(true);
            } else if(secondClick == 1) {
                button2.setOnClickListener(null);
                button2.setPressed(true);
            } else if(secondClick == 2) {
                button3.setOnClickListener(null);
                button3.setPressed(true);
            } else if(secondClick == 3) {
                button4.setOnClickListener(null);
                button4.setPressed(true);
            } else if(secondClick == 4) {
                button5.setOnClickListener(null);
                button5.setPressed(true);
            } else if(secondClick == 5) {
                button6.setOnClickListener(null);
                button6.setPressed(true);
            } else if(secondClick == 6) {
                button7.setOnClickListener(null);
                button7.setPressed(true);
            } else if(secondClick == 7) {
                button8.setOnClickListener(null);
                button8.setPressed(true);
            } else if(secondClick == 8) {
                button9.setOnClickListener(null);
                button9.setPressed(true);
            } else if(secondClick == 9) {
                button10.setOnClickListener(null);
                button10.setPressed(true);
            } else if(secondClick == 10) {
                button11.setOnClickListener(null);
                button11.setPressed(true);
            } else if(secondClick == 11) {
                button12.setOnClickListener(null);
                button12.setPressed(true);
            } else if(secondClick == 12) {
                button13.setOnClickListener(null);
                button13.setPressed(true);
            } else if(secondClick == 13) {
                button14.setOnClickListener(null);
                button14.setPressed(true);
            } else if(secondClick == 14) {
                button15.setOnClickListener(null);
                button15.setPressed(true);
            } else if(secondClick == 15) {
                button16.setOnClickListener(null);
                button16.setPressed(true);
            }
            //correctScore += 1;
            //corr = Integer.toString(correctScore);
            //cr.setText(corr);

        } else {

            if(firstClick == 0) {
                button1.setText("???");
            } else if(firstClick == 1) {
                button2.setText("???");
            } else if(firstClick == 2) {
                button3.setText("???");
            } else if(firstClick == 3) {
                button4.setText("???");
            } else if(firstClick == 4) {
                button5.setText("???");
            } else if(firstClick == 5) {
                button6.setText("???");
            } else if(firstClick == 6) {
                button7.setText("???");
            } else if(firstClick == 7) {
                button8.setText("???");
            } else if(firstClick == 8) {
                button9.setText("???");
            } else if(firstClick == 9) {
                button10.setText("???");
            } else if(firstClick == 10) {
                button11.setText("???");
            } else if(firstClick == 11) {
                button12.setText("???");
            } else if(firstClick == 12) {
                button13.setText("???");
            } else if(firstClick == 13) {
                button14.setText("???");
            } else if(firstClick == 14) {
                button15.setText("???");
            } else if(firstClick == 15) {
                button16.setText("???");
            }

            if(secondClick == 0) {
                button1.setText("???");
            } else if(secondClick == 1) {
                button2.setText("???");
            } else if(secondClick == 2) {
                button3.setText("???");
            } else if(secondClick == 3) {
                button4.setText("???");
            } else if(secondClick == 4) {
                button5.setText("???");
            } else if(secondClick == 5) {
                button6.setText("???");
            } else if(secondClick == 6) {
                button7.setText("???");
            } else if(secondClick == 7) {
                button8.setText("???");
            } else if(secondClick == 8) {
                button9.setText("???");
            } else if(secondClick == 9) {
                button10.setText("???");
            } else if(secondClick == 10) {
                button11.setText("???");
            } else if(secondClick == 11) {
                button12.setText("???");
            } else if(secondClick == 12) {
                button13.setText("???");
            } else if(secondClick == 13) {
                button14.setText("???");
            } else if(secondClick == 14) {
                button15.setText("???");
            } else if(secondClick == 15) {
                button16.setText("???");

            }
            //incorrectScore += 1;
            //inco = Integer.toString(incorrectScore);
            //incr.setText(inco);
        }

        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button10.setEnabled(true);
        button11.setEnabled(true);
        button12.setEnabled(true);
        button13.setEnabled(true);
        button14.setEnabled(true);
        button15.setEnabled(true);
        button16.setEnabled(true);
    }
    //TextView cr, incr;

    private void __init__() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        timer= (TextView) findViewById(R.id.timerTxt);

        //cr = findViewById(R.id.correct);
        //incr = findViewById(R.id.incorr);
    }

}