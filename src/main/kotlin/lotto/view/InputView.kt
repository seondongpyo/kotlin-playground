package lotto.view

import lotto.domain.LottoNumbers
import java.util.*
import java.util.stream.Collectors
import java.util.stream.IntStream

class InputView {

    companion object {
        private val scanner = Scanner(System.`in`)

        fun money(): Long {
            println("구입금액을 입력해 주세요.")
            return scanner.nextLong()
        }

        fun manualLottoTicketCount(): Int {
            println("수동으로 구매할 로또 수를 입력해 주세요.")
            return scanner.nextInt()
        }

        fun manualLottoTicketNumbers(manualLottoTicketsCount: Int): List<LottoNumbers> {
            println("수동으로 구매할 번호를 입력해 주세요.")
            return IntStream.range(0, manualLottoTicketsCount)
                .mapToObj { LottoNumbers.from(scanner.next()) }
                .collect(Collectors.toList())
        }

        fun winningNumbers(): String {
            println("지난 주 당첨 번호를 입력해 주세요.")
            return scanner.next()
        }

        fun bonusNumber(): Int {
            println("보너스 볼을 입력해 주세요.")
            return scanner.nextInt()
        }
    }
}
