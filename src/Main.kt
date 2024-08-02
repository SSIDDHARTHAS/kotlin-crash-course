fun main() {
    val amIAnAdult = false
    val amIAProgrammer = true
    val amIAnAdultProgrammer = amIAnAdult and amIAProgrammer
    val amIAnAdultOrAProgrammer = amIAnAdult or amIAProgrammer
    println("Am I an adult programmer? : $amIAnAdultProgrammer")
    println("Am I an adult or a programmer? : $amIAnAdultOrAProgrammer")
    println(amIAProgrammer != amIAnAdult)
    println(amIAProgrammer == amIAnAdult)
}