package fusion.um.model.AM.client;

import fusion.um.model.AM.common.MenuAccess_AM;

import oracle.jbo.client.remote.ApplicationModuleImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Mar 26 12:45:56 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MenuAccess_AMClient extends ApplicationModuleImpl implements MenuAccess_AM {
    /**
     * This is the default constructor (do not remove).
     */
    public MenuAccess_AMClient() {
    }

    public void getResetData() {
        Object _ret = this.riInvokeExportedMethod(this,"getResetData",null,null);
        return;
    }

    public void getCommitData() {
        Object _ret = this.riInvokeExportedMethod(this,"getCommitData",null,null);
        return;
    }
}
