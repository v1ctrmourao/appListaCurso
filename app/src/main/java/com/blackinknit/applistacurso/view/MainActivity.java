package com.blackinknit.applistacurso.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.blackinknit.applistacurso.R;
import com.blackinknit.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

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
        pessoa.setNome("victor");
        pessoa.setSobreNome("Mourão");
        pessoa.setCursoDesejado("análise e desenvolvimento de sistemas");
        pessoa.setTelefone("991248807");

        Pessoa outraPessoa = new Pessoa();
        outraPessoa.setNome("lucas");
        outraPessoa.setSobreNome("cavalcante");
        outraPessoa.setCursoDesejado("análise e desenvolvimento de sistemas");
        outraPessoa.setTelefone("95991454553");


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

    }


}