package bpk.light.app4morz;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import bpk.light.app_4_0.R;

/**
 * Created by Admin on 24.08.2017.
 */

public class TwoActivity extends AppCompatActivity {
    ImageView btn_flash,code_morze;
    Camera camera;
    Camera.Parameters params;
    LinearLayout lay;
    String LL = "LightLog", text, text_morze="",st="";
    EditText input_text;
    TextView out_text;
    int i ;
    char t =  '.',T = '-';
    Map hashMap =new HashMap();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        btn_flash = (ImageView) findViewById(R.id.btn_flash);
        input_text = (EditText) findViewById(R.id.input_text);
        code_morze = (ImageView) findViewById(R.id.code_morze);
        out_text = (TextView) findViewById(R.id.out_text);
        lay = (LinearLayout) findViewById(R.id.lay);
        i = 1;
        hashMap.put(" ", "   ");
        hashMap.put("A", "·− ");
        hashMap.put("B", "−··· ");
        hashMap.put("W", "·−− ");
        hashMap.put("G", "−−· ");
        hashMap.put("D", "− · · ");
        hashMap.put("E", "· ");
        hashMap.put("V", "· · · − ");
        hashMap.put("Z", "− − · · ");
        hashMap.put("I", "· · ");
        hashMap.put("J", "· − − − ");
        hashMap.put("K", "− · − ");
        hashMap.put("L", "· − · · ");
        hashMap.put("M", "− − ");
        hashMap.put("N", "− · ");
        hashMap.put("O", "− − − ");
        hashMap.put("P", "· − − · ");
        hashMap.put("R", "· − · ");
        hashMap.put("S", "· · · ");
        hashMap.put("T", "− ");
        hashMap.put("U", "· · − ");
        hashMap.put("F", "· · − · ");
        hashMap.put("H", "· · · · ");
        hashMap.put("C", "− · − · ");
        hashMap.put("1", "· − − − − ");
        hashMap.put("2", "· · − − − ");
        hashMap.put("3", "· · · − − ");
        hashMap.put("4", "· · · · − ");
        hashMap.put("5", "· · · · · ");
        hashMap.put("6", "− · · · · ");
        hashMap.put("7", "− − · · · ");
        hashMap.put("8", "− − − · · ");
        hashMap.put("9", "− − − − · ");
        hashMap.put("0", "− − − − − ");
        hashMap.put("А", "·− ");
        hashMap.put("Б", "−··· ");
        hashMap.put("В", "·−− ");
        hashMap.put("Г", "− − · ");
        hashMap.put("Д", "− · · ");
        hashMap.put("Е", "· ");
        hashMap.put("Ж", "· · · − ");
        hashMap.put("З", "− − · · ");
        hashMap.put("И", "· · ");
        hashMap.put("Й", "· − − − ");
        hashMap.put("К", "− · − ");
        hashMap.put("Л", "· − · · ");
        hashMap.put("М", "− − ");
        hashMap.put("Н", "− · ");
        hashMap.put("О", "− − − ");
        hashMap.put("П", "· − − · ");
        hashMap.put("Р", "· − · ");
        hashMap.put("С", "· · · ");
        hashMap.put("Т", "− ");
        hashMap.put("У", "· · − ");
        hashMap.put("Ф", "· · − · ");
        hashMap.put("Х", "· · · · ");
        hashMap.put("Ц", "− · − · ");
        hashMap.put("Ч", "− − − · ");
        hashMap.put("Ш", "− − − − ");
        hashMap.put("Щ", "− − · − ");
        hashMap.put("Ъ", "− − · − − ");
        hashMap.put("Ы", "− · − − ");
        hashMap.put("Ь", "− · · − ");
        hashMap.put("Э", "· · − · · ");
        hashMap.put("Ю", "· · − − ");
        hashMap.put("Я", "· − · − ");
        hashMap.put(".", "· · · · · · ");
        hashMap.put(",", "· − · − · − ");
        hashMap.put(":", "− − − · · · ");
        hashMap.put(";", "− · − · − · ");
        hashMap.put("-", "− · · · · − ");
        hashMap.put("!", "− − · · − − ");
        hashMap.put("?", "· · − − · · ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        View.OnClickListener Listener = new View.OnClickListener() {
            public void onClick(View v) {
                i++;

            }
        };
        View.OnClickListener Listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                camera = openCamera();
                params = camera.getParameters();
                text = input_text.getText().toString();
                text = text.toUpperCase();
                out_text.setText("");
                Log.d(LL, ""+text);
                text_morze="";
                for (int j=0; j<text.length();j++){
                    text_morze= text_morze+""+hashMap.get(""+text.charAt(j));
                }
                out_text.setText(text_morze);
                if(camera==null){
                    for(int k=0;k<text_morze.length();k++) {
                        if((text_morze.charAt(k))=='·') {
                            lay.setBackgroundColor(getResources().getColor(R.color.blackColor));
                            try {
                                Thread.sleep(500);
                            } catch (Exception e) {
                            }
                            lay.setBackgroundColor(getResources().getColor(R.color.whiteColor));
                            try {
                                Thread.sleep(500);
                            } catch (Exception e) {
                            }
                            lay.setBackgroundColor(getResources().getColor(R.color.blackColor));
                        }
                        else if((text_morze.charAt(k))=='−'){
                            lay.setBackgroundColor(getResources().getColor(R.color.blackColor));
                            try {
                                Thread.sleep(500);
                            } catch (Exception e) {
                            }
                            lay.setBackgroundColor(getResources().getColor(R.color.whiteColor));
                            try {
                                Thread.sleep(1500);
                            } catch (Exception e) {
                            }
                            lay.setBackgroundColor(getResources().getColor(R.color.blackColor));
                        }
                        else if((text_morze.charAt(k))==' '){
                            try {
                                Thread.sleep(1500);
                            } catch (Exception e) {
                            }
                        }
                        else Log.d(LL,"errflashcode");
                    }
                }
                if(i%2==0) {
                    Log.d(LL,"FlashOFF");
                    out_text.setText(text_morze);
                }
                else if(i%2!=0){
                    out_text.setText(text_morze);
                    for(int k=0;k<text_morze.length();k++) {
                        if((text_morze.charAt(k))=='·') {
                            try {
                                Thread.sleep(500);
                            } catch (Exception e) {
                            }
                            params.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                            camera.setParameters(params);
                            camera.startPreview();
                            try {
                                Thread.sleep(500);
                            } catch (Exception e) {
                            }
                            params.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                            camera.setParameters(params);
                            camera.startPreview();
                        }
                        else if((text_morze.charAt(k))=='−'){
                            try {
                                Thread.sleep(500);
                            } catch (Exception e) {
                            }
                            params.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                            camera.setParameters(params);
                            camera.startPreview();
                            try {
                                Thread.sleep(1500);
                            } catch (Exception e) {
                            }
                            params.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
                            camera.setParameters(params);
                            camera.startPreview();
                        }
                        else if((text_morze.charAt(k))==' '){
                            try {
                                Thread.sleep(1500);
                            } catch (Exception e) {
                            }
                        }
                        else Log.d(LL,"errflashcode");
                    }
                }
                if (camera != null){
                    camera.release();
                    camera = null;
                }
            }
        };
        btn_flash.setOnClickListener(Listener);
        code_morze.setOnClickListener(Listener1);
    }
    @Override
    protected void onPause() {
        super.onPause();
        if (camera != null){
            camera.release();
            camera = null;
        }
    }
    private Camera openCamera() {
        if (!getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA))
            return null;
        Camera cam = null;
        if (Camera.getNumberOfCameras() > 0) {
            int CN = Camera.getNumberOfCameras();
            Log.d(LL, "Numb of Cam " + CN);
            try {
                cam = Camera.open(0);

            } catch (Exception exc) {
                Log.d(LL, "Catching err - " + exc);
                exc.printStackTrace();
            }
        }
        return cam;
    }
}
