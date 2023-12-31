package fusion.um.model.PROGVO;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 21 21:46:02 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Segment1_PROGVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Seg1key {
            public Object get(Segment1_PROGVORowImpl obj) {
                return obj.getSeg1key();
            }

            public void put(Segment1_PROGVORowImpl obj, Object value) {
                obj.setSeg1key((String)value);
            }
        }
        ,
        Seg1Value {
            public Object get(Segment1_PROGVORowImpl obj) {
                return obj.getSeg1Value();
            }

            public void put(Segment1_PROGVORowImpl obj, Object value) {
                obj.setSeg1Value((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(Segment1_PROGVORowImpl object);

        public abstract void put(Segment1_PROGVORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int SEG1KEY = AttributesEnum.Seg1key.index();
    public static final int SEG1VALUE = AttributesEnum.Seg1Value.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Segment1_PROGVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Seg1key.
     * @return the Seg1key
     */
    public String getSeg1key() {
        return (String) getAttributeInternal(SEG1KEY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Seg1key.
     * @param value value to set the  Seg1key
     */
    public void setSeg1key(String value) {
        setAttributeInternal(SEG1KEY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Seg1Value.
     * @return the Seg1Value
     */
    public String getSeg1Value() {
        return (String) getAttributeInternal(SEG1VALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Seg1Value.
     * @param value value to set the  Seg1Value
     */
    public void setSeg1Value(String value) {
        setAttributeInternal(SEG1VALUE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
