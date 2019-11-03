package thanhdanh.dev.DanhHT;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class ResultActivity extends AppCompatActivity {
    int a,b,kq;
    Double bh = 0.055;
    TextView txtTienDongMoiThang1,txtChenhLech1,txtTienBaoHiem1,txtLaiThang1,txtLaiNgay1;
    EditText etxtGiaSP,etxtTienTT,etxtSoTienVayLai;
    Spinner spnList,spnSelectMonths;
    Button btnReCalculated;
    String layGiaSP, layTienTraTruoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        AddControl();
        GetMain();
        Calculate();
        MonthArray();
    }

    private void GetMain(){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        layGiaSP = bundle.getString("giaSP", "");
        layTienTraTruoc = bundle.getString("tienTraTruoc", "");

        etxtGiaSP.setText(""+ layGiaSP);
        etxtTienTT.setText(""+ layTienTraTruoc);
    }

    private void Calculate(){
        a = Integer.valueOf(etxtGiaSP.getText().toString());
        b = Integer.valueOf(etxtTienTT.getText().toString());
        kq = a-b;
        Double tbh = kq*bh;
        int tbhC = tbh.intValue();
        etxtSoTienVayLai.setText(""+ kq);
        txtTienBaoHiem1.setText(""+ tbhC);
    }

    private void AddControl(){
        etxtGiaSP = (EditText) findViewById(R.id.editTextGiaSP);
        etxtTienTT = (EditText) findViewById(R.id.editTextTienTT);
        etxtSoTienVayLai = (EditText) findViewById(R.id.editTextSoTienVayLai);
        spnList = (Spinner) findViewById(R.id.SpinnerDanhSach);
        spnSelectMonths = (Spinner) findViewById(R.id.SpinnerChonThang);
        btnReCalculated = (Button) findViewById(R.id.buttonReCalculated);
        txtTienDongMoiThang1 = (TextView) findViewById(R.id.textViewTienDongMoiThang);
        txtChenhLech1 = (TextView) findViewById(R.id.textViewChenhLech1);
        txtTienBaoHiem1 = (TextView) findViewById(R.id.textViewTienBaoHiem1);
        txtLaiThang1 = (TextView) findViewById(R.id.textViewLaiThang1);
        txtLaiNgay1 = (TextView) findViewById(R.id.textViewLaiNgay1);
    }

    private void MonthsArray(){
        final ArrayList<String> arrayListMonths = new ArrayList<String>();
        arrayListMonths.add("6");
        arrayListMonths.add("8");
        arrayListMonths.add("9");
        arrayListMonths.add("10");
        arrayListMonths.add("11");
        arrayListMonths.add("12");
        arrayListMonths.add("15");
        arrayListMonths.add("18");
        arrayListMonths.add("24");
        arrayListMonths.add("27");
        arrayListMonths.add("30");
        arrayListMonths.add("33");
        arrayListMonths.add("36");


        ArrayList<String> arrayListCDHR66 = new ArrayList<String>();
        arrayListCDHR66.add(new Banks("CD HIGH RISK 66", 0.055, ));

        ArrayList<String> arrayListCDRF63 = new ArrayList<String>();
        arrayListCDRF63.add(new Banks("CD REFUND 63", ));



        ArrayList<String> arrayListCDRF66 = new ArrayList<String>();


        ArrayList<String> arrayListCDRF675 = new ArrayList<String>();


        ArrayList<String> arrayListCDHomeAppliance54 = new ArrayList<String>();


        ArrayList<String> arrayListCDCombo59 = new ArrayList<String>();

    }
}
