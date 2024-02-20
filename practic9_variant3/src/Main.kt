import InternetShops.InternetShop
fun main() {
    try {
        var blok: Boolean = false
        println("Товаровед:")
        var productOne = InternetShops.InternetShop("", 0.0, "")
        productOne.SetInfo()
        println("-------------------------------")
        println("Клиент:")
        productOne.Tovar()
        productOne.GetInfo()
        var klient1 = Klient("", 0.0, 0.0, 0, productOne.product, productOne.price, productOne.information)
        klient1.SetInfo()
        var tovaroved1 = Tovaroved(false, klient1.surname, klient1.product, productOne.price, productOne.information)
        if (klient1.pokupka > klient1.budzhet) {
            while (true){
                print("Вы хотите заблокировать клиента ${klient1.surname}? ")
                var answer1 = readLine()!!.toString()
                if (answer1 == "Да") {
                    tovaroved1.block = true
                    tovaroved1.BlockList()
                    break
                }
                else if (answer1 == "Нет") {
                    tovaroved1.block = false
                    println("Товаровед:")
                    klient1.PokupkaInfo()
                    klient1.GetInfoCheck()
                    break
                }
            }
        }
        if(tovaroved1.block == true){
            while(true){
                print("Вы хотите разблокировать клиента ${klient1.surname}? ")
                var answer = readLine()!!.toString()
                if(answer == "Нет"){
                    break
                }
                else if (answer == "Да"){
                    tovaroved1.block = false
                    break
                }
            }
        }
        if (tovaroved1.block == true) {
            tovaroved1.BlockList()
            println("Клиент:")
            klient1.BlokPerson()
        } else {
            tovaroved1.ProductAdd()
            tovaroved1.ZakazInfo()
            println("Клиент:")
            klient1.UnBlokPerson()
        }
    }
    catch(e:Exception){
        println("Неверный формат данных, введите данные заново")
        main()
    }
}