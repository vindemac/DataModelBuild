/*
 * An XML document type.
 * Localname: TeleconsultationMM
 * Namespace: 
 * Java type: noNamespace.TeleconsultationMMDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one TeleconsultationMM(@) element.
 *
 * This is a complex type.
 */
public interface TeleconsultationMMDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TeleconsultationMMDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F2F1A7EA107010BC6057DC8CCEAB10B").resolveHandle("teleconsultationmme86cdoctype");
    
    /**
     * Gets the "TeleconsultationMM" element
     */
    noNamespace.TeleconsultationMMDocument.TeleconsultationMM getTeleconsultationMM();
    
    /**
     * Sets the "TeleconsultationMM" element
     */
    void setTeleconsultationMM(noNamespace.TeleconsultationMMDocument.TeleconsultationMM teleconsultationMM);
    
    /**
     * Appends and returns a new empty "TeleconsultationMM" element
     */
    noNamespace.TeleconsultationMMDocument.TeleconsultationMM addNewTeleconsultationMM();
    
    /**
     * An XML TeleconsultationMM(@).
     *
     * This is a complex type.
     */
    public interface TeleconsultationMM extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TeleconsultationMM.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F2F1A7EA107010BC6057DC8CCEAB10B").resolveHandle("teleconsultationmm810delemtype");
        
        /**
         * Gets the "paramedic" element
         */
        noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic getParamedic();
        
        /**
         * Sets the "paramedic" element
         */
        void setParamedic(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic paramedic);
        
        /**
         * Appends and returns a new empty "paramedic" element
         */
        noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic addNewParamedic();
        
        /**
         * Gets array of all "specialist" elements
         */
        noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist[] getSpecialistArray();
        
        /**
         * Gets ith "specialist" element
         */
        noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist getSpecialistArray(int i);
        
        /**
         * Returns number of "specialist" element
         */
        int sizeOfSpecialistArray();
        
        /**
         * Sets array of all "specialist" element
         */
        void setSpecialistArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist[] specialistArray);
        
        /**
         * Sets ith "specialist" element
         */
        void setSpecialistArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist specialist);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "specialist" element
         */
        noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist insertNewSpecialist(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "specialist" element
         */
        noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist addNewSpecialist();
        
        /**
         * Removes the ith "specialist" element
         */
        void removeSpecialist(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * An XML paramedic(@).
         *
         * This is a complex type.
         */
        public interface Paramedic extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Paramedic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F2F1A7EA107010BC6057DC8CCEAB10B").resolveHandle("paramedic050felemtype");
            
            /**
             * Gets array of all "property" elements
             */
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property[] getPropertyArray();
            
            /**
             * Gets ith "property" element
             */
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property getPropertyArray(int i);
            
            /**
             * Returns number of "property" element
             */
            int sizeOfPropertyArray();
            
            /**
             * Sets array of all "property" element
             */
            void setPropertyArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property[] propertyArray);
            
            /**
             * Sets ith "property" element
             */
            void setPropertyArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property property);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "property" element
             */
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property insertNewProperty(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "property" element
             */
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property addNewProperty();
            
            /**
             * Removes the ith "property" element
             */
            void removeProperty(int i);
            
            /**
             * Gets the "name" attribute
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" attribute
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * True if has "name" attribute
             */
            boolean isSetName();
            
            /**
             * Sets the "name" attribute
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" attribute
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Unsets the "name" attribute
             */
            void unsetName();
            
            /**
             * An XML property(@).
             *
             * This is a complex type.
             */
            public interface Property extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Property.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F2F1A7EA107010BC6057DC8CCEAB10B").resolveHandle("property32b0elemtype");
                
                /**
                 * Gets array of all "ehrReferences" elements
                 */
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences[] getEhrReferencesArray();
                
                /**
                 * Gets ith "ehrReferences" element
                 */
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences getEhrReferencesArray(int i);
                
                /**
                 * Returns number of "ehrReferences" element
                 */
                int sizeOfEhrReferencesArray();
                
                /**
                 * Sets array of all "ehrReferences" element
                 */
                void setEhrReferencesArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences[] ehrReferencesArray);
                
                /**
                 * Sets ith "ehrReferences" element
                 */
                void setEhrReferencesArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences ehrReferences);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "ehrReferences" element
                 */
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences insertNewEhrReferences(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "ehrReferences" element
                 */
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences addNewEhrReferences();
                
                /**
                 * Removes the ith "ehrReferences" element
                 */
                void removeEhrReferences(int i);
                
                /**
                 * Gets the "type" attribute
                 */
                java.lang.String getType();
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                org.apache.xmlbeans.XmlString xgetType();
                
                /**
                 * Sets the "type" attribute
                 */
                void setType(java.lang.String type);
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                void xsetType(org.apache.xmlbeans.XmlString type);
                
                /**
                 * Gets the "screen" attribute
                 */
                java.lang.String getScreen();
                
                /**
                 * Gets (as xml) the "screen" attribute
                 */
                org.apache.xmlbeans.XmlString xgetScreen();
                
                /**
                 * Sets the "screen" attribute
                 */
                void setScreen(java.lang.String screen);
                
                /**
                 * Sets (as xml) the "screen" attribute
                 */
                void xsetScreen(org.apache.xmlbeans.XmlString screen);
                
                /**
                 * Gets the "name" attribute
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetName();
                
                /**
                 * Sets the "name" attribute
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                void xsetName(org.apache.xmlbeans.XmlString name);
                
                /**
                 * An XML ehrReferences(@).
                 *
                 * This is an atomic type that is a restriction of noNamespace.TeleconsultationMMDocument$TeleconsultationMM$Paramedic$Property$EhrReferences.
                 */
                public interface EhrReferences extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EhrReferences.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F2F1A7EA107010BC6057DC8CCEAB10B").resolveHandle("ehrreferences6a7delemtype");
                    
                    /**
                     * Gets the "id" attribute
                     */
                    java.lang.String getId();
                    
                    /**
                     * Gets (as xml) the "id" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetId();
                    
                    /**
                     * True if has "id" attribute
                     */
                    boolean isSetId();
                    
                    /**
                     * Sets the "id" attribute
                     */
                    void setId(java.lang.String id);
                    
                    /**
                     * Sets (as xml) the "id" attribute
                     */
                    void xsetId(org.apache.xmlbeans.XmlString id);
                    
                    /**
                     * Unsets the "id" attribute
                     */
                    void unsetId();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences newInstance() {
                        return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property.EhrReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property newInstance() {
                      return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic newInstance() {
                  return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Paramedic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML specialist(@).
         *
         * This is a complex type.
         */
        public interface Specialist extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Specialist.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F2F1A7EA107010BC6057DC8CCEAB10B").resolveHandle("specialistf68aelemtype");
            
            /**
             * Gets array of all "property" elements
             */
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property[] getPropertyArray();
            
            /**
             * Gets ith "property" element
             */
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property getPropertyArray(int i);
            
            /**
             * Returns number of "property" element
             */
            int sizeOfPropertyArray();
            
            /**
             * Sets array of all "property" element
             */
            void setPropertyArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property[] propertyArray);
            
            /**
             * Sets ith "property" element
             */
            void setPropertyArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property property);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "property" element
             */
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property insertNewProperty(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "property" element
             */
            noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property addNewProperty();
            
            /**
             * Removes the ith "property" element
             */
            void removeProperty(int i);
            
            /**
             * Gets the "name" attribute
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" attribute
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * True if has "name" attribute
             */
            boolean isSetName();
            
            /**
             * Sets the "name" attribute
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" attribute
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Unsets the "name" attribute
             */
            void unsetName();
            
            /**
             * An XML property(@).
             *
             * This is a complex type.
             */
            public interface Property extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Property.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F2F1A7EA107010BC6057DC8CCEAB10B").resolveHandle("property7d09elemtype");
                
                /**
                 * Gets array of all "ehrReferences" elements
                 */
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences[] getEhrReferencesArray();
                
                /**
                 * Gets ith "ehrReferences" element
                 */
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences getEhrReferencesArray(int i);
                
                /**
                 * Returns number of "ehrReferences" element
                 */
                int sizeOfEhrReferencesArray();
                
                /**
                 * Sets array of all "ehrReferences" element
                 */
                void setEhrReferencesArray(noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences[] ehrReferencesArray);
                
                /**
                 * Sets ith "ehrReferences" element
                 */
                void setEhrReferencesArray(int i, noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences ehrReferences);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "ehrReferences" element
                 */
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences insertNewEhrReferences(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "ehrReferences" element
                 */
                noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences addNewEhrReferences();
                
                /**
                 * Removes the ith "ehrReferences" element
                 */
                void removeEhrReferences(int i);
                
                /**
                 * Gets the "type" attribute
                 */
                java.lang.String getType();
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                org.apache.xmlbeans.XmlString xgetType();
                
                /**
                 * Sets the "type" attribute
                 */
                void setType(java.lang.String type);
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                void xsetType(org.apache.xmlbeans.XmlString type);
                
                /**
                 * Gets the "screen" attribute
                 */
                java.lang.String getScreen();
                
                /**
                 * Gets (as xml) the "screen" attribute
                 */
                org.apache.xmlbeans.XmlString xgetScreen();
                
                /**
                 * Sets the "screen" attribute
                 */
                void setScreen(java.lang.String screen);
                
                /**
                 * Sets (as xml) the "screen" attribute
                 */
                void xsetScreen(org.apache.xmlbeans.XmlString screen);
                
                /**
                 * Gets the "name" attribute
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "name" attribute
                 */
                org.apache.xmlbeans.XmlString xgetName();
                
                /**
                 * Sets the "name" attribute
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "name" attribute
                 */
                void xsetName(org.apache.xmlbeans.XmlString name);
                
                /**
                 * An XML ehrReferences(@).
                 *
                 * This is an atomic type that is a restriction of noNamespace.TeleconsultationMMDocument$TeleconsultationMM$Specialist$Property$EhrReferences.
                 */
                public interface EhrReferences extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EhrReferences.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1F2F1A7EA107010BC6057DC8CCEAB10B").resolveHandle("ehrreferences3edcelemtype");
                    
                    /**
                     * Gets the "id" attribute
                     */
                    java.lang.String getId();
                    
                    /**
                     * Gets (as xml) the "id" attribute
                     */
                    org.apache.xmlbeans.XmlString xgetId();
                    
                    /**
                     * True if has "id" attribute
                     */
                    boolean isSetId();
                    
                    /**
                     * Sets the "id" attribute
                     */
                    void setId(java.lang.String id);
                    
                    /**
                     * Sets (as xml) the "id" attribute
                     */
                    void xsetId(org.apache.xmlbeans.XmlString id);
                    
                    /**
                     * Unsets the "id" attribute
                     */
                    void unsetId();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences newInstance() {
                        return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property.EhrReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property newInstance() {
                      return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist newInstance() {
                  return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM.Specialist) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM newInstance() {
              return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.TeleconsultationMMDocument.TeleconsultationMM newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.TeleconsultationMMDocument.TeleconsultationMM) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.TeleconsultationMMDocument newInstance() {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.TeleconsultationMMDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.TeleconsultationMMDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.TeleconsultationMMDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.TeleconsultationMMDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TeleconsultationMMDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.TeleconsultationMMDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.TeleconsultationMMDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
