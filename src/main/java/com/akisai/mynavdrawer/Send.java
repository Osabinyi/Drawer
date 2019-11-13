package com.akisai.mynavdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Send extends AppCompatActivity {

    EditText email,subject,etmessage;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        email=(EditText)findViewById(R.id.email);
        subject=(EditText)findViewById(R.id.subject);
        etmessage=(EditText)findViewById(R.id.etmessage);

        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to=email.getText().toString();
                String sub=subject.getText().toString();
                String mess=etmessage.getText().toString();

                Intent email= new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT,sub);
                email.putExtra(Intent.EXTRA_TEXT,mess);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Choose an Email client :"));
            }
        });
    }
}
