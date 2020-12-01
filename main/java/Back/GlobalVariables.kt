package Back

//cada letra e seus seus valores estão indicados na frente do array
val letter_1 = arrayOf("E", "A", "I", "O", "N", "R", "T", "L", "S", "U")
val letter_2 = arrayOf("W", "D", "G")
val letter_3 = arrayOf("B", "C", "M", "P")
val letter_4 = arrayOf("F", "H", "V")
val letter_8 = arrayOf("J", "X")
val letter_10 = arrayOf("Q", "Z")

//as palavras foram separas em um programa python, já que era só para um tramamento rapido dos dados,
// para facilitar uma busca posterior
val words_2 = arrayOf("Já", "Pé")
val words_3 = arrayOf("Uva", "Dor")
val words_4 = arrayOf("mesa", "Dado", "rota", "Neve", "Neve", "Pato")
val words_5 = arrayOf(
        "porta", "Ratos", "Ruído", "balão", "Tédio", "faixa", "Solto", "Selva", "Tigre",
        "Folga", "Livro", "Ontem", "Homem", "Jogos", "Nuvem", "Cupim",
)
val words_6 = arrayOf(
        "Manada", "coisas", "Mangas", "Drogas", "mandar", "Xícara", "deixar", "Queijo", "viagem", "Último", "Jantar",
        "Caixas", "Goiaba", "Quarto", "Manual",
)
val words_7 = arrayOf(
        "Abacaxi", "prédios", "Quintal", "Zangado", "Hídrico", "Reunião", "Prédios",
        "Empresa", "Fratura",
)
val words_8plus = arrayOf(
        "radiografia", "matemática", "implementação", "computador", "superior", "Profissão",
        "Montanha", "Botânica", "Banheiro", "Xingamento", "Infestação", "Premiada", "empanada",
        "Antecedente", "Emissário", "Gratuito", "Operação", "Tatuagem", "Montagem", "Vitupério", "Voltagem",
        "Zombaria",
)

//alguns caracteres especiais
val special_characters = arrayOf("!","@","#","$","%","¨","&","*","(",")","-","_","´","`")



var valuable_word: String = ""  //variavel da palavra com maior valor
var valuable_value: Int = 0     //variavel do valor da maior palavra
var valuable_word_rest: String = "" //variavel para retirada das letra que sobrarem
var valuable_word_test = "" //guardar as letras que podem sobrar
