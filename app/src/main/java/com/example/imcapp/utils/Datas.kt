package com.example.imcapp.utils

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun dataAtualBrasil(): String {

    // * OBTER A DATA ATUAL
    val hoje = LocalDate.now()

    // * DETERINAR O FORMATO DA DATA (br)
    val formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    // * CONVERTER A DATA PARA BRASIL
    val hojeBrasil = hoje.format(formatoBrasil)

    return hojeBrasil
}