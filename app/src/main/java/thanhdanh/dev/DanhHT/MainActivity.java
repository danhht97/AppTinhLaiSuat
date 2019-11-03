package thanhdanh.dev.DanhHT;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etxtNhapGiaSP, etxtNhapSoTienTraTruoc;
    ImageButton ibtnCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etxtNhapGiaSP = (EditText) findViewById(R.id.editTextNhapGiaSP);
        etxtNhapSoTienTraTruoc = (EditText) findViewById(R.id.editTextNhapSoTienTraTruoc);
        ibtnCalculator = (ImageButton) findViewById(R.id.imageButtonCalculator);
        Toast.makeText(MainActivity.this, "Designed by DanhHT", Toast.LENGTH_LONG).show();



        ibtnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Đang tính toán !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                Bundle bundle = new Bundle();

                String giaSP =  etxtNhapGiaSP.getText().toString();
                bundle.putString("giaSP", giaSP);

                String tienTraTruoc = etxtNhapSoTienTraTruoc.getText().toString();
                bundle.putString("tienTraTruoc", tienTraTruoc);

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bank, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuBanks:
                Toast.makeText(this, "Bạn chọn Banks", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuExit:
                break;
        }

            return super.onOptionsItemSelected(item);

        }
}