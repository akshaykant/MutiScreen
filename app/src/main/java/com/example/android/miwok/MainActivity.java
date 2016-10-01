/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.miwok.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Class auto generated by Data Binding Library
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        binding.numbers.setOnClickListener(this);
        binding.colors.setOnClickListener(this);
        binding.family.setOnClickListener(this);
        binding.phrases.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view == (binding.numbers)){

            Intent intent = new Intent(this, NumbersActivity.class);
            startActivity(intent);
        }

        if(view == (binding.colors)){

            Intent intent = new Intent(this, ColorsActivity.class);
            startActivity(intent);
        }

        if(view == (binding.family)){

            Intent intent = new Intent(this, FamilyActivity.class);
            startActivity(intent);
        }

        if(view == (binding.phrases)){

            Intent intent = new Intent(this, PhrasesActivity.class);
            startActivity(intent);
        }


    }
}