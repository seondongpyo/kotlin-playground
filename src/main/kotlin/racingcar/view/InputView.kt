package racingcar.view

import java.util.Scanner

class InputView {

    companion object {
        private val scanner = Scanner(System.`in`)

        fun carNames(): String {
            println("자동차 이름 입력(5자 이하, ','로 구분): ")
            return scanner.next()
        }

        fun attemptCount(): Int {
            println("시도 횟수 입력: ")
            return scanner.nextInt()
        }
    }
}
