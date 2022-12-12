package racingcar

import racingcar.domain.FormularOne
import racingcar.domain.model.CarNames
import racingcar.ui.InputView
import racingcar.ui.ResultView

fun main() {
    val inputView = InputView()

    val carNames = inputView.inputCarNames()
    val numberOfGame = inputView.inputNumberOfGame()

    val f1 = FormularOne(CarNames(carNames), numberOfGame)
    f1.start()

    ResultView.show(f1)
}
