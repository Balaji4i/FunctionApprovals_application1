package fusion.um.model.PROGVO;

import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 21 22:40:39 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Segment2_PROGVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Seg2Key {
            public Object get(Segment2_PROGVORowImpl obj) {
                return obj.getSeg2Key();
            }

            public void put(Segment2_PROGVORowImpl obj, Object value) {
                obj.setSeg2Key((String)value);
            }
        }
        ,
        Seg2Value {
            public Object get(Segment2_PROGVORowImpl obj) {
                return obj.getSeg2Value();
            }

            public void put(Segment2_PROGVORowImpl obj, Object value) {
                obj.setSeg2Value((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(Segment2_PROGVORowImpl object);

        public abstract void put(Segment2_PROGVORowImpl object, Object value);

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
    public static final int SEG2KEY = AttributesEnum.Seg2Key.index();
    public static final int SEG2VALUE = AttributesEnum.Seg2Value.index();

    /**
     * This is the default constructor (do not remove).
     */
    public Segment2_PROGVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute Seg2Key.
     * @return the Seg2Key
     */
    public String getSeg2Key() {
        return (String) getAttributeInternal(SEG2KEY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Seg2Key.
     * @param value value to set the  Seg2Key
     */
    public void setSeg2Key(String value) {
        setAttributeInternal(SEG2KEY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Seg2Value.
     * @return the Seg2Value
     */
    public String getSeg2Value() {
        return (String) getAttributeInternal(SEG2VALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Seg2Value.
     * @param value value to set the  Seg2Value
     */
    public void setSeg2Value(String value) {
        setAttributeInternal(SEG2VALUE, value);
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