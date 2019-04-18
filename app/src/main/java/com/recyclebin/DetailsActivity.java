package com.recyclebin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {
    CircleImageView cImg;
    TextView tvFullName, tvPhoneNo;
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       cImg = findViewById(R.id.imgProfile);
       tvFullName = findViewById(R.id.tvName);
       tvPhoneNo = findViewById(R.id.tvPhone);

       Bundle bundle = getIntent().getExtras();
       if(bundle != null){
            cImg.setImageResource(bundle.getInt("image"));
            tvFullName.setText(bundle.getString("name"));
            tvPhoneNo.setText(bundle.getString("phone"));
       }
    }
}
