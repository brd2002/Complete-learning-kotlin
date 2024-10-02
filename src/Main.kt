class user(val name : String , val city : String){
    fun printall(){
        println("name : $name")
        println("city : $city")
    }
    }

fun main() {
    var name1 = "Bharat Ruidas"
    val name2 = "kismat"
//    println(name1.length)
    var nameof : Array<String> = arrayOf("kisna" , "arindam" ,"rajib")

//    println(nameof[1])
    var user1 = user("Bharat" , "Dhaka")
//    user1.printall()
    val name = readLine()
    print("the name is $name")
}