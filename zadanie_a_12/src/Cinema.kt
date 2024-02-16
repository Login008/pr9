package Cinemas
open class Cinema(var nameFilm : String, var seans : String, var price : Double, var numberHall : Int, var sumViewers : Int) {
    open fun SetInfo() {
        try {
            print("Введите название фильма: ")
            var nameFilm = readLine()!!.toString()
            this.nameFilm = nameFilm

            print("Введите тип сеанса (утренний, дневной, вечерний, ночной): ")
            var seans = readLine()!!.toString()
            this.seans = seans

            print("Введите цену за билет в долларах: ")
            var price = readLine()!!.toDouble()
            if (price >= 0) {
                this.price = price

                print("Введите номер зала: ")
                var numberHall = readLine()!!.toInt()
                if (numberHall >= 0) {
                    this.numberHall = numberHall
                    print("Введите количество зрителей: ")
                    var sumViewers = readLine()!!.toInt()
                    if (sumViewers >= 0) {
                        this.sumViewers = sumViewers
                    }
                    else {
                        println("Количество зрителей не может быть отрицательным, введите заново")
                        SetInfo()
                    }
                }
                else {
                    println("Номер зала не может быть отрицательной, введите заново")
                    SetInfo()
                }
            }
            else {
                println("Цена не может быть отрицательной, введите заново")
                SetInfo()
            }
        }
        catch (e:Exception) {
            println("Неверный формат данных, введите заново")
            SetInfo()
        }
    }
    open fun GetInfo() {
        println("Название фильма: $nameFilm\nСеанс: $seans\nЦена билета: $price\nНомер зала: $numberHall\nКоличество зрителей: $sumViewers")
    }
    open fun Reclama() {
        println("Длительность рекламы перед началом показа фильма = 10 минут")
    }
}