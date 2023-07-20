package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.example.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var valorEntrante: String = ""
        var valor1: Int = 0
        var valor2: Int = 0
        var operacion: String = ""
        var resultado: Int = 0

        binding.button9.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "9"

            } else {

                valorEntrante = ""
                valorEntrante += "9"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)
        }

        binding.button8.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "8"

            } else {

                valorEntrante = ""
                valorEntrante += "8"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)


        }
        binding.button7.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "7"

            } else {

                valorEntrante = ""
                valorEntrante += "7"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)


        }
        binding.button6.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "6"

            } else {

                valorEntrante = ""
                valorEntrante += "6"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)


        }
        binding.button5.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "5"

            } else {

                valorEntrante = ""
                valorEntrante += "5"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)


        }
        binding.button4.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "4"

            } else {

                valorEntrante = ""
                valorEntrante += "4"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)


        }

        binding.button3.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "3"

            } else {

                valorEntrante = ""
                valorEntrante += "3"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)


        }

        binding.button2.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "2"

            } else {

                valorEntrante = ""
                valorEntrante += "2"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)


        }

        binding.button1.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "1"

            } else {

                valorEntrante = ""
                valorEntrante += "1"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)


        }

        binding.button0.setOnClickListener {
            if (operacion == "=") {
                valor1 = 0
                valorEntrante = ""
                valorEntrante += "0"

            } else {

                valorEntrante = ""
                valorEntrante += "0"
            }

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)


        }


        //operaciones
        binding.buttonMas.setOnClickListener {

            if (operacion == "=" || valor1 == 0) {
                operacion = "+"
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable("")
                try {
                    valor1 = valorEntrante.toInt()
                    valorEntrante = ""
                } catch (e: NumberFormatException) {

                }
            } else {

                resultado = 0
                try {
                    valor2 = valorEntrante.toInt()
                    when (operacion) {
                        "x" -> resultado = valor1 * valor2
                        "/" -> resultado = valor1 / valor2
                        "+" -> resultado = valor1 + valor2
                        "-" -> resultado = valor1 - valor2
                    }
                    valor1 = resultado
                    operacion = "+"
                    binding.textViewResultado.text = Editable.Factory.getInstance()
                        .newEditable(resultado.toString())
                } catch (e: java.lang.NumberFormatException) {

                }

            }
        }

        binding.buttonMenos.setOnClickListener {

            if (operacion == "=" || valor1 == 0) {
                operacion = "-"
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable("")
                try {
                    valor1 = valorEntrante.toInt()
                    valorEntrante = ""
                } catch (e: NumberFormatException) {

                }
            } else {

                resultado = 0
                try {
                    valor2 = valorEntrante.toInt()
                    when (operacion) {
                        "x" -> resultado = valor1 * valor2
                        "/" -> resultado = valor1 / valor2
                        "+" -> resultado = valor1 + valor2
                        "-" -> resultado = valor1 - valor2
                    }
                    valor1 = resultado
                    operacion = "-"
                    binding.textViewResultado.text = Editable.Factory.getInstance()
                        .newEditable(resultado.toString())
                } catch (e: java.lang.NumberFormatException) {

                }

            }
        }

        binding.buttonX.setOnClickListener {
            if (operacion == "=" || valor1 == 0) {
                operacion = "x"
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable("")
                try {
                    valor1 = valorEntrante.toInt()
                    valorEntrante = ""
                } catch (e: NumberFormatException) {

                }

            } else {

                resultado = 0
                try {
                    valor2 = valorEntrante.toInt()
                    when (operacion) {
                        "x" -> resultado = valor1 * valor2
                        "/" -> resultado = valor1 / valor2
                        "+" -> resultado = valor1 + valor2
                        "-" -> resultado = valor1 - valor2
                    }
                    valor1 = resultado
                    operacion = "x"
                    binding.textViewResultado.text = Editable.Factory.getInstance()
                        .newEditable(resultado.toString())
                } catch (e: java.lang.NumberFormatException) {

                }


            }

        }
        binding.buttonDivision.setOnClickListener {


            if (operacion == "=" || valor1 == 0) {
                operacion = "/"
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable("")
                try {
                    valor1 = valorEntrante.toInt()
                    valorEntrante = ""
                } catch (e: NumberFormatException) {

                }
            } else {

                resultado = 0
                try {
                    valor2 = valorEntrante.toInt()
                    when (operacion) {
                        "x" -> resultado = valor1 * valor2
                        "/" -> resultado = valor1 / valor2
                        "+" -> resultado = valor1 + valor2
                        "-" -> resultado = valor1 - valor2
                    }
                    valor1 = resultado
                    operacion = "/"
                    binding.textViewResultado.text = Editable.Factory.getInstance()
                        .newEditable(resultado.toString())

                } catch (e: java.lang.NumberFormatException) {

                }
            }
        }


        binding.buttonIgual.setOnClickListener {


            resultado = 0
            try {
                valor2 = valorEntrante.toInt()
                when (operacion) {
                    "x" -> resultado = valor1 * valor2
                    "/" -> resultado = valor1 / valor2
                    "+" -> resultado = valor1 + valor2
                    "-" -> resultado = valor1 - valor2
                }
                valor1 = resultado
                valor2 = 0
                valorEntrante = resultado.toString()


                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable(valorEntrante)

                operacion = "="
            } catch (e: java.lang.NumberFormatException) {
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable(valorEntrante)
            }


        }

        binding.buttonC.setOnClickListener {
            resultado = 0
            valorEntrante = ""
            valor1 = 0
            valor2 = 0

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
    }
}


