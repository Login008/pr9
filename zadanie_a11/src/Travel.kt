package Travels
open class Travel(var numberTrain : Int, var destination : String, var daysInWay : Double, var timeArriving : String, var timeStop : String) {
    open fun SetInfo() {
        try {
            print("Введите номер поезда: ")
            var numberTrain = readLine()!!.toInt()
            if (numberTrain >= 0) {
                this.numberTrain = numberTrain
                print("Введите пункт назначения: ")
                var destination = readLine()!!.toString()
                this.destination = destination
                print("Введите количество дней в пути: ")
                var daysInWay = readLine()!!.toDouble()
                if (daysInWay > 0.0) {
                    this.daysInWay = daysInWay
                    print("Введите время прибытия: ")
                    var timeArriving = readLine()!!.toString()
                    this.timeArriving = timeArriving
                    print("Введите время остановки: ")
                    var timeStop = readLine()!!.toString()
                    this.timeStop = timeStop
                } else {
                    println("Количество дней в пути не может быть отрицательным или равно нулю, введите заново")
                    SetInfo()
                }
            } else {
                println("Номер поезда не может быть отрицательным, введите заново")
                SetInfo()
            }
        }
        catch (e:Exception) {
            println("Неверный формат данных, введите заново")
            SetInfo()
        }
    }
    open fun GetInfo() {
        println("Номер поезда: $numberTrain\nПункт назначения: $destination\nДней в пути: $daysInWay\nВремя прибытия: $timeArriving\nВремя стоянки: $timeStop")
    }
    open fun VoiceTrain () {
        println("Поезд отправляется.")
    }
    open fun HoursInWay () {
        var hoursInWay : Double = daysInWay * 24
        println("Поезд в пути пробудет ${String.format("%.2f", hoursInWay)} часов")
    }
}