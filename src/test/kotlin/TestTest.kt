import org.junit.jupiter.api.Test


class TestTest {

    @Test
    internal fun `hace cosas`() {

        val calculadora = Calculadora2()


        assert(calculadora.suma(2,2) == 4)
    }

    @Test
    internal fun `suma una lista de numeros`() {
        val calculadora = Calculadora()

        val lista = listOf(2, 10, 20, 9, 13)

        lista
            .filter { it % 2 == 0 }
            .map { 2*it }
            .take(2)

        assert(calculadora.listSum(lista) == 54)
    }
}