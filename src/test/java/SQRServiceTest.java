import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void sholdCalcTheNumberOfSquareRoot(int begin, int end, int expected) {
        SQRService service = new SQRService();
        int actual = service.theNumberOfSquareRoot(begin, end);
        Assertions.assertEquals(expected, actual);
    }
}
