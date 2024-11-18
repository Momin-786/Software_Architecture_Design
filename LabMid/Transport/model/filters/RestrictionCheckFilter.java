package model.filters;

public class RestrictionCheckFilter implements Filter {
    @Override
    public String process(String notification) {
        return notification + " [Restrictions Checked]";
    }
}
