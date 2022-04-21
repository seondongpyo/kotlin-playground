package racingcar.view

import java.util.Scanner

class InputView {

    companion object {
        private val scanner = Scanner(System.`in`)

        fun carNames(): String {
            return scanner.next()
        }

        fun attemptCount(): Int {
            return scanner.nextInt()
        }
    }
}
