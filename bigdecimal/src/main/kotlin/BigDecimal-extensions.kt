import java.math.BigDecimal
import java.math.MathContext

fun String.asBigDecimal() = BigDecimal(this)
fun String.asBigDecimal(mc: MathContext) = BigDecimal(this, mc)

fun Int.asBigDecimal() = BigDecimal(this)
fun Int.asBigDecimal(mc: MathContext) = BigDecimal(this, mc)

fun Long.asBigDecimal() = BigDecimal(this)
fun Long.asBigDecimal(mc: MathContext) = BigDecimal(this, mc)

fun Double.asBigDecimal() = BigDecimal(this)
fun Double.asBigDecimal(mc: MathContext) = BigDecimal(this, mc)
