import Travels.Travel as NewTravel
fun main() {
    var Egypt = TravelVoyage("", "", 0, "", 0.0, "", "" )
    Egypt.SetInfo()
    Egypt.VoiceTrain()
    Egypt.GetInfo()
    Egypt.Result()
    Egypt.HoursInWay()

    var Sakhalin = TravelJob("", "", 0, "", 0.0, "", "" )
    Sakhalin.SetInfo()
    Sakhalin.VoiceTrain()
    Sakhalin.GetInfo()
    Sakhalin.Result()
    Sakhalin.HoursInWay()
}