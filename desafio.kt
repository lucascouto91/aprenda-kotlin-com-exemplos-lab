// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, val email: String, val idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
    }
    fun exibirEstatisticas() {
        println("Formação: $nome")
        println("Número de inscritos: ${inscritos.size}")
        println("Conteúdo na formação:")
        for (conteudo in conteudos) {
            println("${conteudo.nome} (Duração: ${conteudo.duracao} minutos), Nivel:${conteudo.nivel}")
        }
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val usuario1 = Usuario("João","joao@kotlin.com", 38)
    val usuario2 = Usuario("Maria","maria@kotlin.com",35)

    val conteudo1 = ConteudoEducacional("Introducao ao Kotlin", 90, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Programacao Orientada a Objetos", 120, Nivel.DIFICIL)

    val formacao1 = Formacao("Desenvolvimento Android", mutableListOf(conteudo1, conteudo2))
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)

    formacao1.adicionarConteudo(ConteudoEducacional("Estruturas de Controle de Fluxo e Coleções em Kotlin", 110, Nivel.INTERMEDIARIO))
    formacao1.adicionarConteudo(ConteudoEducacional("O Poder das Funções em Kotlin", 100, Nivel.DIFICIL))
    
    formacao1.exibirEstatisticas()
}
