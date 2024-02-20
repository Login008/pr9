import InternetShops.*
open class Klient (var surname1: String, var pokupka1: Double, var budzhet1: Double, var kol1: Int, empproduct: String, empprice: Double, empinformation: String): InternetShop(empproduct, empprice, empinformation){
    var surname = surname1
    var pokupka = pokupka1
    var budzhet = budzhet1
    var kol = kol1
    override fun SetInfo() {
        print("Введите вашу фамилию: ")
        surname1 = readLine()!!.toString()
        this.surname = surname1
        print("Введите ваш баланс: ")
        budzhet1 = readLine()!!.toDouble()
        this.budzhet = budzhet1
        print("Введите количество товара: ")
        kol1 = readLine()!!.toInt()
        this.kol = kol1
        this.pokupka = price * kol
    }
    open fun GetInfoCheck(){
        println("Фамилия: $surname. Чек ценой: $pokupka. Баланс: $budzhet")
    }
    open fun PokupkaInfo(){
        println("$surname покупает $product стоимостью $price рублей за 1 штуку в количестве $kol")
    }
    open fun BlokPerson(){
        println("Вы заблокированы для покупки товара $product в количестве $kol штук")
    }
    open fun UnBlokPerson(){
        println("Вы удачно завершили покупку, $surname, поздравляю, ожидайте заказ")
    }
}