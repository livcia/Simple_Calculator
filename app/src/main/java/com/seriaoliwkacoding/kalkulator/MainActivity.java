package com.seriaoliwkacoding.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    /*
        ░█▀▄░█▀▀░█░█░█░░░█▀█░█▀▄░█▀█░█▀▀░▀▀█░█▀█░░░▀▀█░█▄█░▀█▀░█▀▀░█▀█░█▀█░█░█░█▀▀░█░█
        ░█░█░█▀▀░█▀▄░█░░░█▀█░█▀▄░█▀█░█░░░░░█░█▀█░░░▄▀░░█░█░░█░░█▀▀░█░█░█░█░░█░░█░░░█▀█
        ░▀▀░░▀▀▀░▀░▀░▀▀▀░▀░▀░▀░▀░▀░▀░▀▀▀░▀▀░░▀░▀░░░▀▀▀░▀░▀░▀▀▀░▀▀▀░▀░▀░▀░▀░░▀░░▀▀▀░▀░▀
     */
    TextView liczby;
    float liczbapierwsza, liczbadruga, wynik;
    String dzialanie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liczby = findViewById(R.id.liczby);
    }
    /*
        ░█░░░▀█▀░█▀▀░▀▀█░█▀▄░█░█░░░▀█▀░░░░░░
        ░█░░░░█░░█░░░▄▀░░█▀▄░░█░░░░░█░░░░░░░
        ░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀░░░▀░░░░▀▀▀░░░▄▀░
     */
    public void jeden(View view) { wypelnijliczba(1); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void dwa(View view) { wypelnijliczba(2); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void trzy(View view) { wypelnijliczba(3); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void cztery(View view) { wypelnijliczba(4); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void piec(View view) { wypelnijliczba(5); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void szesc(View view) { wypelnijliczba(6); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void siedem(View view) { wypelnijliczba(7); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void osiem(View view) { wypelnijliczba(8); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void dziewiec(View view) { wypelnijliczba(9); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void zero(View view) { wypelnijliczba(0); } //wywołanie funkcji dodającej liczbe do ciągu znaków
    public void przecinek(View view) {
        liczby.append("."); //dodanie , do ciągu znaków
    }
    public void wypelnijliczba(int liczba){
        liczby.append(""+liczba); //funkcja dodająca liczbę do ciągu znaków
    }
    public void odwrotnosc(View view) {
        liczbapierwsza = Float.parseFloat(liczby.getText().toString()); //wczytanie liczby która jest w textview
        double square = Math.pow(liczbapierwsza, -1); //zrobienie odwrotnosci
        liczby.setText(""+square); //wypisanie odwrotnosci
    }
    public void dzialanie(String x){
        liczbapierwsza = Float.parseFloat(liczby.getText().toString());
        liczby.setText("");
        dzialanie = x;
    }
    public void plus(View view) { dzialanie("dodawanie"); } //wywolanie funkcji dzialanie z parametrem
    public void minus(View view) { dzialanie("odejmowanie"); } //wywolanie funkcji dzialanie z parametrem
    public void mnozenie(View view) { dzialanie("mnozenie"); } //wywolanie funkcji dzialanie z parametrem
    public void dzielenie(View view) { dzialanie("dzielenie"); } //wywolanie funkcji dzialanie z parametrem
    public void procent(View view) { dzialanie("procent"); } //wywolanie funkcji dzialanie z parametrem
    public void bksp(View view) { //funkcja usuniecia ostatniego elementu ciagu
        String str = liczby.getText().toString(); //rzutowanie na string textview
        liczby.setText(str.substring(0, str.length() - 1));  //wyswietlenie ciagu bez ostatniego elementu
    }
    public void pierwiastek(View view) {
        wynik = (float)Math.sqrt(liczbapierwsza = Float.parseFloat(liczby.getText().toString())); //przypisanie pierwiastka do wyniku
        liczby.setText(""+wynik); //wypisanie wyniku
    }
    public void potega(View view) {
        liczbapierwsza = Float.parseFloat(liczby.getText().toString()); //zrzutowanie na float
        double square = Math.pow(liczbapierwsza, 2);  //wywolanie funkcji potegi
        liczby.setText(""+square); //wypisanie wyniku
    }
    public void czyszczenie(View view) {
        liczbapierwsza =  0.56f; //wyzerownie liczbypierwszej
        liczby.setText(""); //wyzerowanie textview
    }
    public void zmienznak(View view) {
        liczbapierwsza = Float.parseFloat(liczby.getText().toString()); //zrzutowanie ciagu znakow na typ float
        liczbapierwsza *= -1; //odwrotnosc
        liczby.setText(""+liczbapierwsza); //wypisanie liczby ze zmienionym znakiem
    }
    public void rownanie(View view) {
        liczbadruga = Float.parseFloat(liczby.getText().toString()); //zrzutowanie textView na float
        switch(dzialanie){
            case "dodawanie": //jesli dzialanie to dodawanie to:
                wynik = liczbapierwsza + liczbadruga; //wykonanie dzialania
                liczby.setText(""+wynik); //wypisz wynik
                break;
            case "odejmowanie": //jesli dzialanie to odejmowanie to:
                wynik = liczbapierwsza - liczbadruga; //wykonanie dzialania
                liczby.setText(""+wynik); //wypisz wynik
                break;
            case "mnozenie": //jesli dzialanie to mnozenie to:
                wynik = liczbapierwsza * liczbadruga; //wykonanie dzialania
                liczby.setText(""+wynik); //wypisz wynik
                break;
            case "dzielenie": //jesli dzialanie to dzielenie to:
                wynik = liczbapierwsza / liczbadruga; //wykonanie dzialania
                liczby.setText(""+wynik); //wypisz wynik
                break;
            case "procent": //jesli dzialanie to procent to:
                wynik = (liczbapierwsza/liczbadruga)*100; //wykonanie dzialania
                liczby.setText(""+wynik+"%"); //wypisz wynik
                break;
            default:
                liczby.setText("jakis problem"); //informacja zwrotna w przypadku bledu
        }
    }
}