package com.example.andrewlewis.fitly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.http.HEAD;

import static com.example.andrewlewis.fitly.R.id.hamburger_menu;

<<<<<<<HEAD
        =======
        >>>>>>>c9480c0da5ea7a956b684b16b4862d2d8c34f4c1

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.loginPageButton)
    Button loginPageButton;

    @Bind(hamburger_menu)
    ImageView hamburgerMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
<<<<<<<HEAD
        ImageView hamburgerMenu = (ImageView) findViewById(hamburger_menu);
        hamburgerMenu.setImageResource(R.drawable.hamburgermenu);

        Toast.makeText(this, "Hey There", Toast.LENGTH_SHORT).show();
=======

        ImageView hamburgerMenu = (ImageView) findViewById(hamburger_menu);
        hamburgerMenu.setImageResource(R.drawable.hamburgermenu);


>>>>>>> c9480c0da5ea7a956b684b16b4862d2d8c34f4c1
    }

    @OnClick(hamburger_menu)
    public void setHamburgerMenu(){
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.loginPageButton)
    public void setLoginPageButton() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}
