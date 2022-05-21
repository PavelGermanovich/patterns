package paterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet{
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("ab.cdo");
        bannedSites.add("rtua.ad");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if (bannedSites.contains(url)) {
            throw new Exception("Address denied, as it`s banned");
        } else {
            connectTo(url);
        }
    }
}
