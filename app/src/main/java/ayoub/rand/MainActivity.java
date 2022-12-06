package ayoub.rand;

import android.app.*;
import android.os.*;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import java.util.*;

public class MainActivity extends Activity 
{
	private Button btn;
    private TextView txtview;
    private EditText ed1;
    private EditText ed2;
    private EditText ed3;
    private EditText ed4;
    private EditText ed5;
    private EditText ed6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	initialize();
		initializeLogic();
    }

	private void initialize()
    {
        txtview = (TextView)findViewById(R.id.txtview);
		btn = (Button)findViewById(R.id.btn);
        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);
        ed3 = (EditText)findViewById(R.id.ed3);
        ed4 = (EditText)findViewById(R.id.ed4);
        ed5 = (EditText)findViewById(R.id.ed5);
        ed6 = (EditText)findViewById(R.id.ed6);
    }//initialize

	private void initializeLogic()
    {



		btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view)
                {
                    String txt1=ed1.getText().toString().trim();
                    String txt2=ed2.getText().toString().trim();
                    String txt3=ed3.getText().toString().trim();
                    String txt4=ed4.getText().toString().trim();
                    String txt5=ed5.getText().toString().trim();
                    String txt6=ed6.getText().toString().trim();

                    String[] T = {txt1, txt2, txt3, txt4, txt5, txt6};
                    
                    List<Integer> X = new ArrayList<Integer>();
                    try {

                        for (int i=0;i <= 5;i++) {
                            if (T[i] != "" && !T[i].isEmpty()) {
                                X.add(i);
                            }
                        }
                        
                        final int min= 0;
                        final int max = X.size();
                        final int random = new Random().nextInt((max - min) ) + min;

                        txtview.setText(T[X.get(random)]);
                    }
                    catch (Exception e) {
                        txtview.setText("error:" + e + "\n" + txt1);
                    }

				}
			});

    }


}
