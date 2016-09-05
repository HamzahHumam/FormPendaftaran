package id.sch.smktelkom_mlg.tugas01.xiirpl1040.formpendaftaran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText nama, tgl_lahir, bulan_lahir, tahun_lahir, alasan;
    Spinner kelas;
    RadioGroup SB;
    RadioButton SB_sudah, SB_belum;
    CheckBox offense, defense, special, setuju;
    Button proses, daftar;
    TextView hasil_nama, hasil_kelas, hasil_ttl, hasil_umur, hasil_SB, hasil_tim, hasil_alasan;
    List<String> list_kelas;
    ArrayAdapter<String> spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.etNama);
        tgl_lahir = (EditText) findViewById(R.id.etTgl);
        bulan_lahir = (EditText) findViewById(R.id.etBulan);
        tahun_lahir = (EditText) findViewById(R.id.etTahun);
        alasan = (EditText) findViewById(R.id.etAlasan);
        kelas = (Spinner) findViewById(R.id.spinnerKelas);
        SB = (RadioGroup) findViewById(R.id.rgSB);
        offense = (CheckBox) findViewById(R.id.cbOffense);
        defense = (CheckBox) findViewById(R.id.cbDefense);
        special = (CheckBox) findViewById(R.id.cbSpecial);
        setuju = (CheckBox) findViewById(R.id.cbAgree);
        proses = (Button) findViewById(R.id.btnProcess);
        daftar = (Button) findViewById(R.id.btnRegister);
        hasil_nama = (TextView) findViewById(R.id.tvHasilNama);
        hasil_kelas = (TextView) findViewById(R.id.tvHasilKelas);
        hasil_ttl = (TextView) findViewById(R.id.tvHasilLahir);
        hasil_umur = (TextView) findViewById(R.id.tvHasilUmur);
        hasil_SB = (TextView) findViewById(R.id.tvHasilSB);
        hasil_tim = (TextView) findViewById(R.id.tvHasilTim);
        hasil_alasan = (TextView) findViewById(R.id.tvHasilAlasan);
        setSpinnerEntries();
    }

    private void setSpinnerEntries() {
        list_kelas = new ArrayList<>();
        for (int i = 10; i <= 11; i++) {
            for (int j = 1; j <= 2; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (j == 1) {
                        list_kelas.add(i + " RPL " + k);
                    } else if (j == 2) {
                        list_kelas.add(i + " TKJ " + k);
                    }
                }
            }
        }

        spinnerAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list_kelas);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        kelas.setAdapter(spinnerAdapter);
    }
}
