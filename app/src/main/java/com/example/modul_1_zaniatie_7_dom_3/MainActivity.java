package com.example.modul_1_zaniatie_7_dom_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//adding ArrayList of logins already registered
        ArrayList<String> listLogin = new ArrayList<>();
        listLogin.add("luda1990");
        listLogin.add("valera1122");
        listLogin.add("kingofeverything");
        listLogin.add("workhardplayhard");

        String login = "powershot";
        String email = "donthesitate2222@mail.com";
        String password = "12345abc";
        String confirmPassword = "12345abc";
        int age = 12;
        String address = "Ukraine, Kyiv, Khreschatyk st., 26, 01001";

        String emailCheck = "@.";
        String emailInput = "";
        //can be done as: int emailCheck = 0;
        //search for "@". if "@" was found, then emailCheck += 1; 'emailCheck = 1'
        //then search for ".". if "." was found, then emailCheck += 1; 'emailCheck = 2'
        //if (emailCheck == 2) > OK, else > something wasn't found
        String countryCheck = "Ukraine";
        String countryInput = "";

//login check
        for (int i = 0; i < listLogin.size(); i++){
            if (login.equals(listLogin.get(i))){
                Log.d("MYLOG", "This login is already taken. Please, choose another one.");
            }else if (i == listLogin.size()-1){
                Log.d("MYLOG", "Your login was successfully created. It was: " + login);
            }


        }
//email check
        for (int i = 0; i < email.length(); i++){
            String emailChar = String.valueOf(email.charAt(i));
//search @ and .
            if (emailChar.equals("@")){
                emailInput += emailChar;
            }else if (emailChar.equals(".")){
                emailInput += emailChar;
            }
        }

        if (emailInput.equals(emailCheck)){
            Log.d("MYLOG", "Email is fine.");
        }else {
            Log.d("MYLOG", "Please, check your email. Something wrong.");
        }
//password check
        if (password.equals(confirmPassword)){
            Log.d("MYLOG", "Password confirmed.");
        }else {
            Log.d("MYLOG", "Check password. You put in different passwords.");
        }
//age check
        if (age >= 18){
            Log.d("MYLOG", "Your age is fine.");
        }else {
            Log.d("MYLOG", "Your age is less than 18 years. Please, try again later.");
        }
//country check
        for (int i = 0; i < address.length(); i++){
            String addressChar = String.valueOf(address.charAt(i));
            if (addressChar.equals(",") || addressChar.equals(" ")){
                countryInput = "";
            }else {
                countryInput = countryInput + addressChar;
            }
            if (countryInput.equals(countryCheck)){
                Log.d("MYLOG", "You are from " + countryInput + ". All fine.");
                break;
            }
            if ((i == address.length()-1) && (!countryInput.equals(countryCheck))){
                Log.d("MYLOG", "Excuse me. We don't support customers outside the " + countryCheck);
            }
        }
//country check can be done as:
//add ArrayList 'countryCheck' of all countries. Then compare countryInput with ArrayList 'countryCheck'

    }
}