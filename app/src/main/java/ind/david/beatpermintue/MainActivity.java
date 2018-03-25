package ind.david.beatpermintue;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // מה שצריך לעשות זה לזהות היכן הכפתורים ולנצב אותם

    private EditText enterbpm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //todo: setContentView line moved up in the method. and change to R.layout.activity_main
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);


        enterbpm = findViewById(R.id.enterbpm);
        automaticConvert();
    }



    public void signmein(View view) {
        findViewById(R.id.signinbtn).setOnClickListener(new View.OnClickListener() {
            //            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(MainActivity.this, LoginPage.class);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                }
            }
        });

    }



    public void automaticConvert() {
        enterbpm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try {
                    String s = enterbpm.getText().toString();
                    Double converstringtodoubble = Double.valueOf(s);


                    // כאן יהיו כל החישובים
                    Double n1 = 60000 / converstringtodoubble * 4;
                    Double n2 = 60000 / converstringtodoubble * 2;
                    Double n4 = 60000 / converstringtodoubble;
                    Double n8 = 60000 / converstringtodoubble / 2;
                    Double n16 = 60000 / converstringtodoubble / 4;
                    Double n32 = 60000 / converstringtodoubble / 8;


                    String ms = " ms";


                    //output:
                    // רק צריך למצוא את השם של התיבה לפעמים זה עושה בעיות - התיבה של האינפוט נקראת פה למשל ״קופסא אחת״ אז לשים לב לזה יותר !
                    // ואז לפעולות חישוב נקרא להם לפי השם שקראנו להם בדאבל
                    // נאתר את הכפתור ונכניס את זה בסט טקסט לסטרינג וברגע שנלחץ על הכפתור זה יציג את זה

                    EditText e1 = findViewById(R.id.oneBox);
                    e1.setText(n1.toString() + ms);


                    EditText e2 = findViewById(R.id.twoBox);
                    e2.setText(n2.toString() + ms);


                    EditText e3 = findViewById(R.id.fourBox);
                    e3.setText(n4.toString() + ms);

                    EditText e4 = findViewById(R.id.eightBox);
                    e4.setText(n8.toString() + ms);

                    EditText e5 = findViewById(R.id.fiveBox);
                    e5.setText(n16.toString() + ms);

                    EditText e6 = findViewById(R.id.sixBox);
                    e6.setText(n32.toString() + ms);


                    EditText e7 = findViewById(R.id.sevenBox);
                    e7.setText(n64.toString() + ms);


                    EditText e8 = findViewById(R.id.onetwoeightBox);
                    e8.setText(n128.toString() + ms);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


    }


}

