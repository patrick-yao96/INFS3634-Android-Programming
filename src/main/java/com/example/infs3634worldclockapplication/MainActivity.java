package com.example.infs3634worldclockapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating the Sydney time
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
        String sydneyCurrentTime = "default";
        TextView sydney_time = findViewById(R.id.sydney_time);
        int sydney_hour = calendar1.get(Calendar.HOUR);
        if(calendar1.get(Calendar.AM_PM)==1){
            if(calendar1.get(Calendar.MINUTE)<10){
                sydneyCurrentTime = sydney_hour+":0"+calendar1.get(Calendar.MINUTE)+" PM";
            }else{
                sydneyCurrentTime = sydney_hour+":"+calendar1.get(Calendar.MINUTE)+" PM";
            }
        }
        else{
            if(calendar1.get(Calendar.MINUTE)<10){
                sydneyCurrentTime = sydney_hour+":0"+calendar1.get(Calendar.MINUTE)+" AM";
            }else{
                sydneyCurrentTime = sydney_hour+":"+calendar1.get(Calendar.MINUTE)+" AM";
            }
        }
        sydney_time.setText(sydneyCurrentTime);

        //Sydney Layout color

        TextView sydney_name = findViewById(R.id.sydney_name);
        ImageView sydney_pic = findViewById(R.id.sydney_image);
        sydney_name.setBackgroundColor(Color.parseColor("#FF8C00"));
        sydney_time.setBackgroundColor(Color.parseColor("#FF8C00"));
        sydney_pic.setBackgroundColor(Color.parseColor("#FF8C00"));

        //Creating Honolulu time

        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("Pacific/Honolulu"));
        String honoluluCurrentTime = "default";
        TextView honolulu_time = findViewById(R.id.honolulu_time);
        int honolulu_hour = Math.abs(calendar2.get(Calendar.HOUR));
        if(calendar2.get(Calendar.AM_PM)==1){
            if(calendar2.get(Calendar.MINUTE)<10){
                honoluluCurrentTime = honolulu_hour+":0"+calendar2.get(Calendar.MINUTE)+" PM";
            }else{
                honoluluCurrentTime = honolulu_hour+":"+calendar2.get(Calendar.MINUTE)+" PM";
            }
        }
        else{
            if(calendar2.get(Calendar.MINUTE)<10){
                honoluluCurrentTime = honolulu_hour+":0"+calendar2.get(Calendar.MINUTE)+" AM";
            }else{
                honoluluCurrentTime = honolulu_hour+":"+calendar2.get(Calendar.MINUTE)+" AM";
            }


        }
        honolulu_time.setText(honoluluCurrentTime);

        //honolulu Layout color

        TextView honolulu_name = findViewById(R.id.honolulu_name);
        ImageView honolulu_pic = findViewById(R.id.honolulu_image);
        honolulu_name.setBackgroundColor(Color.parseColor("#FED8B1"));
        honolulu_time.setBackgroundColor(Color.parseColor("#FED8B1"));
        honolulu_pic.setBackgroundColor(Color.parseColor("#FED8B1"));

        //Creating Seattle time

        Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("PST8PDT"));
        String seattleCurrentTime = "default";
        TextView seattle_time = findViewById(R.id.seattle_time);
        int seattle_hour = Math.abs(calendar3.get(Calendar.HOUR));
        if(calendar3.get(Calendar.AM_PM)==1){
            if(calendar3.get(Calendar.MINUTE)<10){
                seattleCurrentTime = seattle_hour+":0"+calendar3.get(Calendar.MINUTE)+" PM";
            }else{
                seattleCurrentTime = seattle_hour+":"+calendar3.get(Calendar.MINUTE)+" PM";
            }
        }
        else{
            if(calendar3.get(Calendar.MINUTE)<10){
                seattleCurrentTime = seattle_hour+":0"+calendar3.get(Calendar.MINUTE)+" AM";
            }else{
                seattleCurrentTime = seattle_hour+":"+calendar3.get(Calendar.MINUTE)+" AM";
            }


        }
        seattle_time.setText(seattleCurrentTime);

        //Seattle Layout color

        TextView seattle_name = findViewById(R.id.seattle_name);
        ImageView seattle_pic = findViewById(R.id.seattle_image);
        seattle_name.setBackgroundColor(Color.parseColor("#FF8C00"));
        seattle_time.setBackgroundColor(Color.parseColor("#FF8C00"));
        seattle_pic.setBackgroundColor(Color.parseColor("#FF8C00"));

        //Creating Shanghai time

        Calendar calendar4 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
        String shanghaiCurrentTime = "default";
        TextView shanghai_time = findViewById(R.id.shanghai_time);
        int shanghai_hour = Math.abs(calendar4.get(Calendar.HOUR));
        if(calendar4.get(Calendar.AM_PM)==1){
            if(calendar4.get(Calendar.MINUTE)<10){
                shanghaiCurrentTime = shanghai_hour+":0"+calendar4.get(Calendar.MINUTE)+" PM";
            }else{
                shanghaiCurrentTime = shanghai_hour+":"+calendar4.get(Calendar.MINUTE)+" PM";
            }
        }
        else{
            if(calendar4.get(Calendar.MINUTE)<10){
                shanghaiCurrentTime = shanghai_hour+":0"+calendar4.get(Calendar.MINUTE)+" AM";
            }else{
                shanghaiCurrentTime = shanghai_hour+":"+calendar4.get(Calendar.MINUTE)+" AM";
            }


        }
        shanghai_time.setText(shanghaiCurrentTime);

        //Shanghai Layout color

        TextView shanghai_name = findViewById(R.id.shanghai_name);
        ImageView shanghai_pic = findViewById(R.id.shanghai_image);
        shanghai_name.setBackgroundColor(Color.parseColor("#FED8B1"));
        shanghai_time.setBackgroundColor(Color.parseColor("#FED8B1"));
        shanghai_pic.setBackgroundColor(Color.parseColor("#FED8B1"));

        //Creating Amsterdam time

        Calendar calendar5 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Amsterdam"));
        String amsterdamCurrentTime = "default";
        TextView amsterdam_time = findViewById(R.id.amsterdam_time);
        int amsterdam_hour = Math.abs(calendar5.get(Calendar.HOUR));
        if(calendar5.get(Calendar.AM_PM)==1){
            if(calendar5.get(Calendar.MINUTE)<10){
            amsterdamCurrentTime = amsterdam_hour+":0"+calendar5.get(Calendar.MINUTE)+" PM";
            }else{
                amsterdamCurrentTime = amsterdam_hour+":"+calendar5.get(Calendar.MINUTE)+" PM";
            }
        }
        else{
            if(calendar5.get(Calendar.MINUTE)<10){
                amsterdamCurrentTime = amsterdam_hour+":0"+calendar5.get(Calendar.MINUTE)+" AM";
            }else{
                amsterdamCurrentTime = amsterdam_hour+":"+calendar5.get(Calendar.MINUTE)+" AM";
            }


        }

        amsterdam_time.setText( amsterdamCurrentTime);


        //Amsterdam Layout color

        TextView amsterdam_name = findViewById(R.id.amsterdam_name);
        ImageView amsterdam_pic = findViewById(R.id.amsterdam_image);
        amsterdam_name.setBackgroundColor(Color.parseColor("#FF8C00"));
        amsterdam_time.setBackgroundColor(Color.parseColor("#FF8C00"));
        amsterdam_pic.setBackgroundColor(Color.parseColor("#FF8C00"));

        //Update time 12HR Format
        Button update12 = findViewById(R.id.update12);
        update12.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                //Sydney
                Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
                String sydneyCurrentTime = "default";
                TextView sydney_time = findViewById(R.id.sydney_time);
                int sydney_hour = calendar1.get(Calendar.HOUR);
                if(calendar1.get(Calendar.AM_PM)==1){
                    if(calendar1.get(Calendar.MINUTE)<10){
                        sydneyCurrentTime = sydney_hour+":0"+calendar1.get(Calendar.MINUTE)+" PM";
                    }else{
                        sydneyCurrentTime = sydney_hour+":"+calendar1.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar1.get(Calendar.MINUTE)<10){
                        sydneyCurrentTime = sydney_hour+":0"+calendar1.get(Calendar.MINUTE)+" AM";
                    }else{
                        sydneyCurrentTime = sydney_hour+":"+calendar1.get(Calendar.MINUTE)+" AM";
                    }
                }
                sydney_time.setText(sydneyCurrentTime);
                //Honolulu
                Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("Pacific/Honolulu"));
                String honoluluCurrentTime = "default";
                TextView honolulu_time = findViewById(R.id.honolulu_time);
                int honolulu_hour = Math.abs(calendar2.get(Calendar.HOUR));
                if(calendar2.get(Calendar.AM_PM)==1){
                    if(calendar2.get(Calendar.MINUTE)<10){
                        honoluluCurrentTime = honolulu_hour+":0"+calendar2.get(Calendar.MINUTE)+" PM";
                    }else{
                        honoluluCurrentTime = honolulu_hour+":"+calendar2.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar2.get(Calendar.MINUTE)<10){
                        honoluluCurrentTime = honolulu_hour+":0"+calendar2.get(Calendar.MINUTE)+" AM";
                    }else{
                        honoluluCurrentTime = honolulu_hour+":"+calendar2.get(Calendar.MINUTE)+" AM";
                    }


                }
                honolulu_time.setText(honoluluCurrentTime);
                //Seattle
                Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("PST8PDT"));
                String seattleCurrentTime = "default";
                TextView seattle_time = findViewById(R.id.seattle_time);
                int seattle_hour = Math.abs(calendar3.get(Calendar.HOUR));
                if(calendar3.get(Calendar.AM_PM)==1){
                    if(calendar3.get(Calendar.MINUTE)<10){
                        seattleCurrentTime = seattle_hour+":0"+calendar3.get(Calendar.MINUTE)+" PM";
                    }else{
                        seattleCurrentTime = seattle_hour+":"+calendar3.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar3.get(Calendar.MINUTE)<10){
                        seattleCurrentTime = seattle_hour+":0"+calendar3.get(Calendar.MINUTE)+" AM";
                    }else{
                        seattleCurrentTime = seattle_hour+":"+calendar3.get(Calendar.MINUTE)+" AM";
                    }


                }
                seattle_time.setText(seattleCurrentTime);
                //Shanghai
                Calendar calendar4 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
                String shanghaiCurrentTime = "default";
                TextView shanghai_time = findViewById(R.id.shanghai_time);
                int shanghai_hour = Math.abs(calendar4.get(Calendar.HOUR));
                if(calendar4.get(Calendar.AM_PM)==1){
                    if(calendar4.get(Calendar.MINUTE)<10){
                        shanghaiCurrentTime = shanghai_hour+":0"+calendar4.get(Calendar.MINUTE)+" PM";
                    }else{
                        shanghaiCurrentTime = shanghai_hour+":"+calendar4.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar4.get(Calendar.MINUTE)<10){
                        shanghaiCurrentTime = shanghai_hour+":0"+calendar4.get(Calendar.MINUTE)+" AM";
                    }else{
                        shanghaiCurrentTime = shanghai_hour+":"+calendar4.get(Calendar.MINUTE)+" AM";
                    }


                }
                shanghai_time.setText(shanghaiCurrentTime);
                //amsterdam
                Calendar calendar5 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Amsterdam"));
                String amsterdamCurrentTime = "default";
                TextView amsterdam_time = findViewById(R.id.amsterdam_time);
                int amsterdam_hour = Math.abs(calendar5.get(Calendar.HOUR));
                if(calendar5.get(Calendar.AM_PM)==1){
                    if(calendar5.get(Calendar.MINUTE)<10){
                        amsterdamCurrentTime = amsterdam_hour+":0"+calendar5.get(Calendar.MINUTE)+" PM";
                    }else{
                        amsterdamCurrentTime = amsterdam_hour+":"+calendar5.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar5.get(Calendar.MINUTE)<10){
                        amsterdamCurrentTime = amsterdam_hour+":0"+calendar5.get(Calendar.MINUTE)+" AM";
                    }else{
                        amsterdamCurrentTime = amsterdam_hour+":"+calendar5.get(Calendar.MINUTE)+" AM";
                    }


                }

                amsterdam_time.setText( amsterdamCurrentTime);

            }

        });

        //Update time 24HR Format

        Button update24 = findViewById(R.id.update24);
        update24.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                //Sydney
                Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
                String sydneyCurrentTime = "default";
                TextView sydney_time = findViewById(R.id.sydney_time);
                int sydney_hour = calendar1.get(Calendar.HOUR);
                if(calendar1.get(Calendar.AM_PM)==1){
                    if(calendar1.get(Calendar.MINUTE)<10){
                        sydneyCurrentTime = (sydney_hour+12)+":0"+calendar1.get(Calendar.MINUTE)+" PM";
                    }else{
                        sydneyCurrentTime = (sydney_hour+12)+":"+calendar1.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar1.get(Calendar.MINUTE)<10){
                        sydneyCurrentTime = sydney_hour+":0"+calendar1.get(Calendar.MINUTE)+" AM";
                    }else{
                        sydneyCurrentTime = sydney_hour+":"+calendar1.get(Calendar.MINUTE)+" AM";
                    }
                }
                sydney_time.setText(sydneyCurrentTime);
                //Honolulu
                Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("Pacific/Honolulu"));
                String honoluluCurrentTime = "default";
                TextView honolulu_time = findViewById(R.id.honolulu_time);
                int honolulu_hour = Math.abs(calendar2.get(Calendar.HOUR));
                if(calendar2.get(Calendar.AM_PM)==1){
                    if(calendar2.get(Calendar.MINUTE)<10){
                        honoluluCurrentTime = (honolulu_hour+12)+":0"+calendar2.get(Calendar.MINUTE)+" PM";
                    }else{
                        honoluluCurrentTime = (honolulu_hour+12)+":"+calendar2.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar2.get(Calendar.MINUTE)<10){
                        honoluluCurrentTime = honolulu_hour+":0"+calendar2.get(Calendar.MINUTE)+" AM";
                    }else{
                        honoluluCurrentTime = honolulu_hour+":"+calendar2.get(Calendar.MINUTE)+" AM";
                    }


                }
                honolulu_time.setText(honoluluCurrentTime);
                //Seattle
                Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("PST8PDT"));
                String seattleCurrentTime = "default";
                TextView seattle_time = findViewById(R.id.seattle_time);
                int seattle_hour = Math.abs(calendar3.get(Calendar.HOUR));
                if(calendar3.get(Calendar.AM_PM)==1){
                    if(calendar3.get(Calendar.MINUTE)<10){
                        seattleCurrentTime = (seattle_hour+12)+":0"+calendar3.get(Calendar.MINUTE)+" PM";
                    }else{
                        seattleCurrentTime = (seattle_hour+12)+":"+calendar3.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar3.get(Calendar.MINUTE)<10){
                        seattleCurrentTime = seattle_hour+":0"+calendar3.get(Calendar.MINUTE)+" AM";
                    }else{
                        seattleCurrentTime = seattle_hour+":"+calendar3.get(Calendar.MINUTE)+" AM";
                    }


                }
                seattle_time.setText(seattleCurrentTime);
                //Shanghai
                Calendar calendar4 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
                String shanghaiCurrentTime = "default";
                TextView shanghai_time = findViewById(R.id.shanghai_time);
                int shanghai_hour = Math.abs(calendar4.get(Calendar.HOUR));
                if(calendar4.get(Calendar.AM_PM)==1){
                    if(calendar4.get(Calendar.MINUTE)<10){
                        shanghaiCurrentTime = (shanghai_hour+12)+":0"+calendar4.get(Calendar.MINUTE)+" PM";
                    }else{
                        shanghaiCurrentTime = (shanghai_hour+12)+":"+calendar4.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar4.get(Calendar.MINUTE)<10){
                        shanghaiCurrentTime = shanghai_hour+":0"+calendar4.get(Calendar.MINUTE)+" AM";
                    }else{
                        shanghaiCurrentTime = shanghai_hour+":"+calendar4.get(Calendar.MINUTE)+" AM";
                    }


                }
                shanghai_time.setText(shanghaiCurrentTime);
                //amsterdam
                Calendar calendar5 = Calendar.getInstance(TimeZone.getTimeZone("Europe/Amsterdam"));
                String amsterdamCurrentTime = "default";
                TextView amsterdam_time = findViewById(R.id.amsterdam_time);
                int amsterdam_hour = Math.abs(calendar5.get(Calendar.HOUR));
                if(calendar5.get(Calendar.AM_PM)==1){
                    if(calendar5.get(Calendar.MINUTE)<10){
                        amsterdamCurrentTime = (amsterdam_hour+12)+":0"+calendar5.get(Calendar.MINUTE)+" PM";
                    }else{
                        amsterdamCurrentTime = (amsterdam_hour+12)+":"+calendar5.get(Calendar.MINUTE)+" PM";
                    }
                }
                else{
                    if(calendar5.get(Calendar.MINUTE)<10){
                        amsterdamCurrentTime = amsterdam_hour+":0"+calendar5.get(Calendar.MINUTE)+" AM";
                    }else{
                        amsterdamCurrentTime = amsterdam_hour+":"+calendar5.get(Calendar.MINUTE)+" AM";
                    }


                }

                amsterdam_time.setText( amsterdamCurrentTime);

            }

        });













    }
}
