package com.example.carlayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
private TextView txtScrollable;
private EditText txtMake,txtYear,txtColor,txtPurchasePrice,txtEngineSize;
private Button btnCreateCar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initItems();
    }
    private void initItems(){
        txtMake = findViewById(R.id.txtMake);
        txtYear = findViewById(R.id.txtYear);
        txtColor = findViewById(R.id.txtColor);
        txtPurchasePrice = findViewById(R.id.txtPurchasePrice);
        txtEngineSize = findViewById(R.id.txtEngineSize);

        txtScrollable = findViewById(R.id.txtScrollable);
        txtScrollable.setMovementMethod(new ScrollingMovementMethod());

        btnCreateCar = findViewById(R.id.btnCreateCar);
        btnCreateCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailsModel model = new DetailsModel(txtMake.getText().toString(),txtYear.getText().toString(),
                txtColor.getText().toString(),txtPurchasePrice.getText().toString(),txtEngineSize.getText().toString());
                txtScrollable.setText(txtScrollable.getText()+"\r\n"+model.toString());
            }
        });
    }
}