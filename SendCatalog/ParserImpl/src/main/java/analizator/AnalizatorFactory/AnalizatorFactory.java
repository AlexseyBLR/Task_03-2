package analizator.AnalizatorFactory;

import analizator.Analizator;
import analizator.AnalizatorException.AnalizatorException;
import analizator.IAnalizator;

public final class AnalizatorFactory {

    private static final AnalizatorFactory instance = new AnalizatorFactory();

    private AnalizatorFactory() {}

    public IAnalizator getApplianceService(String path) throws AnalizatorException {

        return new Analizator(path);
    }

    public static AnalizatorFactory getInstance() {
        return instance;
    }

    public static void main(String[] args) throws AnalizatorException {
        AnalizatorFactory factory = AnalizatorFactory.getInstance();
        factory.getApplianceService("C:\\Users\\Lesha\\Desktop\\web.xml");
    }

}

