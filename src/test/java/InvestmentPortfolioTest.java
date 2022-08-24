import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvestmentPortfolioTest {

    private InvestmentPortfolio investmentPortfolio;


    @BeforeEach
    public void setUp(){
        investmentPortfolio = new InvestmentPortfolio("portfolio1", "Guy");
    }

    @Test
    public void canGetName(){
        String expected = "portfolio1";
        String actual = InvestmentPortfolio.name();
        assertEquals(expected, actual);

    }



}
