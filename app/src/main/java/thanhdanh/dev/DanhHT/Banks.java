package thanhdanh.dev.DanhHT;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Banks {
    private String TenGoi;
    private Double LaiSuat;
    private int KyHanVay;

    public Banks(String tenGoi, Double laiSuat, int kyHanVay) {
        TenGoi = tenGoi;
        LaiSuat = laiSuat;
        KyHanVay = kyHanVay;
    }

    public String getTenGoi() {
        return TenGoi;
    }

    public void setTenGoi(String tenGoi) {
        TenGoi = tenGoi;
    }

    public Double getLaiSuat() {
        return LaiSuat;
    }

    public void setLaiSuat(Double laiSuat) {
        LaiSuat = laiSuat;
    }

    public int getKyHanVay() {
        return KyHanVay;
    }

    public void setKyHanVay(int kyHanVay) {
        KyHanVay = kyHanVay;
    }
}


