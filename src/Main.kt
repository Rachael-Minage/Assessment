fun main(){
     name()
     remainder()
     details("Rachael",23)
     length("TheGreatest")


}
fun name(){
    var noun = "CodeHive"
    println(noun[4].toString() + noun[5] + noun[6] + noun[7])

}
fun remainder(){
    var a = 2000
    var b = 43
    var modulus = a%b
    println(modulus)

}
fun details(name: String, age: Int){
    var stmt = "Hi, my name is $name and I am $age years old"
    println(stmt)

}
fun length(word: String){
    println(word.length)

}
