package app.damian.com.homework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1H;
    private EditText num2H ;
    private TextView resH ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1H = findViewById(R.id.number_one) ;
        num2H = findViewById(R.id.number_two);
        resH = findViewById(R.id.result);
    }

    public void plus(View view) {result(1);}
    public void minus(View view) {result(2);}
    public void multi(View view) {result(3);}
    public void div(View view) {result(4);}

    public void result(int which){
        double num1 = 0;
        double num2 = 0;
        try {
            num1 = Double.parseDouble(num1H.getText().toString());
            num2 = Double.parseDouble(num2H.getText().toString());
        }catch(NumberFormatException nfe){
            nfe.printStackTrace();

        }catch(IllegalArgumentException iae){
            iae.printStackTrace();
        }

        switch(which){
            case 1: resH.setText(Double.toString(num1+num2));
                break;
            case 2: resH.setText(Double.toString(num1-num2));
                break;
            case 3: resH.setText(Double.toString(num1*num2));
                break;
            case 4: resH.setText(Double.toString(num1/num2));
                break;
            default: resH.setText("nieskonczonosc");
        }
    }
}
