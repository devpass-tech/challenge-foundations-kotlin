package irrf

class IRRFCalculator() {

    fun calculateIRRF(salary: Double): Double? {

        val irrfRanges: List<IRRFRange> = IRRFRangeManager.readFileIRRF("/faixasIRRF.txt")

        var irrfResult: Double? = null

        for (irrfRange in irrfRanges) {
            if (salary > irrfRange.minimumValue && salary < irrfRange.maximumValue) {

                val applyRate = salary * (irrfRange.rate / 100)

                irrfResult = applyRate - irrfRange.deductableParcel

            }
        }
        return irrfResult
    }
}














