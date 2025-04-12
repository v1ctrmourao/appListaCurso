package com.blackinknit.applistacurso.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.blackinknit.applistacurso.R;
import com.blackinknit.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    //Pessoa outraPessoa;

    //String dadosPessoa;
    //String dadosOutraPessoa;

    EditText nomeEditText;
    EditText sobrenomeEditText;
    EditText cursoEditText;
    EditText telefoneEditText;

    Button limparButton;
    Button finalizarButton;
    Button salvarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pessoa = new Pessoa();
       /* pessoa.setNome("victor");
        pessoa.setSobreNome("Mourão");
        pessoa.setCursoDesejado("análise e desenvolvimento de sistemas");
        pessoa.setTelefone("991248807");
*/
        //Pessoa outraPessoa = new Pessoa();
        /*outraPessoa.setNome("lucas");
        outraPessoa.setSobreNome("cavalcante");
        outraPessoa.setCursoDesejado("análise e desenvolvimento de sistemas");
        outraPessoa.setTelefone("95991454553");*/

        //
        nomeEditText = findViewById(R.id.nomeEditText);
        sobrenomeEditText = findViewById(R.id.sobrenomeEditText);
        cursoEditText = findViewById(R.id.cursoEditText);
        telefoneEditText = findViewById(R.id.telefoneEditText);

        salvarButton = findViewById(R.id.salvarButton);
        limparButton = findViewById(R.id.limparButton);
        finalizarButton = findViewById(R.id.finalizarButton);

        //setText
        nomeEditText.setText(pessoa.getNome());
        sobrenomeEditText.setText(pessoa.getSobreNome());
        cursoEditText.setText(pessoa.getCursoDesejado());
        telefoneEditText.setText(pessoa.getTelefone());

        //métodos botões
        limparButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeEditText.setText("");
                sobrenomeEditText.setText("");
                cursoEditText.setText("");
                telefoneEditText.setText("");
            }
        });

        finalizarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "finalizado", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        salvarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pessoa.setNome(nomeEditText.getText().toString());
                pessoa.setSobreNome(sobrenomeEditText.getText().toString());
                pessoa.setCursoDesejado(cursoEditText.getText().toString());
                pessoa.setTelefone(telefoneEditText.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo"+ pessoa.toString(), Toast.LENGTH_LONG).show();
            }
        });

/*

        dadosPessoa = "primeiro nome: ";
        dadosPessoa += pessoa.getNome();
        dadosPessoa += " sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " telefone: ";
        dadosPessoa += pessoa.getTelefone();
        dadosPessoa += " curso: ";
        dadosPessoa += pessoa.getCursoDesejado();

        dadosOutraPessoa = "primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getNome();
        dadosOutraPessoa += " sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " telefone: ";
        dadosOutraPessoa += outraPessoa.getTelefone();
        dadosOutraPessoa += " curso";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
*/


        //Log.i("PooAndroid", pessoa.toString());
        //Log.i("PooA2", outraPessoa.toString());

    }


}