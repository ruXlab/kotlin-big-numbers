import org.hamcrest.Matchers.*
import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal

class BigDecimalConverters {

    @Test
    fun testStringInteger() {
        assertThat(BigDecimal("12"), comparesEqualTo("12".asBigDecimal()))
    }

    @Test
    fun testStringDecimal() {
        assertThat(BigDecimal("12.3"), comparesEqualTo("12.3".asBigDecimal()))
    }

    @Test
    fun testInt() {
        assertThat(BigDecimal(123), comparesEqualTo(123.asBigDecimal()))
    }

    @Test
    fun testLong() {
        assertThat(BigDecimal(1234567891234), comparesEqualTo(1234567891234.asBigDecimal()))
    }

    @Test
    fun testDouble() {
        assertThat(BigDecimal(123456789.1234), comparesEqualTo(123456789.1234.asBigDecimal()))
    }


}

