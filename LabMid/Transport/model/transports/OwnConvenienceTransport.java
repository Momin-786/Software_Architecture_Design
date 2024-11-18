package model.transports;


public class OwnConvenienceTransport {
    private boolean flexibleTime;
    private boolean payAsYouUse;

    public OwnConvenienceTransport(boolean flexibleTime, boolean payAsYouUse) {
        this.flexibleTime = flexibleTime;
        this.payAsYouUse = payAsYouUse;
    }

    public String getDetails() {
        return "Yes you go for your Own Convenience eith your Flexible Time =  " + flexibleTime +
               ",abd  Pay As You Use = " + payAsYouUse;
    }
}
