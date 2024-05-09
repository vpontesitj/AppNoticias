package com.example.appnoticias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appnoticias.ui.theme.AppNoticiasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNoticiasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.White),
            Arrangement.Center
        ) {
            Text(
                text = "App Notícias",
                fontFamily = FontFamily.SansSerif,
                fontSize = 30.sp
            )
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Mãe e filha trilham parceria de sucesso no basquete em Araçatuba\n")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Além de títulos em equipe, elas também colecionam prêmios individuais como cestinha, MVP (Jogadora Mais Valiosa) e melhor treinadora")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Detran-SP realiza primeira Operação Direção Segura Integrada")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "A programação do Detran-SP no Maio Amarelo promove fiscalizações, palestras online e informações sobre segurança no trânsito")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Etecs organizam Semana Paulo Freire com atividades pedagógicas e culturais")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Oficinas, palestras, gincanas e outros eventos inspirados na obra do educador marcam uma tradição no calendário de várias unidades")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Governo de SP entrega 10 obras em escolas em 15 dias")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Foram investidos R\$ 26,9 milhões, com 4.324 estudantes beneficiados; Estado entregou ainda primeira creche de cidade no Vale do Ribeira")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Casa da Mulher Paulista realiza ações focadas em mães vítimas de violência")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Equipamento do Governo de São Paulo oferece serviços para permitir recomeço, com apoio para quem tem filhos")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Procon-SP completa 48 anos à frente da defesa do consumidor")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "6 de maio também é o Dia da Defesa do Consumidor no estado; órgão de defesa marca a data com evento para funcionários e Procons municipais")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "SP lança guia turístico com as estátuas de Cristo no estado")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Material foi produzido após levantamento feito em 2023 que identificou 66 estátuas nos municípios paulistas")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
        }

        Column(
            Modifier
                .fillMaxWidth()

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Governo de SP incentiva campanha de arrecadação às vítimas do RS")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White)

            ) {
                Text(text = "Concessionárias usam painéis para divulgar site do Governo do Rio Grande do Sul com instruções para participar da campanha de doação")
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.White),
                Arrangement.Absolute.Right
            ){
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Leia Mais")
                }
            }
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    AppNoticiasTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            App()
        }
    }
}

