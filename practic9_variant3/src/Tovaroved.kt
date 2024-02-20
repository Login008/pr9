import InternetShops.*
open class Tovaroved (var block1: Boolean, var surname1: String, empproduct: String, empprise: Double, empinformation: String) : InternetShop(empproduct, empprise, empinformation){
    var block : Boolean = block1
    var surname : String = surname1
    open fun ProductAdd(){
        println("заказ на фамилию $surname принят")
    }
    open fun ZakazInfo(){
        println("$surname:\nпокупает $product \nинформация о товаре :$information")
    }
    open fun BlockList(){
        println("Вы заблокировали клиента $surname для покупки товара $product")
    }
}