package ind.david.beatpermintue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //todo: setContentView changed to R.layout.activity_login_page

        setContentView(R.layout.activity_login_page);


    }


    /**
     * todo by calling this method the onClick already been clicked. No need to create an onClick where
     * we already recognized onClick
     */
    public void signmein(View view) {
        Intent intent = new Intent(LoginPage.this, MainActivity.class);
        startActivity(intent);
    }

    /* old code
    public void signmein(View view) {
        findViewById(R.id.signinbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    */
}
//}

