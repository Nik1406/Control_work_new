package com.example.control_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity_1 extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8;
    CheckBox checkBox, checkBox2,checkBox3,checkBox4,checkBox5;
    android.widget.TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_1);

        checkBox = findViewById(R.id.checkBox);  //Отлавливаем Чекбоксы в коде
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Вы выбрали ответ №1",Toast.LENGTH_LONG).show();

            }
        });
        checkBox2 = findViewById(R.id.checkBox2);  //Отлавливаем Чекбоксы в коде
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Вы выбрали ответ №2",Toast.LENGTH_LONG).show();

            }
        });
        checkBox3 = findViewById(R.id.checkBox3);  //Отлавливаем Чекбоксы в коде
        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Вы выбрали ответ №3",Toast.LENGTH_LONG).show();

            }
        });
        checkBox4 = findViewById(R.id.checkBox4);  //Отлавливаем Чекбоксы в коде
        checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Вы выбрали ответ №4",Toast.LENGTH_LONG).show();

            }
        });
        checkBox5 = findViewById(R.id.checkBox5);  //Отлавливаем Чекбоксы в коде
        checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Вы выбрали ответ №5",Toast.LENGTH_LONG).show();

            }
        });
        checkBox.setText("Необходимо устроиться на работу ... грузчиком");
        checkBox2.setText("Необходимо много думать и практиковаться");
        checkBox3.setText("Никак");
        checkBox4.setText("Купить диплом в подземном переходе");
        checkBox5.setText("вариант ответа №5");

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Нажата кнопка Следующий вопрос",Toast.LENGTH_LONG).show();
            }
        });

        button7 = findViewById(R.id.button7); //Отлавливаем кнопки в коде
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Нажата кнопка Ответить",Toast.LENGTH_LONG).show();
            }
        });

        button8 = findViewById(R.id.button8); //Отлавливаем кнопки в коде
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Нажата кнопка предыдущий вопрос",Toast.LENGTH_LONG).show();
            }
        });

        button1 = findViewById(R.id.button1); //Отлавливаем кнопки в коде
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Нажата кнопка Вопрос №1",Toast.LENGTH_LONG).show();
            }
        });

        button2 = findViewById(R.id.button2); //Отлавливаем кнопки в коде
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Нажата кнопка Вопрос №2",Toast.LENGTH_LONG).show();
            }
        });

        button3 = findViewById(R.id.button3); //Отлавливаем кнопки в коде
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Нажата кнопка Вопрос №3",Toast.LENGTH_LONG).show();
            }
        });

        button4 = findViewById(R.id.button4); //Отлавливаем кнопки в коде
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Нажата кнопка Вопрос №4",Toast.LENGTH_LONG).show();
            }
        });
        button5 = findViewById(R.id.button5); //Отлавливаем кнопки в коде
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"Нажата кнопка Вопрос №5",Toast.LENGTH_LONG).show();
            }
        });
    }
}