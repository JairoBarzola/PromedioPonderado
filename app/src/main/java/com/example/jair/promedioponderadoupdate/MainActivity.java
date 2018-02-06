package com.example.jair.promedioponderadoupdate;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    NumberPicker np;
    //Id de vistas
    LinearLayout f1;
    LinearLayout f2;
    LinearLayout f3;
    LinearLayout f4;
    LinearLayout f5;
    LinearLayout f6;
    LinearLayout f7;
    //Id de editext
    TextView nota;
    EditText p1;
    EditText p2;
    EditText p3;
    EditText p4;
    EditText p5;
    EditText p6;
    EditText p7;
    EditText nc1;
    EditText nc2;
    EditText nc3;
    EditText nc4;
    EditText nc5;
    EditText nc6;
    EditText nc7;
    ImageView imagen;
    TextView inf;
    TextView n;
    //Id de enteros
    int pr1;
    int pr2;
    int pr3;
    int pr4;
    int pr5;
    int pr6;
    int pr7;

    int c1;
    int c2;
    int c3;
    int c4;
    int c5;
    int c6;
    int c7;
    Dialog customDialog = null;
    String pfn1;
    String pfn2;
    String pfn3;
    String pfn4;
    String pfn5;
    String pfn6;
    String pfn7;

    String cred1;
    String cred2;
    String cred3;
    String cred4;
    String cred5;
    String cred6;
    String cred7;
    String p;
    Button calc;
    Double promedioponderado;
    int value;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen = (ImageView) findViewById(R.id.image);

        f1 = (LinearLayout) findViewById(R.id.row1);
        f2 = (LinearLayout) findViewById(R.id.row2);
        f3 = (LinearLayout) findViewById(R.id.row3);
        f4 = (LinearLayout) findViewById(R.id.row4);
        f5 = (LinearLayout) findViewById(R.id.row5);
        f6 = (LinearLayout) findViewById(R.id.row6);
        f7 = (LinearLayout) findViewById(R.id.row7);
        nota = (TextView) findViewById(R.id.promedio);
        calc = (Button) findViewById(R.id.botonCalc);
        inf = (TextView) findViewById(R.id.informa);
        p1 = (EditText) findViewById(R.id.promediofinal1);
        p2 = (EditText) findViewById(R.id.promediofinal2);
        p3 = (EditText) findViewById(R.id.promediofinal3);
        p4 = (EditText) findViewById(R.id.promediofinal4);
        p5 = (EditText) findViewById(R.id.promediofinal5);
        p6 = (EditText) findViewById(R.id.promediofinal6);
        p7 = (EditText) findViewById(R.id.promediofinal7);
        nc1 = (EditText) findViewById(R.id.nrodecreditos1);
        nc4 = (EditText) findViewById(R.id.nrodecreditos4);
        nc3 = (EditText) findViewById(R.id.nrodecreditos3);
        nc2 = (EditText) findViewById(R.id.nrodecreditos2);
        nc5 = (EditText) findViewById(R.id.nrodecreditos5);
        nc6 = (EditText) findViewById(R.id.nrodecreditos6);
        nc7 = (EditText) findViewById(R.id.nrodecreditos7);
        n = (TextView) findViewById(R.id.textnro);


        image = (ImageView) findViewById(R.id.selectnumber);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionarnumero();
            }
        });


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value == 2) {
                    p1 = (EditText) findViewById(R.id.promediofinal1);
                    p2 = (EditText) findViewById(R.id.promediofinal2);
                    nc1 = (EditText) findViewById(R.id.nrodecreditos1);
                    nc2 = (EditText) findViewById(R.id.nrodecreditos2);
                    cred1 = nc1.getText().toString();
                    cred2 = nc2.getText().toString();
                    pfn1 = p1.getText().toString();
                    pfn2 = p2.getText().toString();
                    if (pfn1.equals("") || pfn2.equals("") ||
                            cred1.equals("") || cred2.equals("")) {
                        Toast.makeText(getApplication(), "Introduce valores", Toast.LENGTH_LONG).show();
                    } else {
                        pr1 = Integer.parseInt(pfn1);
                        pr2 = Integer.parseInt(pfn2);
                        c1 = Integer.parseInt(cred1);
                        c2 = Integer.parseInt(cred2);

                        if (pr1 <= 20 && pr2 <= 20) {
                            promedioponderado = (pr1 * c1 + pr2 * c2) * 1.0 / (c1 + c2);
                            emoticon(promedioponderado);
                        } else {
                            Toast.makeText(getApplication(), "Por favor ingresar un promedio del 0 al 20", Toast.LENGTH_LONG).show();
                        }

                    }
                }
                if (value == 3) {
                    p1 = (EditText) findViewById(R.id.promediofinal1);
                    p2 = (EditText) findViewById(R.id.promediofinal2);
                    p3 = (EditText) findViewById(R.id.promediofinal3);
                    nc3 = (EditText) findViewById(R.id.nrodecreditos3);
                    nc1 = (EditText) findViewById(R.id.nrodecreditos1);
                    nc2 = (EditText) findViewById(R.id.nrodecreditos2);
                    cred1 = nc1.getText().toString();
                    cred2 = nc2.getText().toString();
                    cred3 = nc3.getText().toString();
                    pfn1 = p1.getText().toString();
                    pfn2 = p2.getText().toString();
                    pfn3 = p3.getText().toString();
                    if (pfn1.equals("") || pfn2.equals("") || pfn3.equals("") ||
                            cred1.equals("") || cred2.equals("") || cred3.equals("")) {
                        Toast.makeText(getApplication(), "Introduce valores", Toast.LENGTH_LONG).show();
                    } else {
                        pr1 = Integer.parseInt(pfn1);
                        pr2 = Integer.parseInt(pfn2);
                        pr3 = Integer.parseInt(pfn3);
                        c1 = Integer.parseInt(cred1);
                        c2 = Integer.parseInt(cred2);
                        c3 = Integer.parseInt(cred3);
                        if (pr1 <= 20 && pr2 <= 20 && pr3 <= 20) {
                            promedioponderado = (pr1 * c1 + pr2 * c2 + pr3 * c3) * 1.0 / (c1 + c2 + c3);
                            emoticon(promedioponderado);
                        } else {
                            Toast.makeText(getApplication(), "Por favor ingresar un promedio del 0 al 20", Toast.LENGTH_LONG).show();
                        }

                    }
                }
                if (value == 4) {
                    p1 = (EditText) findViewById(R.id.promediofinal1);
                    p2 = (EditText) findViewById(R.id.promediofinal2);
                    p3 = (EditText) findViewById(R.id.promediofinal3);
                    p4 = (EditText) findViewById(R.id.promediofinal4);
                    nc4 = (EditText) findViewById(R.id.nrodecreditos4);
                    nc3 = (EditText) findViewById(R.id.nrodecreditos3);
                    nc1 = (EditText) findViewById(R.id.nrodecreditos1);
                    nc2 = (EditText) findViewById(R.id.nrodecreditos2);
                    pfn4 = p4.getText().toString();
                    cred4 = nc4.getText().toString();
                    cred1 = nc1.getText().toString();
                    cred2 = nc2.getText().toString();
                    cred3 = nc3.getText().toString();
                    pfn1 = p1.getText().toString();
                    pfn2 = p2.getText().toString();
                    pfn3 = p3.getText().toString();
                    if (pfn1.equals("") || pfn2.equals("") || pfn3.equals("") || pfn4.equals("") ||
                            cred1.equals("") || cred2.equals("") || cred3.equals("") || cred4.equals("")) {
                        Toast.makeText(getApplication(), "Introduce valores", Toast.LENGTH_LONG).show();
                    } else {
                        pr1 = Integer.parseInt(pfn1);
                        pr2 = Integer.parseInt(pfn2);
                        pr3 = Integer.parseInt(pfn3);
                        pr4 = Integer.parseInt(pfn4);
                        c1 = Integer.parseInt(cred1);
                        c2 = Integer.parseInt(cred2);
                        c3 = Integer.parseInt(cred3);
                        c4 = Integer.parseInt(cred4);
                        if (pr1 <= 20 && pr2 <= 20 && pr3 <= 20 && pr4 <= 20) {
                            promedioponderado = (pr1 * c1 + pr2 * c2 + pr3 * c3 + pr4 * c4) * 1.0 / (c1 + c2 + c3 + c4);
                            emoticon(promedioponderado);
                        } else {
                            Toast.makeText(getApplication(), "Por favor ingresar un promedio del 0 al 20", Toast.LENGTH_LONG).show();
                        }

                    }
                }
                if (value == 5) {
                    p1 = (EditText) findViewById(R.id.promediofinal1);
                    p2 = (EditText) findViewById(R.id.promediofinal2);
                    p3 = (EditText) findViewById(R.id.promediofinal3);
                    p4 = (EditText) findViewById(R.id.promediofinal4);
                    nc4 = (EditText) findViewById(R.id.nrodecreditos4);
                    nc3 = (EditText) findViewById(R.id.nrodecreditos3);
                    nc1 = (EditText) findViewById(R.id.nrodecreditos1);
                    nc2 = (EditText) findViewById(R.id.nrodecreditos2);
                    p5 = (EditText) findViewById(R.id.promediofinal5);
                    nc5 = (EditText) findViewById(R.id.nrodecreditos5);
                    cred5 = nc5.getText().toString();
                    pfn5 = p5.getText().toString();
                    pfn4 = p4.getText().toString();
                    cred4 = nc4.getText().toString();
                    cred1 = nc1.getText().toString();
                    cred2 = nc2.getText().toString();
                    cred3 = nc3.getText().toString();
                    pfn1 = p1.getText().toString();
                    pfn2 = p2.getText().toString();
                    pfn3 = p3.getText().toString();
                    if (pfn1.equals("") || pfn2.equals("") || pfn3.equals("") || pfn4.equals("") || pfn5.equals("") ||
                            cred1.equals("") || cred2.equals("") || cred3.equals("") || cred4.equals("") || cred5.equals("")) {
                        Toast.makeText(getApplication(), "Introduce valores", Toast.LENGTH_LONG).show();
                    } else {
                        pr1 = Integer.parseInt(pfn1);
                        pr2 = Integer.parseInt(pfn2);
                        pr3 = Integer.parseInt(pfn3);
                        pr4 = Integer.parseInt(pfn4);
                        pr5 = Integer.parseInt(pfn5);
                        c1 = Integer.parseInt(cred1);
                        c2 = Integer.parseInt(cred2);
                        c3 = Integer.parseInt(cred3);
                        c4 = Integer.parseInt(cred4);
                        c5 = Integer.parseInt(cred5);
                        if (pr1 <= 20 && pr2 <= 20 && pr3 <= 20 && pr4 <= 20 && pr5 <= 20) {
                            promedioponderado = (pr1 * c1 + pr2 * c2 + pr3 * c3 + pr4 * c4 + pr5 * c5) * 1.0 / (c1 + c2 + c3 + c4 + c5);
                            emoticon(promedioponderado);
                        } else {
                            Toast.makeText(getApplication(), "Por favor ingresar un promedio del 0 al 20", Toast.LENGTH_LONG).show();
                        }

                    }
                }
                if (value == 6) {
                    p1 = (EditText) findViewById(R.id.promediofinal1);
                    p2 = (EditText) findViewById(R.id.promediofinal2);
                    p3 = (EditText) findViewById(R.id.promediofinal3);
                    p4 = (EditText) findViewById(R.id.promediofinal4);
                    p5 = (EditText) findViewById(R.id.promediofinal5);
                    p6 = (EditText) findViewById(R.id.promediofinal6);
                    nc1 = (EditText) findViewById(R.id.nrodecreditos1);
                    nc2 = (EditText) findViewById(R.id.nrodecreditos2);
                    nc3 = (EditText) findViewById(R.id.nrodecreditos3);
                    nc4 = (EditText) findViewById(R.id.nrodecreditos4);
                    nc5 = (EditText) findViewById(R.id.nrodecreditos5);
                    nc6 = (EditText) findViewById(R.id.nrodecreditos6);
                    cred6 = nc6.getText().toString();
                    cred5 = nc5.getText().toString();
                    pfn6 = p6.getText().toString();
                    pfn5 = p5.getText().toString();
                    pfn4 = p4.getText().toString();
                    cred4 = nc4.getText().toString();
                    cred1 = nc1.getText().toString();
                    cred2 = nc2.getText().toString();
                    cred3 = nc3.getText().toString();
                    pfn1 = p1.getText().toString();
                    pfn2 = p2.getText().toString();
                    pfn3 = p3.getText().toString();
                    if (pfn1.equals("") || pfn2.equals("") || pfn3.equals("") || pfn4.equals("") || pfn5.equals("") || pfn6.equals("") ||
                            cred1.equals("") || cred2.equals("") || cred3.equals("") || cred4.equals("") || cred5.equals("")
                            || cred6.equals("")) {
                        Toast.makeText(getApplication(), "Introduce valores", Toast.LENGTH_LONG).show();
                    } else {
                        pr1 = Integer.parseInt(pfn1);
                        pr2 = Integer.parseInt(pfn2);
                        pr3 = Integer.parseInt(pfn3);
                        pr4 = Integer.parseInt(pfn4);
                        pr5 = Integer.parseInt(pfn5);
                        pr6 = Integer.parseInt(pfn6);
                        c1 = Integer.parseInt(cred1);
                        c2 = Integer.parseInt(cred2);
                        c3 = Integer.parseInt(cred3);
                        c4 = Integer.parseInt(cred4);
                        c5 = Integer.parseInt(cred5);
                        c6 = Integer.parseInt(cred6);
                        if (pr1 <= 20 && pr2 <= 20 && pr3 <= 20 && pr4 <= 20 && pr5 <= 20 && pr6 <= 20) {
                            promedioponderado = (pr1 * c1 + pr2 * c2 + pr3 * c3 + pr4 * c4 + pr5 * c5 + pr6 * c6) * 1.0 / (c1 + c2 + c3 + c4 + c5 + c6);
                            emoticon(promedioponderado);
                        } else {
                            Toast.makeText(getApplication(), "Por favor ingresar un promedio del 0 al 20", Toast.LENGTH_LONG).show();
                        }

                    }
                }
                if (value == 7) {
                    p1 = (EditText) findViewById(R.id.promediofinal1);
                    p2 = (EditText) findViewById(R.id.promediofinal2);
                    p3 = (EditText) findViewById(R.id.promediofinal3);
                    p4 = (EditText) findViewById(R.id.promediofinal4);
                    p5 = (EditText) findViewById(R.id.promediofinal5);
                    p6 = (EditText) findViewById(R.id.promediofinal6);
                    p7 = (EditText) findViewById(R.id.promediofinal7);
                    nc1 = (EditText) findViewById(R.id.nrodecreditos1);
                    nc4 = (EditText) findViewById(R.id.nrodecreditos4);
                    nc3 = (EditText) findViewById(R.id.nrodecreditos3);
                    nc2 = (EditText) findViewById(R.id.nrodecreditos2);
                    nc5 = (EditText) findViewById(R.id.nrodecreditos5);
                    nc6 = (EditText) findViewById(R.id.nrodecreditos6);
                    nc7 = (EditText) findViewById(R.id.nrodecreditos7);

                    pfn7 = p7.getText().toString();
                    cred7 = nc7.getText().toString();
                    cred6 = nc6.getText().toString();
                    cred5 = nc5.getText().toString();
                    pfn6 = p6.getText().toString();
                    pfn5 = p5.getText().toString();
                    pfn4 = p4.getText().toString();
                    cred4 = nc4.getText().toString();
                    cred1 = nc1.getText().toString();
                    cred2 = nc2.getText().toString();
                    cred3 = nc3.getText().toString();
                    pfn1 = p1.getText().toString();
                    pfn2 = p2.getText().toString();
                    pfn3 = p3.getText().toString();

                    if (pfn1.equals("") || pfn2.equals("") || pfn3.equals("") || pfn4.equals("") || pfn5.equals("") || pfn6.equals("") ||
                            cred1.equals("") || cred2.equals("") || cred3.equals("") || cred4.equals("") || cred5.equals("")
                            || cred6.equals("") || cred7.equals("")) {
                        Toast.makeText(getApplication(), "Introduce valores", Toast.LENGTH_LONG).show();
                    } else {
                        pr1 = Integer.parseInt(pfn1);
                        pr2 = Integer.parseInt(pfn2);
                        pr3 = Integer.parseInt(pfn3);
                        pr4 = Integer.parseInt(pfn4);
                        pr5 = Integer.parseInt(pfn5);
                        pr6 = Integer.parseInt(pfn6);
                        pr7 = Integer.parseInt(pfn6);
                        c1 = Integer.parseInt(cred1);
                        c2 = Integer.parseInt(cred2);
                        c3 = Integer.parseInt(cred3);
                        c4 = Integer.parseInt(cred4);
                        c5 = Integer.parseInt(cred5);
                        c6 = Integer.parseInt(cred6);
                        c7 = Integer.parseInt(cred7);
                        if (pr1 <= 20 && pr2 <= 20 && pr3 <= 20 && pr4 <= 20 && pr5 <= 20 && pr6 <= 20 && pr7 <= 20) {
                            promedioponderado = (pr1 * c1 + pr2 * c2 + pr3 * c3 + pr4 * c4 + pr5 * c5 + pr6 * c6 + pr7 * c7) * 1.0 / (c1 + c2 + c3 + c4 + c5 + c6 + c7);
                            emoticon(promedioponderado);
                        } else {
                            Toast.makeText(getApplication(), "Por favor ingresar un promedio del 0 al 20", Toast.LENGTH_LONG).show();
                        }

                    }

                }

            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information
    }

    public void mostrarcajitas(int nro) {
        p1.setText("");
        p2.setText("");
        p3.setText("");
        p4.setText("");
        p5.setText("");
        p6.setText("");
        p7.setText("");
        nc1.setText("");
        nc2.setText("");
        nc3.setText("");
        nc4.setText("");
        nc5.setText("");
        nc6.setText("");
        nc7.setText("");
        nota.setText("");
        inf.setVisibility(View.GONE);
        imagen.setImageDrawable(null);
        if (nro == 0) {
            f1.setVisibility(View.GONE);
            f2.setVisibility(View.GONE);
            f3.setVisibility(View.GONE);
            f4.setVisibility(View.GONE);
            f5.setVisibility(View.GONE);
            f6.setVisibility(View.GONE);
            f7.setVisibility(View.GONE);
            calc.setVisibility(View.GONE);
        } else {
            if (nro == 2) {
                f1.setVisibility(View.VISIBLE);
                f1.clearFocus();
                f2.setVisibility(View.VISIBLE);
                f2.clearFocus();
                f3.setVisibility(View.GONE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.GONE);
                f6.setVisibility(View.GONE);
                f7.setVisibility(View.GONE);
            }
            if (nro == 3) {
                f1.setVisibility(View.VISIBLE);
                f2.setVisibility(View.VISIBLE);
                f3.setVisibility(View.VISIBLE);
                f4.setVisibility(View.GONE);
                f5.setVisibility(View.GONE);
                f6.setVisibility(View.GONE);
                f7.setVisibility(View.GONE);

            }
            if (nro == 4) {
                f1.setVisibility(View.VISIBLE);
                f2.setVisibility(View.VISIBLE);
                f3.setVisibility(View.VISIBLE);
                f4.setVisibility(View.VISIBLE);
                f5.setVisibility(View.GONE);
                f6.setVisibility(View.GONE);
                f7.setVisibility(View.GONE);
            }
            if (nro == 5) {
                f1.setVisibility(View.VISIBLE);
                f2.setVisibility(View.VISIBLE);
                f3.setVisibility(View.VISIBLE);
                f4.setVisibility(View.VISIBLE);
                f5.setVisibility(View.VISIBLE);
                f6.setVisibility(View.GONE);
                f7.setVisibility(View.GONE);
            }
            if (nro == 6) {
                f1.setVisibility(View.VISIBLE);
                f2.setVisibility(View.VISIBLE);
                f3.setVisibility(View.VISIBLE);
                f4.setVisibility(View.VISIBLE);
                f5.setVisibility(View.VISIBLE);
                f6.setVisibility(View.VISIBLE);
                f7.setVisibility(View.GONE);
            }
            if (nro == 7) {
                f1.setVisibility(View.VISIBLE);
                f2.setVisibility(View.VISIBLE);
                f3.setVisibility(View.VISIBLE);
                f4.setVisibility(View.VISIBLE);
                f5.setVisibility(View.VISIBLE);
                f6.setVisibility(View.VISIBLE);
                f7.setVisibility(View.VISIBLE);
            }
            calc.setVisibility(View.VISIBLE);
        }
    }

    public void emoticon(double promedio) {

        /*if (promedio < 8) {
            imagen.setImageResource(R.drawable.a1);
        } else {
            if (promedio >= 8 && promedio <= 12) {
                Random generadorAleatorios = new Random();
                int numeroAleatorio = 1 + generadorAleatorios.nextInt(4);
                if (numeroAleatorio == 1) {
                    imagen.setImageResource(R.drawable.b);
                }
                if (numeroAleatorio == 2) {
                    imagen.setImageResource(R.drawable.b1);
                }
                if (numeroAleatorio == 3) {
                    imagen.setImageResource(R.drawable.c1);
                } else {
                    imagen.setImageResource(R.drawable.c2);
                }
            }
            if (promedio > 12 && promedio <= 15) {
                Random generadorAleatorios = new Random();
                int numeroAleatorio = 1 + generadorAleatorios.nextInt(4);
                if (numeroAleatorio == 1) {
                    imagen.setImageResource(R.drawable.d1);
                }
                if (numeroAleatorio == 2) {
                    imagen.setImageResource(R.drawable.d3);
                }
                if (numeroAleatorio == 3) {
                    imagen.setImageResource(R.drawable.e1);
                } else {
                    imagen.setImageResource(R.drawable.e2);
                }
            }
            if (promedio > 15 && promedio <= 20) {
                Random generadorAleatorios = new Random();
                int numeroAleatorio = 1 + generadorAleatorios.nextInt(2);
                if (numeroAleatorio == 1) {
                    imagen.setImageResource(R.drawable.f1);
                }
                if (numeroAleatorio == 2) {
                    imagen.setImageResource(R.drawable.f2);
                }
            }

        }*/
        inf.setVisibility(View.VISIBLE);
        nota.setText(Double.toString(promedio));
    }

    private void seleccionarnumero() {
        // con este tema personalizado evitamos los bordes por defecto
        customDialog = new Dialog(this, R.style.Theme_Dialog_Translucent);
        //deshabilitamos el título por defecto
        customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //obligamos al usuario a pulsar los botones para cerrarlo
        customDialog.setCancelable(false);
        //establecemos el contenido de nuestro dialog
        customDialog.setContentView(R.layout.numberpicker);

        TextView aceptar = (TextView) customDialog.findViewById(R.id.aceptar);
        ImageView cancelar = (ImageView) customDialog.findViewById(R.id.cancelar);
        np = (NumberPicker) customDialog.findViewById(R.id.numberPicker1);
        np.setMinValue(2);
        np.setMaxValue(7);
        np.setWrapSelectorWheel(false);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = np.getValue();
                n.setVisibility(View.VISIBLE);
                n.setText(Integer.toString(value));
                mostrarcajitas(value);
                customDialog.dismiss();

            }
        });
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialog.dismiss();
            }
        });
        customDialog.show();
    }



}
