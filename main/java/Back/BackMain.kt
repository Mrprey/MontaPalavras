package Back

/**
 * a logica consiste em tratar primeiramente a entrada para retirada de caracteres especiais e deixar as letras maiúsculas.
 * logo depois vamos fazer a busca por palavras que possam ser formadas com o tamanha da entrada
 * essa busca é feita em uma base de dados que é formada por varios arrays cada um dividido para contar palavras de mesmo tamanho
 * utilizando a estrutara de dados fila como logica de formar a melhor palavra.
 * sempre que a primeira letra da fila da palavra mãe(entrada) não for igual a primeira letra da fila da palavra a ser formada, esta letra volta
 * para o fim da fila.
 * ja na fila da palavra mãe e palavra a ser formada, sempre que os ambos primeiros forem iguais devesse passar para o proximo da fila para fazer
 * o mesmo processo.
 * se tiver tiver passado por todos as letras da palavra mãe e nenhuma for igual a primeira letra da outra fila esta palavra não pode ser formada.
 * se o tamanho da fila da palavra a ser formada for 0 encontramos uma palavra que pode ser formada.
 * cada letra foi dividida em um array contendo cada as letras com valores iguais.
 * a logica de contagem do valor da palavra é feita logo depois dos passos anteriores, em que se pega cada letra da palavra formada e verifica se
 * a mesma letra esta contida no array, partindo do maior array para o menor.
 * guardando a palavra, o valor dela e a resto da entrada. Para comparar com as com a proxima candidata a palavra de maior valor.
 */

fun main(message: String): Array<Any>{
    //
    valuable_word = ""
    valuable_value = 0
    valuable_word_rest = ""
    valuable_word_test = ""

    var term_raw = message.toUpperCase() //deixando as letras da entrada maiúsculas

    //aqui se faz a retira dos caracteres especiais/tratamento da entrada
    term_raw = InputTreatment(term_raw)

    //formar as possiveis palavras e calcular o valor da maior]
    MakeWords(term_raw)

    if(valuable_value == 0) {
        return arrayOf(valuable_word, valuable_value, term_raw)
    }
    return arrayOf(valuable_word,valuable_value,valuable_word_rest)
}

