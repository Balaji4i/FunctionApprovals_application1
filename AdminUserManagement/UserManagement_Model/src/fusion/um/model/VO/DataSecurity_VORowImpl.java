package fusion.um.model.VO;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 21 12:55:39 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DataSecurity_VORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        DseqId {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getDseqId();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setDseqId((Number)value);
            }
        }
        ,
        SeqNumber {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getSeqNumber();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setSeqNumber((Number)value);
            }
        }
        ,
        SegmentColumn {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getSegmentColumn();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setSegmentColumn((String)value);
            }
        }
        ,
        ColumnName {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getColumnName();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setColumnName((String)value);
            }
        }
        ,
        SrcTable {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getSrcTable();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setSrcTable((String)value);
            }
        }
        ,
        SrcColumn {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getSrcColumn();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setSrcColumn((String)value);
            }
        }
        ,
        SrcDispColumn {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getSrcDispColumn();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setSrcDispColumn((String)value);
            }
        }
        ,
        SrcLookupType {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getSrcLookupType();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setSrcLookupType((String)value);
            }
        }
        ,
        ActiveYn {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getActiveYn();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setActiveYn((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setLastUpdateLogin((String)value);
            }
        }
        ,
        Trans_Active {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getTrans_Active();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setTrans_Active((Boolean)value);
            }
        }
        ,
        DataSecurityTable_ROVO1 {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getDataSecurityTable_ROVO1();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DataSecurityColumn_ROVO1 {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getDataSecurityColumn_ROVO1();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ChecklistLookup_ROVO1 {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getChecklistLookup_ROVO1();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DataSecuritySegment_STATVO1 {
            public Object get(DataSecurity_VORowImpl obj) {
                return obj.getDataSecuritySegment_STATVO1();
            }

            public void put(DataSecurity_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(DataSecurity_VORowImpl object);

        public abstract void put(DataSecurity_VORowImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() +
                AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DSEQID = AttributesEnum.DseqId.index();
    public static final int SEQNUMBER = AttributesEnum.SeqNumber.index();
    public static final int SEGMENTCOLUMN = AttributesEnum.SegmentColumn.index();
    public static final int COLUMNNAME = AttributesEnum.ColumnName.index();
    public static final int SRCTABLE = AttributesEnum.SrcTable.index();
    public static final int SRCCOLUMN = AttributesEnum.SrcColumn.index();
    public static final int SRCDISPCOLUMN = AttributesEnum.SrcDispColumn.index();
    public static final int SRCLOOKUPTYPE = AttributesEnum.SrcLookupType.index();
    public static final int ACTIVEYN = AttributesEnum.ActiveYn.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int TRANS_ACTIVE = AttributesEnum.Trans_Active.index();
    public static final int DATASECURITYTABLE_ROVO1 = AttributesEnum.DataSecurityTable_ROVO1.index();
    public static final int DATASECURITYCOLUMN_ROVO1 = AttributesEnum.DataSecurityColumn_ROVO1.index();
    public static final int CHECKLISTLOOKUP_ROVO1 = AttributesEnum.ChecklistLookup_ROVO1.index();
    public static final int DATASECURITYSEGMENT_STATVO1 = AttributesEnum.DataSecuritySegment_STATVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DataSecurity_VORowImpl() {
    }

    /**
     * Gets DataSecurity_EO entity object.
     * @return the DataSecurity_EO
     */
    public EntityImpl getDataSecurity_EO() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for DSEQ_ID using the alias name DseqId.
     * @return the DSEQ_ID
     */
    public Number getDseqId() {
        return (Number)getAttributeInternal(DSEQID);
    }

    /**
     * Sets <code>value</code> as attribute value for DSEQ_ID using the alias name DseqId.
     * @param value value to set the DSEQ_ID
     */
    public void setDseqId(Number value) {
        setAttributeInternal(DSEQID, value);
    }

    /**
     * Gets the attribute value for SEQ_NUMBER using the alias name SeqNumber.
     * @return the SEQ_NUMBER
     */
    public Number getSeqNumber() {
        return (Number)getAttributeInternal(SEQNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for SEQ_NUMBER using the alias name SeqNumber.
     * @param value value to set the SEQ_NUMBER
     */
    public void setSeqNumber(Number value) {
        setAttributeInternal(SEQNUMBER, value);
    }

    /**
     * Gets the attribute value for SEGMENT_COLUMN using the alias name SegmentColumn.
     * @return the SEGMENT_COLUMN
     */
    public String getSegmentColumn() {
        return (String)getAttributeInternal(SEGMENTCOLUMN);
    }

    /**
     * Sets <code>value</code> as attribute value for SEGMENT_COLUMN using the alias name SegmentColumn.
     * @param value value to set the SEGMENT_COLUMN
     */
    public void setSegmentColumn(String value) {
        setAttributeInternal(SEGMENTCOLUMN, value);
    }

    /**
     * Gets the attribute value for COLUMN_NAME using the alias name ColumnName.
     * @return the COLUMN_NAME
     */
    public String getColumnName() {
        return (String)getAttributeInternal(COLUMNNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for COLUMN_NAME using the alias name ColumnName.
     * @param value value to set the COLUMN_NAME
     */
    public void setColumnName(String value) {
        setAttributeInternal(COLUMNNAME, value);
    }

    /**
     * Gets the attribute value for SRC_TABLE using the alias name SrcTable.
     * @return the SRC_TABLE
     */
    public String getSrcTable() {
        return (String)getAttributeInternal(SRCTABLE);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_TABLE using the alias name SrcTable.
     * @param value value to set the SRC_TABLE
     */
    public void setSrcTable(String value) {
        setAttributeInternal(SRCTABLE, value);
    }

    /**
     * Gets the attribute value for SRC_COLUMN using the alias name SrcColumn.
     * @return the SRC_COLUMN
     */
    public String getSrcColumn() {
        return (String)getAttributeInternal(SRCCOLUMN);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_COLUMN using the alias name SrcColumn.
     * @param value value to set the SRC_COLUMN
     */
    public void setSrcColumn(String value) {
        setAttributeInternal(SRCCOLUMN, value);
    }

    /**
     * Gets the attribute value for SRC_DISP_COLUMN using the alias name SrcDispColumn.
     * @return the SRC_DISP_COLUMN
     */
    public String getSrcDispColumn() {
        return (String)getAttributeInternal(SRCDISPCOLUMN);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_DISP_COLUMN using the alias name SrcDispColumn.
     * @param value value to set the SRC_DISP_COLUMN
     */
    public void setSrcDispColumn(String value) {
        setAttributeInternal(SRCDISPCOLUMN, value);
    }

    /**
     * Gets the attribute value for SRC_LOOKUP_TYPE using the alias name SrcLookupType.
     * @return the SRC_LOOKUP_TYPE
     */
    public String getSrcLookupType() {
        return (String)getAttributeInternal(SRCLOOKUPTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for SRC_LOOKUP_TYPE using the alias name SrcLookupType.
     * @param value value to set the SRC_LOOKUP_TYPE
     */
    public void setSrcLookupType(String value) {
        setAttributeInternal(SRCLOOKUPTYPE, value);
    }

    /**
     * Gets the attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @return the ACTIVE_YN
     */
    public String getActiveYn() {
        return (String)getAttributeInternal(ACTIVEYN);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @param value value to set the ACTIVE_YN
     */
    public void setActiveYn(String value) {
        setAttributeInternal(ACTIVEYN, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public String getLastUpdateLogin() {
        return (String)getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @param value value to set the LAST_UPDATE_LOGIN
     */
    public void setLastUpdateLogin(String value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Trans_Active.
     * @return the Trans_Active
     */
    public Boolean getTrans_Active() {
        Boolean flag = false;
        if (this.getActiveYn() != null && this.getActiveYn().equals("Y")) {
            flag = true;
            //             System.err.println("flag"  + flag);
        } else {
            flag = false;
            //             System.err.println("flag"  + flag);
        }
        return flag;
        //          return (Boolean) getAttributeInternal(TRANS_ACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_Active.
     * @param value value to set the  Trans_Active
     */
    public void setTrans_Active(Boolean value) {
        if (value) {
            setActiveYn("Y");
        } else {
            setActiveYn("N");
        }
        setAttributeInternal(TRANS_ACTIVE, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DataSecurityTable_ROVO1.
     */
    public RowSet getDataSecurityTable_ROVO1() {
        return (RowSet)getAttributeInternal(DATASECURITYTABLE_ROVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DataSecurityColumn_ROVO1.
     */
    public RowSet getDataSecurityColumn_ROVO1() {
        return (RowSet)getAttributeInternal(DATASECURITYCOLUMN_ROVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ChecklistLookup_ROVO1.
     */
    public RowSet getChecklistLookup_ROVO1() {
        return (RowSet)getAttributeInternal(CHECKLISTLOOKUP_ROVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DataSecuritySegment_STATVO1.
     */
    public RowSet getDataSecuritySegment_STATVO1() {
        return (RowSet)getAttributeInternal(DATASECURITYSEGMENT_STATVO1);
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
