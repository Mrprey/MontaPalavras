package Back

//estrutura de dados fila
//onde para a palavra mãe(digitada pelo usuario) se não for igual ao valor do primeiro da outra fila devesse voltar para o final
//fila da palavra chave(palavra que queremos formar) vai funcionar normalmente
class Queue(word_raw: String) {
        var word: String = word_raw  //palavra ou conjunto de letra

        var size: Int = word.length  //tamanho da palavra
        var stance: Int = 0         //posição da fila

    fun FirstInLine(): Char{ //retorna o primeiro valor da fila
        //println(word)
        return word[stance]
    }

    fun UpdateStance(){  //atualiza o valor da posição da fila
        stance += 1
    }
    //usado na lista da palavra mãe
    fun FirstToEnd(): Boolean{ //se stance == size quer dizer que já foi passado por todos as letras da palavra
        return stance == size
    }

    fun DeleteFirst(){
        //print("delete")
        word = word.replaceFirst(word[stance].toString(), "")
        stance = 0
        size = word.length
    }
}