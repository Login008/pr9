package InternetShops
open class InternetShop (var product1: String, var price1: Double, var information1: String){
    var product : String = product1
    var price : Double = price1
    var information : String = information1
    open fun Tovar(){
        println("Продукт: ${this.product}. Цена: ${this.price}")
    }
    open fun GetInfo(){
        println("Продукт: ${this.product}. Информация о продукте: ${this.information}")
    }
    open fun SetInfo(){
        print("Введите название товара: ")
        product1 = readLine()!!.toString()
        this.product = product1
        print("Введите цену товара: ")
        price1 = readLine()!!.toDouble()
        this.price = price1
        print("Введите информацию о товаре: ")
        information1 = readLine()!!.toString()
        this.information = information1
    }
}