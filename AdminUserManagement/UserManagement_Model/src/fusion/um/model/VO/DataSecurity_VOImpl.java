package fusion.um.model.VO;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 21 12:55:39 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DataSecurity_VOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public DataSecurity_VOImpl() {
    }

    /**
     * Returns the variable value for BV_ID.
     * @return variable value for BV_ID
     */
    public String getBV_ID() {
        return (String)ensureVariableManager().getVariableValue("BV_ID");
    }

    /**
     * Sets <code>value</code> for variable BV_ID.
     * @param value value to bind as BV_ID
     */
    public void setBV_ID(String value) {
        ensureVariableManager().setVariableValue("BV_ID", value);
    }
}
