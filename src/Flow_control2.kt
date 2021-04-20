fun main() {
 println(isEven(7))
    println(isEven(8))
    println(E("Banana"))
    println(S(arrayOf("Chantal","Emma","Peter","Jeanne","Mama")))
    var prod = Product("pen", 40, 500, "gloceries")
    println(prod.P("pen"))
    var prod2 = Product("Book", 10, 600, "hygiene")
    println(prod2.P("Book"))
  var prod3 = Product("Chair", 20, 300, "other")
    println(prod3.P("Chair"))
}
fun isEven(num:Int):Boolean{
 if(num%2==0){
    return true
  }
    else{
        return false
  }
}

    data class Product(var name:String,var weight:Int,var price:Int,var category:String ){
fun P(product:String) {
    when (product) {
        "pen" -> println("Pen = gloceries")
        "Book" -> println("Book = Hygienne")
        "Chair" -> println("Chair = other")
    }
}
}
    fun E(s: String): String {
        var x = " "
        for (i in s) {
            var x = " "
            if (i !== 'i' || i !== 'u' || i !== '0' || i !== 'a' || i !== 'e') {
                return x.plus(i)
            }
        }
    }


    fun S(names: Array<String>): Array<String> {
        var c =  ""
        for (name in names) {
            if (name.length % 2 == 0) {
                c += 1

            }

            return name.plus(c)
        }
    }
}


