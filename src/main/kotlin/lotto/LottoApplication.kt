package lotto

import lotto.domain.*
import lotto.view.InputView
import lotto.view.ResultView

fun main() {
    val money = LottoMoney(InputView.money())
    val manualLottoTicketCount = InputView.manualLottoTicketCount()
    val manualLottoTicketNumbers = InputView.manualLottoTicketNumbers(manualLottoTicketCount)

    val lottoMachine = LottoTicketMachine()
    val lottoTickets = lottoMachine.issueLottoTickets(money.availableLottoTicketCount(), manualLottoTicketNumbers)
    ResultView.showPurchasedLottoTickets(lottoTickets)

    val winningNumbers = LottoNumbers.from(InputView.winningNumbers())
    val bonusNumber = InputView.bonusNumber()
    val winningLottoTicket = WinningLottoTicket(winningNumbers.toLottoTicket(), LottoNumber(bonusNumber))

    val ranks = lottoTickets.match(winningLottoTicket)
    ResultView.showTotalPrizes(money, ranks)
}
