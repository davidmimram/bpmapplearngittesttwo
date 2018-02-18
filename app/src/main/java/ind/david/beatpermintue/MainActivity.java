package ind.david.beatpermintue;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* הקוד מתחת יגרום לזה שהמסך לא יתהפך .. לרשום אותו במחברת.*/
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_login_page);
    }



    public void signmein(View view) {
        findViewById(R.id.signinbtn).setOnClickListener(new View.OnClickListener() {
//            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginPage.class);
                startActivity(intent);
            }
        });

    }




    public void btnConvert(View btnconvert) {

        // זה מה שהיוזר הכניס
        /////////// שורה ראשונה והסבר///////
        /// בשורה זו נעשה את כל ההגדרות הראשונות - למשל היכן המשתמש מקליד ואז נהפוך את הטקסט שלו לסטרינג ואז נקח את הסטרינג ונהפוך אותו לדאבל - ודאבל הזה נשתמש בחישובים שלנו הרי זה מה שהיוזר הזין ועם זה אנחנו רוצים להשתמש
        EditText enterbpm = findViewById(R.id.enterbpm);
        String s = enterbpm.getText().toString();
        Double converstringtodoubble = Double.valueOf(s);


        // כאן יהיו כל החישובים
        Double n1 = 60000 / converstringtodoubble * 4;
        Double n2 = 60000 / converstringtodoubble * 2;
        Double n4 = 60000 / converstringtodoubble;
        Double n8 = 60000 / converstringtodoubble / 2;
        Double n16 = 60000 / converstringtodoubble / 4;
        Double n32 = 60000 / converstringtodoubble / 8;
        Double n64 = 60000 / converstringtodoubble / 16;
        Double n128 = 60000 / converstringtodoubble / 32;

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


    }



//    public void signinbtn(View view) {
//
//        findViewById(R.id.signinbtn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//                Intent intent = new Intent(MainActivity.this, LoginPage.class);
//                startActivity(intent);
//            }
//        });

            }


//}