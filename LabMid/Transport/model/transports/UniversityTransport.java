package model.transports;

public class UniversityTransport {
    private boolean restrictions;
    private boolean advancePaymentRequired;

    public UniversityTransport(boolean restrictions, boolean advancePaymentRequired) {
        this.restrictions = restrictions;
        this.advancePaymentRequired = advancePaymentRequired;
    }

    public String getDetails() {
        return String.format( 
            "University Transport Details:\n" +
            "  - Restrictions: %s\n" +
            "  - Advance Payment Required: %b", 
            restrictions, advancePaymentRequired
        );
    }
    
}
