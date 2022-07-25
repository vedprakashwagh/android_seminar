package com.vedprakash.wagh

class Calculator {

    var numberOne : Double = 0.0
    var numberTwo : Double = 0.0
    var result: Double = 0.0

    private constructor(){}

    constructor(numberOne: Double, numberTwo: Double, sign: String){
        this.numberOne = numberOne
        this.numberTwo = numberTwo

        when(sign){
            "+" -> {
                addition()
            }

            "*" -> {
                multiply()
            }

            "/" -> {
                divide()
            }

            "-" -> {
                subtract()
            }

            else -> {
                println("Input sign is invalid!")
            }
        }

    }

    private fun addition(){
        result = numberOne + numberTwo
    }

    private fun multiply() {
        result = numberOne * numberTwo
    }

    private fun divide() {
        if(numberOne > numberTwo){
            result = numberOne / numberTwo
        } else if (numberTwo > numberOne) {
            result = numberTwo / numberOne
        } else {
            result = 1.0
        }
    }

    private fun subtract() {

        when {
            numberOne > numberTwo -> {
                result = numberOne - numberTwo
            }

            numberTwo > numberOne -> {
                result = numberTwo - numberOne
            }

            else -> {
                result = 0.0
            }
        }

    }


}