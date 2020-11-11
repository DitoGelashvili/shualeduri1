package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;

public class Main {

    final static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.trace("This is Trace");
        logger.debug("This is Debug");
        logger.info("This is Info");
        logger.warn("This is Warning");
        logger.error("This is Error");
        logger.fatal("This is Fatal");


        CurrencyService currencyService = new CurrencyServiceImpl();
        currencyService.setExchangeRate(3);

        System.out.println(currencyService.convert(12));
        System.out.println(122.3);

        logger.trace("This is Trace");
        logger.debug("This is Debug");
        logger.info("This is Info");
        logger.warn("This is Warning");
        logger.error("This is Error");
        logger.fatal("This is Fatal");

    }
}
