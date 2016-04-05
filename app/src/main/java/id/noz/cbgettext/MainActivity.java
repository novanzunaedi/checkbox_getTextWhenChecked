package id.noz.cbgettext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb_Pepaya,cb_Durian,cb_Semangka;
    Button b_ShowCheck;
    Integer First,Second,Third;
    Integer Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_Pepaya = (CheckBox)findViewById(R.id.cb_pepaya);
        cb_Durian = (CheckBox)findViewById(R.id.cb_durian);
        cb_Semangka = (CheckBox)findViewById(R.id.cb_semangka);
        b_ShowCheck = (Button)findViewById(R.id.btn_Show);

        b_ShowCheck.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (cb_Pepaya.isChecked()) {
                    First = 1;
                    Total = First;
                }
                if (cb_Durian.isChecked()) {
                    Second = 2;
                    Total = Second;
                }
                if (cb_Semangka.isChecked()) {
                    Third = 4;
                    Total = Third;
                }
                if (cb_Pepaya.isChecked() && cb_Durian.isChecked()) {
                    Total = 3;
                }
                if (cb_Pepaya.isChecked() && cb_Semangka.isChecked()) {
                    Total = 5;
                }
                if (cb_Semangka.isChecked() && cb_Durian.isChecked()) {
                    Total = 6;
                }
                if (cb_Pepaya.isChecked() && cb_Durian.isChecked() && cb_Semangka.isChecked()) {
                    Total = 8;
                }
                if(!cb_Pepaya.isChecked() && !cb_Durian.isChecked() && !cb_Semangka.isChecked()) {
                    Total = 7;
                }
                switch (Total) {
                    case 1:
                        Toast.makeText(MainActivity.this, "Pepaya", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Durian", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "Semangka", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Pepaya, Durian", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "Pepaya, Semangka", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "Durian, Semangka", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(MainActivity.this, "Pepaya, Durian, Semangka", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });
    }
}
