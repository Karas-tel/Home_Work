package ivan.home_work;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    TreeSet<Person> Persons = new TreeSet<Person>();
    EditText editTextFirstName,editTextLastName,editTextResult;
    TextView textViewFirstName, textViewFirst;
    Button addButton, clearButton;
    CheckBox box1,box2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextResult=(EditText)findViewById(R.id.editRes);
        editTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
        editTextLastName =(EditText) findViewById(R.id.editTextLastName);
        textViewFirstName=(TextView) findViewById(R.id.texViewFirstName);
        textViewFirst = (TextView) findViewById(R.id.texViewFirst);
        addButton=(Button)findViewById(R.id.addButton);
        clearButton=(Button)findViewById(R.id.clearButton);
        box1 =(CheckBox)findViewById(R.id.Box1);
        box2 = (CheckBox)findViewById(R.id.Box2);


        View.OnClickListener add = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (box1.isChecked()){
                    Male M = new Male( editTextFirstName.getText().toString(),
                            editTextLastName.getText().toString(),
                            Integer.parseInt(editTextResult.getText().toString())
                    );
                    editTextResult.setText("");
                    editTextFirstName.setText("");
                    editTextLastName.setText("");
                    box1.setChecked(false);
                    Persons.add(M);
                }
                else
                if (box2.isChecked())
                {
                    Female M = new Female( editTextFirstName.getText().toString(),
                            editTextLastName.getText().toString(),
                            Integer.parseInt(editTextResult.getText().toString())
                    );

                    editTextResult.setText("");
                    editTextFirstName.setText("");
                    editTextLastName.setText("");
                    box2.setChecked(false);
                    Persons.add(M);
                }
            }
        };
        View.OnClickListener create = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewFirstName.setText("");
                textViewFirst.setText("");
                for(Person p: Persons)
                {
                    if (p.getClass().getSimpleName().toString().equals("Female"))
                    {
                        textViewFirst.setText(textViewFirst.getText()+p.get_firstname()+" "+p.get_lastname()+" "+((Female)p).get_result()+" "+"\n");
                    }
                    else
                    {
                        textViewFirstName.setText(textViewFirstName.getText()+p.get_firstname()+" "+p.get_lastname()+" "+((Male)p).get_result()+" "+"\n");
                    }
                }
            }
        };
        View.OnClickListener box = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box2.setChecked(false);
            }
        };
        View.OnClickListener bx = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box1.setChecked(false);
            }
        };
        addButton.setOnClickListener(add);
        clearButton.setOnClickListener(create);
        box1.setOnClickListener(box);
        box2.setOnClickListener(bx);
    }


}
