import Cinemas.*
class Blockbuster (var type : String, var timeFilm : String, var reaction : String, var EnameFilm : String, var Eseans : String, var Eprice : Double, var EnumberHall : Int, var EsumViewers : Int) : Cinema (EnameFilm, Eseans, Eprice, EnumberHall, EsumViewers) {
    override fun SetInfo() {
        try {
            print("Введите название фильма: ")
            var nameFilm = readLine()!!.toString()
            this.EnameFilm = nameFilm

            print("Введите тип сеанса (утренний, дневной, вечерний, ночной): ")
            var seans = readLine()!!.toString()
            this.Eseans = seans

            print("Введите цену за билет в долларах: ")
            var price = readLine()!!.toDouble()
            if (price >= 0) {
                this.Eprice = price

                print("Введите номер зала: ")
                var numberHall = readLine()!!.toInt()
                if (numberHall >= 0) {
                    this.EnumberHall = numberHall
                    print("Введите количество зрителей: ")
                    var sumViewers = readLine()!!.toInt()
                    if (sumViewers >= 0) {
                        this.EsumViewers = sumViewers
                        print("Введите продолжительность показа фильма: ")
                        var timeFilm = readLine()!!.toString()
                        this.timeFilm = timeFilm
                        print("Ваще впечатление от фильма? ")
                        var reaction = readLine()!!.toString()
                        this.reaction = reaction
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
    override fun GetInfo() {
        println("Название фильма: $EnameFilm\nСеанс: $Eseans\nЦена билета для вас: $Eprice\nНомер зала: $EnumberHall\nКоличество зрителей: $EsumViewers\nВид фильма: $type\nВпечатление зрителей от фильма: $reaction")
    }
    fun Skidka() {
        try {
            println("Вы являетесь пенсионером или ребёнком? true или false")
            var T = readLine()!!.toBoolean()
            when (T)
            {
                true -> this.Eprice -= this.Eprice * 0.1
                false -> this.Eprice = this.Eprice
            }
        }
        catch (e:Exception) {
            println("Неверный формат данных, введите заново")
            Skidka()
        }
    }
}