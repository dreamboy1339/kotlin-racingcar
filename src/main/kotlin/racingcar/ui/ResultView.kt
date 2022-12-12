package racingcar.ui

import racingcar.domain.FormularOne
import racingcar.domain.model.CarRacers

object ResultView {

    fun show(f1: FormularOne) {
        showResult(f1.totalResult)
        showWinners(f1)
    }

    private fun showResult(result: List<CarRacers>) {
        println("")
        println("실행 결과")
        result.forEach(::showGameResult)
    }

    private fun showWinners(f1: FormularOne) {
        println("")

        val winners = f1.findWinners()
        val winnerNames = winners.names()

        println("${winnerNames.joinToString(", ")}가 최종 우승했습니다.")
    }

    private fun showGameResult(carRacers: CarRacers) {
        carRacers.forEach { racer ->
            var result = ""
            repeat(racer.position) { result += "-" }
            println("${racer.name} : $result")
        }

        println("")
    }
}
