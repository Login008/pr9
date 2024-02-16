import Travels.*
class TravelVoyage (var travelType : String = "Отпуск", var nameHotel : String, var empnumberTrain : Int, var empdestination : String, var empdaysInWay : Double, var emptimeArriving : String, var emptimeStop : String) : Travel(empnumberTrain, empdestination, empdaysInWay, emptimeArriving, emptimeStop) {
    override fun SetInfo()
    {
        try {
            print("Введите номер поезда: ")
            var empnumberTrain = readLine()!!.toInt()
            if (empnumberTrain >= 0) {
                this.empnumberTrain = empnumberTrain
                print("Введите пункт назначения: ")
                var empdestination = readLine()!!.toString()
                this.empdestination = empdestination
                print("Введите количество дней в пути: ")
                var empdaysInWay = readLine()!!.toDouble()
                if (empdaysInWay > 0) {
                    this.empdaysInWay = empdaysInWay
                    print("Введите время прибытия: ")
                    var emptimeArriving = readLine()!!.toString()
                    this.emptimeArriving = emptimeArriving
                    print("Введите время остановки: ")
                    var emptimeStop = readLine()!!.toString()
                    this.emptimeStop = emptimeStop
                    print("Введите название Отеля на время проживания: ")
                    nameHotel = readLine()!!.toString()
                    this.nameHotel = nameHotel
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
    fun Result() {
        println("Человек однозначно хорошо отдохнёт в данной поездке")
    }
    override fun GetInfo()
    {
        println("Поездка на отдых\nНомер поезда: $empnumberTrain\nПункт назначения: $empdestination\nДней в пути: $empdaysInWay\nВремя прибытия: $emptimeArriving\nВремя стоянки: $emptimeStop\nНазвание отеля на время проживания: $nameHotel")
    }
    override fun VoiceTrain() {
        println("Курортный поезд в $travelType отправляется")
    }
    override fun HoursInWay () {
        var hoursInWay : Double = empdaysInWay * 24
        println("Поезд в пути пробудет ${String.format("%.2f", hoursInWay)} часов")
    }
}

class TravelJob (var travelType : String = "По работе", var location : String, var empnumberTrain : Int, var empdestination : String, var empdaysInWay : Double, var emptimeArriving : String, var emptimeStop : String) : Travel(empnumberTrain, empdestination, empdaysInWay, emptimeArriving, emptimeStop) {
    override fun SetInfo()
    {
        try {
            print("Введите номер поезда: ")
            var empnumberTrain = readLine()!!.toInt()
            if (empnumberTrain >= 0) {
                this.empnumberTrain = empnumberTrain
                print("Введите пункт назначения: ")
                var empdestination = readLine()!!.toString()
                this.empdestination = empdestination
                print("Введите количество дней в пути: ")
                var empdaysInWay = readLine()!!.toDouble()
                if (empdaysInWay > 0) {
                    this.empdaysInWay = empdaysInWay
                    print("Введите время прибытия: ")
                    var emptimeArriving = readLine()!!.toString()
                    this.emptimeArriving = emptimeArriving
                    print("Введите время остановки: ")
                    var emptimeStop = readLine()!!.toString()
                    this.emptimeStop = emptimeStop
                    print("Введите место работы на время проживания: ")
                    location = readLine()!!.toString()
                    this.location = location
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
    fun Result() {
        println("Человек много заработает в поездке")
    }
    override fun GetInfo()
    {
        println("Поездка на отдых\nНомер поезда: $empnumberTrain\nПункт назначения: $empdestination\nДней в пути: $empdaysInWay\nВремя прибытия: $emptimeArriving\nВремя стоянки: $emptimeStop\nМесто работы на время проживания: $location")
    }
    override fun VoiceTrain() {
        println("Поезд отправляется в $travelType")
    }
    override fun HoursInWay () {
        var hoursInWay : Double = empdaysInWay * 24
        println("Поезд в пути пробудет ${String.format("%.2f", hoursInWay)} часов")
    }
}