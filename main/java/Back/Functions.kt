package Back

import java.text.Normalizer

fun InputTreatment(word: String): String{ //função tem como proposito retirar os caracteres especiais
                                                                    //tendo como saida a nova palavra sem os caracteres
    var new_word: String = word

    for (character in special_characters){ //pegar cada caracter para vereficar sua existencia
        new_word = new_word.replace(character, "")//troca o caracter por uma string null
    }
    return new_word
}

fun MakeWords(term_raw: String){ //vamos passar pelo menor numero de palavras possiveis, já que uma palavra não pode rearranjar e formar uma maior

    val size: Int = term_raw.length //guardando o valor da palavra
    //vamos entrar dentro de cada array possivel
    if(size >= 8) WordInList(words_8plus, term_raw)
    if(size > 6) WordInList(words_7, term_raw)
    if(size > 5) WordInList(words_6, term_raw)
    if(size > 4) WordInList(words_5, term_raw)
    if(size > 3) WordInList(words_4, term_raw)
    if(size > 2) WordInList(words_3, term_raw)
    if(size > 1) WordInList(words_2, term_raw)
}

fun WordInList(list: Array<String>, term_raw: String){ //serve para verificar se todas as palavras possiveis de serem formadas da lista
    for (word_raw in list){
        val term = Queue(term_raw.removeNonSpacingMarks())  //remevendo os caracteres especiais, depois criando uma lista
        val word = Queue((word_raw.removeNonSpacingMarks()).toUpperCase())
        if (Search(word, term)){       //se a palavra poder ser formada contamos os valores das letras
            AccountValue(word.word, term.word)
        }
    }

}

// pc ou palavra chave = palavra que eu quero formar
// palavra mãe = palavra ou conjunto de letras que o usuario digitou
fun Search(word: Queue, term: Queue): Boolean {  //verificando se a palavra pode ser formada
    //enquanto o tamanho da minha pc for maior que a posição da minha primeira letra
    // e a minha palavra mãe não tiver sido totalmente verificada para uma letra continue
    while ((word.stance < word.size) and !term.FirstToEnd()){
        //println(word.word)
        if (word.FirstInLine() == term.FirstInLine()){    // se a primeira letra das minhas filas forem iguais continue
            word.UpdateStance()                     //atualiza o valor da posição na fila da palavra chave
            term.DeleteFirst()                      //retiramos a letra da fila da palavra mãe
        }
        else{term.UpdateStance()             //então passamos para o proximo da fila, atualizando a posição
        }
    }

    if (word.stance == word.size){  //se a palavra chave tiver sido totalmente varrida(se o tamanho da pc for igual a posição da ultima letra lida
                                    // retornamos true, indicando que a palavra chave pode ser formada
        valuable_word_test = term.word
        return true
    }
    return false    //se a palavra chave não poder ser formada
}

//esta função foi criada só para retirar letras com acentos
fun String.removeNonSpacingMarks():String{
    return Normalizer.normalize(this, Normalizer.Form.NFD).replace("\\p{Mn}+".toRegex(), "")
}

//função conta o valor de cada letra da palavra
fun AccountValue(word: String, term: String){

    var valuable_value_test: Int = 0 //variavel temporaria, para guardar a soma dos valores da nova palavra

    for (letter in word){    //passamos de letra em letra da palavra e verificamos em a existencia da mesma em dos arrays
        if (letter_1.contains(letter)){  //começamos pelo array maior para tentar garantir uma melhor performance
            valuable_value_test += 1
        }
        else if (letter_2.contains(letter)){
            valuable_value_test += 2
        }
        else if (letter_3.contains(letter)){
            valuable_value_test += 3
        }
        else if (letter_4.contains(letter)){
            valuable_value_test += 4
        }
        else if (letter_8.contains(letter)){
            valuable_value_test += 8
        }
        else{
            valuable_value_test += 10
        }
    }
    //verificação para troca de maior valor
    if (valuable_value_test > valuable_value){
        valuable_value = valuable_value_test
        valuable_word = word
        valuable_word_rest = valuable_word_test
    }
    //se os valores forem iguais, devemos então troca para oq tem a menor palavra
    else if ((valuable_value_test == valuable_value) and (word.length < valuable_value_test)){
            valuable_value = valuable_value_test
            valuable_word = word
            valuable_word_rest = valuable_word_test
    }
}