/*
 * An XML document type.
 * Localname: TeleconsultationMM
 * Namespace: 
 * Java type: noNamespace.TeleconsultationMMDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one TeleconsultationMM(@) element.
 *
 * This is a complex type.
 */
public class TeleconsultationMMDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TeleconsultationMMDocument
{
    private static final long serialVersionUID = 1L;
    
    public TeleconsultationMMDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELECONSULTATIONMM$0 = 
        new javax.xml.namespace.QName("", "TeleconsultationMM");
    
    
    /**
     * Gets the "TeleconsultationMM" element
     */
    public noNamespace.TeleconsultationMMDocument.TeleconsultationMM getTeleconsultationMM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM target = null;
            target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM)get_store().find_element_user(TELECONSULTATIONMM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TeleconsultationMM" element
     */
    public void setTeleconsultationMM(noNamespace.TeleconsultationMMDocument.TeleconsultationMM teleconsultationMM)
    {
        generatedSetterHelperImpl(teleconsultationMM, TELECONSULTATIONMM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TeleconsultationMM" element
     */
    public noNamespace.TeleconsultationMMDocument.TeleconsultationMM addNewTeleconsultationMM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM target = null;
            target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM)get_store().add_element_user(TELECONSULTATIONMM$0);
            return target;
        }
    }
    /**
     * An XML TeleconsultationMM(@).
     *
     * This is a complex type.
     */
    public static class TeleconsultationMMImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TeleconsultationMMDocument.TeleconsultationMM
    {
        private static final long serialVersionUID = 1L;
        
        public TeleconsultationMMImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAMEDIC$0 = 
            new javax.xml.namespace.QName("", "paramedic");
        private static final javax.xml.namespace.QName SPECIALIST$2 = 
            new javax.xml.namespace.QName("", "specialist");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "paramedic" element
         */
        public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic getParamedic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic target = null;
                target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic)get_store().find_element_user(PARAMEDIC$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "paramedic" element
         */
        public void setParamedic(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic paramedic)
        {
            generatedSetterHelperImpl(paramedic, PARAMEDIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "paramedic" element
         */
        public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic addNewParamedic()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic target = null;
                target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic)get_store().add_element_user(PARAMEDIC$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "specialist" elements
         */
        public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist[] getSpecialistArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SPECIALIST$2, targetList);
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist[] result = new noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "specialist" element
         */
        public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist getSpecialistArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist target = null;
                target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist)get_store().find_element_user(SPECIALIST$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "specialist" element
         */
        public int sizeOfSpecialistArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SPECIALIST$2);
            }
        }
        
        /**
         * Sets array of all "specialist" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSpecialistArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist[] specialistArray)
        {
            check_orphaned();
            arraySetterHelper(specialistArray, SPECIALIST$2);
        }
        
        /**
         * Sets ith "specialist" element
         */
        public void setSpecialistArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist specialist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist target = null;
                target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist)get_store().find_element_user(SPECIALIST$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(specialist);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "specialist" element
         */
        public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist insertNewSpecialist(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist target = null;
                target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist)get_store().insert_element_user(SPECIALIST$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "specialist" element
         */
        public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist addNewSpecialist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist target = null;
                target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist)get_store().add_element_user(SPECIALIST$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "specialist" element
         */
        public void removeSpecialist(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SPECIALIST$2, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$4) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$4);
            }
        }
        /**
         * An XML paramedic(@).
         *
         * This is a complex type.
         */
        public static class ParamedicImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic
        {
            private static final long serialVersionUID = 1L;
            
            public ParamedicImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PROPERTY$0 = 
                new javax.xml.namespace.QName("", "property");
            private static final javax.xml.namespace.QName NAME$2 = 
                new javax.xml.namespace.QName("", "name");
            
            
            /**
             * Gets array of all "property" elements
             */
            public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property[] getPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PROPERTY$0, targetList);
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property[] result = new noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "property" element
             */
            public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property getPropertyArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property target = null;
                    target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property)get_store().find_element_user(PROPERTY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "property" element
             */
            public int sizeOfPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROPERTY$0);
                }
            }
            
            /**
             * Sets array of all "property" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setPropertyArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property[] propertyArray)
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
            
            /**
             * Sets ith "property" element
             */
            public void setPropertyArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property property)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property target = null;
                    target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property)get_store().find_element_user(PROPERTY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(property);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "property" element
             */
            public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property insertNewProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property target = null;
                    target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property)get_store().insert_element_user(PROPERTY$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "property" element
             */
            public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property addNewProperty()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property target = null;
                    target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property)get_store().add_element_user(PROPERTY$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "property" element
             */
            public void removeProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROPERTY$0, i);
                }
            }
            
            /**
             * Gets the "name" attribute
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" attribute
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                    return target;
                }
            }
            
            /**
             * True if has "name" attribute
             */
            public boolean isSetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(NAME$2) != null;
                }
            }
            
            /**
             * Sets the "name" attribute
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" attribute
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Unsets the "name" attribute
             */
            public void unsetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(NAME$2);
                }
            }
            /**
             * An XML property(@).
             *
             * This is a complex type.
             */
            public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property
            {
                private static final long serialVersionUID = 1L;
                
                public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName EHRREFERENCES$0 = 
                    new javax.xml.namespace.QName("", "ehrReferences");
                private static final javax.xml.namespace.QName TYPE$2 = 
                    new javax.xml.namespace.QName("", "type");
                private static final javax.xml.namespace.QName SCREEN$4 = 
                    new javax.xml.namespace.QName("", "screen");
                private static final javax.xml.namespace.QName NAME$6 = 
                    new javax.xml.namespace.QName("", "name");
                
                
                /**
                 * Gets array of all "ehrReferences" elements
                 */
                public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences[] getEhrReferencesArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(EHRREFERENCES$0, targetList);
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences[] result = new noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "ehrReferences" element
                 */
                public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences getEhrReferencesArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences target = null;
                      target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences)get_store().find_element_user(EHRREFERENCES$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "ehrReferences" element
                 */
                public int sizeOfEhrReferencesArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EHRREFERENCES$0);
                    }
                }
                
                /**
                 * Sets array of all "ehrReferences" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setEhrReferencesArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences[] ehrReferencesArray)
                {
                    check_orphaned();
                    arraySetterHelper(ehrReferencesArray, EHRREFERENCES$0);
                }
                
                /**
                 * Sets ith "ehrReferences" element
                 */
                public void setEhrReferencesArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences ehrReferences)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences target = null;
                      target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences)get_store().find_element_user(EHRREFERENCES$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(ehrReferences);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "ehrReferences" element
                 */
                public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences insertNewEhrReferences(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences target = null;
                      target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences)get_store().insert_element_user(EHRREFERENCES$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "ehrReferences" element
                 */
                public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences addNewEhrReferences()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences target = null;
                      target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences)get_store().add_element_user(EHRREFERENCES$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "ehrReferences" element
                 */
                public void removeEhrReferences(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EHRREFERENCES$0, i);
                    }
                }
                
                /**
                 * Gets the "type" attribute
                 */
                public java.lang.String getType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "type" attribute
                 */
                public void setType(java.lang.String type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                      }
                      target.setStringValue(type);
                    }
                }
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                public void xsetType(org.apache.xmlbeans.XmlString type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
                      }
                      target.set(type);
                    }
                }
                
                /**
                 * Gets the "screen" attribute
                 */
                public java.lang.String getScreen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCREEN$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "screen" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetScreen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCREEN$4);
                      return target;
                    }
                }
                
                /**
                 * Sets the "screen" attribute
                 */
                public void setScreen(java.lang.String screen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCREEN$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCREEN$4);
                      }
                      target.setStringValue(screen);
                    }
                }
                
                /**
                 * Sets (as xml) the "screen" attribute
                 */
                public void xsetScreen(org.apache.xmlbeans.XmlString screen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCREEN$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCREEN$4);
                      }
                      target.set(screen);
                    }
                }
                
                /**
                 * Gets the "name" attribute
                 */
                public java.lang.String getName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                      return target;
                    }
                }
                
                /**
                 * Sets the "name" attribute
                 */
                public void setName(java.lang.String name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
                      }
                      target.setStringValue(name);
                    }
                }
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                public void xsetName(org.apache.xmlbeans.XmlString name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
                      }
                      target.set(name);
                    }
                }
                /**
                 * An XML ehrReferences(@).
                 *
                 * This is an atomic type that is a restriction of noNamespace.TeleconsultationMMDocument$TeleconsultationMM$Paramedic$Property$EhrReferences.
                 */
                public static class EhrReferencesImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences
                {
                    private static final long serialVersionUID = 1L;
                    
                    public EhrReferencesImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected EhrReferencesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName ID$0 = 
                      new javax.xml.namespace.QName("", "id");
                    
                    
                    /**
                     * Gets the "id" attribute
                     */
                    public java.lang.String getId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "id" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "id" attribute
                     */
                    public boolean isSetId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(ID$0) != null;
                      }
                    }
                    
                    /**
                     * Sets the "id" attribute
                     */
                    public void setId(java.lang.String id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
                        }
                        target.setStringValue(id);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "id" attribute
                     */
                    public void xsetId(org.apache.xmlbeans.XmlString id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$0);
                        }
                        target.set(id);
                      }
                    }
                    
                    /**
                     * Unsets the "id" attribute
                     */
                    public void unsetId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(ID$0);
                      }
                    }
                }
            }
        }
        /**
         * An XML specialist(@).
         *
         * This is a complex type.
         */
        public static class SpecialistImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist
        {
            private static final long serialVersionUID = 1L;
            
            public SpecialistImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PROPERTY$0 = 
                new javax.xml.namespace.QName("", "property");
            private static final javax.xml.namespace.QName NAME$2 = 
                new javax.xml.namespace.QName("", "name");
            
            
            /**
             * Gets array of all "property" elements
             */
            public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property[] getPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PROPERTY$0, targetList);
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property[] result = new noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "property" element
             */
            public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property getPropertyArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property target = null;
                    target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property)get_store().find_element_user(PROPERTY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "property" element
             */
            public int sizeOfPropertyArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROPERTY$0);
                }
            }
            
            /**
             * Sets array of all "property" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setPropertyArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property[] propertyArray)
            {
                check_orphaned();
                arraySetterHelper(propertyArray, PROPERTY$0);
            }
            
            /**
             * Sets ith "property" element
             */
            public void setPropertyArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property property)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property target = null;
                    target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property)get_store().find_element_user(PROPERTY$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(property);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "property" element
             */
            public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property insertNewProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property target = null;
                    target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property)get_store().insert_element_user(PROPERTY$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "property" element
             */
            public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property addNewProperty()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property target = null;
                    target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property)get_store().add_element_user(PROPERTY$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "property" element
             */
            public void removeProperty(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROPERTY$0, i);
                }
            }
            
            /**
             * Gets the "name" attribute
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" attribute
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                    return target;
                }
            }
            
            /**
             * True if has "name" attribute
             */
            public boolean isSetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(NAME$2) != null;
                }
            }
            
            /**
             * Sets the "name" attribute
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" attribute
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Unsets the "name" attribute
             */
            public void unsetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(NAME$2);
                }
            }
            /**
             * An XML property(@).
             *
             * This is a complex type.
             */
            public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property
            {
                private static final long serialVersionUID = 1L;
                
                public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName EHRREFERENCES$0 = 
                    new javax.xml.namespace.QName("", "ehrReferences");
                private static final javax.xml.namespace.QName TYPE$2 = 
                    new javax.xml.namespace.QName("", "type");
                private static final javax.xml.namespace.QName SCREEN$4 = 
                    new javax.xml.namespace.QName("", "screen");
                private static final javax.xml.namespace.QName NAME$6 = 
                    new javax.xml.namespace.QName("", "name");
                
                
                /**
                 * Gets array of all "ehrReferences" elements
                 */
                public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences[] getEhrReferencesArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(EHRREFERENCES$0, targetList);
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences[] result = new noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "ehrReferences" element
                 */
                public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences getEhrReferencesArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences target = null;
                      target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences)get_store().find_element_user(EHRREFERENCES$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "ehrReferences" element
                 */
                public int sizeOfEhrReferencesArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EHRREFERENCES$0);
                    }
                }
                
                /**
                 * Sets array of all "ehrReferences" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setEhrReferencesArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences[] ehrReferencesArray)
                {
                    check_orphaned();
                    arraySetterHelper(ehrReferencesArray, EHRREFERENCES$0);
                }
                
                /**
                 * Sets ith "ehrReferences" element
                 */
                public void setEhrReferencesArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences ehrReferences)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences target = null;
                      target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences)get_store().find_element_user(EHRREFERENCES$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(ehrReferences);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "ehrReferences" element
                 */
                public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences insertNewEhrReferences(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences target = null;
                      target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences)get_store().insert_element_user(EHRREFERENCES$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "ehrReferences" element
                 */
                public noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences addNewEhrReferences()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences target = null;
                      target = (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences)get_store().add_element_user(EHRREFERENCES$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "ehrReferences" element
                 */
                public void removeEhrReferences(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EHRREFERENCES$0, i);
                    }
                }
                
                /**
                 * Gets the "type" attribute
                 */
                public java.lang.String getType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                      return target;
                    }
                }
                
                /**
                 * Sets the "type" attribute
                 */
                public void setType(java.lang.String type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
                      }
                      target.setStringValue(type);
                    }
                }
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                public void xsetType(org.apache.xmlbeans.XmlString type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
                      }
                      target.set(type);
                    }
                }
                
                /**
                 * Gets the "screen" attribute
                 */
                public java.lang.String getScreen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCREEN$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "screen" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetScreen()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCREEN$4);
                      return target;
                    }
                }
                
                /**
                 * Sets the "screen" attribute
                 */
                public void setScreen(java.lang.String screen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCREEN$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCREEN$4);
                      }
                      target.setStringValue(screen);
                    }
                }
                
                /**
                 * Sets (as xml) the "screen" attribute
                 */
                public void xsetScreen(org.apache.xmlbeans.XmlString screen)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCREEN$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCREEN$4);
                      }
                      target.set(screen);
                    }
                }
                
                /**
                 * Gets the "name" attribute
                 */
                public java.lang.String getName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                public org.apache.xmlbeans.XmlString xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                      return target;
                    }
                }
                
                /**
                 * Sets the "name" attribute
                 */
                public void setName(java.lang.String name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
                      }
                      target.setStringValue(name);
                    }
                }
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                public void xsetName(org.apache.xmlbeans.XmlString name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
                      }
                      target.set(name);
                    }
                }
                /**
                 * An XML ehrReferences(@).
                 *
                 * This is an atomic type that is a restriction of noNamespace.TeleconsultationMMDocument$TeleconsultationMM$Specialist$Property$EhrReferences.
                 */
                public static class EhrReferencesImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences
                {
                    private static final long serialVersionUID = 1L;
                    
                    public EhrReferencesImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected EhrReferencesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    private static final javax.xml.namespace.QName ID$0 = 
                      new javax.xml.namespace.QName("", "id");
                    
                    
                    /**
                     * Gets the "id" attribute
                     */
                    public java.lang.String getId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "id" attribute
                     */
                    public org.apache.xmlbeans.XmlString xgetId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "id" attribute
                     */
                    public boolean isSetId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().find_attribute_user(ID$0) != null;
                      }
                    }
                    
                    /**
                     * Sets the "id" attribute
                     */
                    public void setId(java.lang.String id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
                        }
                        target.setStringValue(id);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "id" attribute
                     */
                    public void xsetId(org.apache.xmlbeans.XmlString id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$0);
                        }
                        target.set(id);
                      }
                    }
                    
                    /**
                     * Unsets the "id" attribute
                     */
                    public void unsetId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_attribute(ID$0);
                      }
                    }
                }
            }
        }
    }
}
