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

        var valorEntrante = ""
        var valor1 = 0.0
        var valor2: Double
        var operacion = ""
        var resultado: Double


        binding.button9.setOnClickListener {
            valorEntrante += "9"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)
        }

        binding.button8.setOnClickListener {
            valorEntrante += "8"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
        binding.button7.setOnClickListener {
            valorEntrante += "7"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
        binding.button6.setOnClickListener {
            valorEntrante += "6"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
        binding.button5.setOnClickListener {
            valorEntrante += "5"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
        binding.button4.setOnClickListener {
            valorEntrante += "4"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
        binding.button3.setOnClickListener {
            valorEntrante += "3"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
        binding.button2.setOnClickListener {
            valorEntrante += "2"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
        binding.button1.setOnClickListener {
            valorEntrante += "1"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
        binding.button0.setOnClickListener {
            valorEntrante += "0"
            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)

        }
        //operaciones
        binding.buttonMas.setOnClickListener {

            if (operacion == "=" || valor1 == 0.0) {
                operacion = "+"
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable("")
                try {
                    valor1 = valorEntrante.toDouble()
                    valorEntrante = ""
                } catch (_: NumberFormatException) {

                }
            } else {

                resultado = 0.0
                try {
                    valor2 = valorEntrante.toDouble()
                    when (operacion) {
                        "x" -> resultado = valor1 * valor2
                        "/" -> resultado = valor1 / valor2
                        "+" -> resultado = valor1 + valor2
                        "-" -> resultado = valor1 - valor2
                    }
                    valor1 = resultado
                    operacion = "+"
                    valorEntrante = ""
                    binding.textViewResultado.text = Editable.Factory.getInstance()
                        .newEditable(resultado.toString())
                } catch (_: java.lang.NumberFormatException) {

                }

            }
        }

        binding.buttonMenos.setOnClickListener {

            if (operacion == "=" || valor1 == 0.0) {
                operacion = "-"
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable("")
                try {
                    valor1 = valorEntrante.toDouble()
                    valorEntrante = ""
                } catch (_: NumberFormatException) {

                }
            } else {

                resultado = 0.0
                try {
                    valor2 = valorEntrante.toDouble()
                    when (operacion) {
                        "x" -> resultado = valor1 * valor2
                        "/" -> resultado = valor1 / valor2
                        "+" -> resultado = valor1 + valor2
                        "-" -> resultado = valor1 - valor2
                    }
                    valor1 = resultado
                    operacion = "-"
                    valorEntrante = ""
                    binding.textViewResultado.text = Editable.Factory.getInstance()
                        .newEditable(resultado.toString())
                } catch (_: java.lang.NumberFormatException) {

                }

            }
        }

        binding.buttonX.setOnClickListener {
            if (operacion == "=" || valor1 == 0.0) {
                operacion = "x"
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable("")
                try {
                    valor1 = valorEntrante.toDouble()
                    valorEntrante = ""
                } catch (_: NumberFormatException) {

                }

            } else {

                resultado = 0.0
                try {
                    valor2 = valorEntrante.toDouble()
                    when (operacion) {
                        "x" -> resultado = valor1 * valor2
                        "/" -> resultado = valor1 / valor2
                        "+" -> resultado = valor1 + valor2
                        "-" -> resultado = valor1 - valor2
                    }
                    valor1 = resultado
                    operacion = "x"
                    valorEntrante = ""
                    binding.textViewResultado.text = Editable.Factory.getInstance()
                        .newEditable(resultado.toString())
                } catch (_: java.lang.NumberFormatException) {

                }


            }

        }
        binding.buttonDivision.setOnClickListener {
            if (operacion == "=" || valor1 == 0.0) {
                operacion = "/"
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable("")
                try {
                    valor1 = valorEntrante.toDouble()
                    valorEntrante = ""
                } catch (_: NumberFormatException) {

                }
            } else {

                resultado = 0.0
                try {
                    valor2 = valorEntrante.toDouble()
                    when (operacion) {
                        "x" -> resultado = valor1 * valor2
                        "/" -> resultado = valor1 / valor2
                        "+" -> resultado = valor1 + valor2
                        "-" -> resultado = valor1 - valor2
                    }
                    valor1 = resultado
                    operacion = "/"
                    valorEntrante = ""
                    binding.textViewResultado.text = Editable.Factory.getInstance()
                        .newEditable(resultado.toString())

                } catch (_: java.lang.NumberFormatException) {

                }
            }

        }


        binding.buttonIgual.setOnClickListener {
            resultado = 0.0
            try {
                valor2 = valorEntrante.toDouble()
                when (operacion) {
                    "x" -> resultado = valor1 * valor2
                    "/" -> resultado = valor1 / valor2
                    "+" -> resultado = valor1 + valor2
                    "-" -> resultado = valor1 - valor2
                }
                valor1 = resultado
                valor2 = 0.0
                valorEntrante = resultado.toString()


                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable(valorEntrante)

                operacion = "="
            } catch (e: java.lang.NumberFormatException) {
                binding.textViewResultado.text = Editable.Factory.getInstance()
                    .newEditable(valorEntrante)
            }
            valorEntrante = ""
            valor1 = 0.0
        }

        binding.buttonC.setOnClickListener {
            resultado = 0.0
            valorEntrante = ""
            valor1 = 0.0
            valor2 = 0.0
            operacion = ""

            binding.textViewResultado.text = Editable.Factory.getInstance()
                .newEditable(valorEntrante)
        }
    }
}


