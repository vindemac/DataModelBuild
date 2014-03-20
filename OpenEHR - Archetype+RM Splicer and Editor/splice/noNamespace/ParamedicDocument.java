/*
 * An XML document type.
 * Localname: paramedic
 * Namespace: 
 * Java type: noNamespace.ParamedicDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one paramedic(@) element.
 *
 * This is a complex type.
 */
public interface ParamedicDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParamedicDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6A040CB5F0A1C1FE9E0252F3914899E").resolveHandle("paramedice7addoctype");
    
    /**
     * Gets the "paramedic" element
     */
    noNamespace.ParamedicDocument.Paramedic getParamedic();
    
    /**
     * Sets the "paramedic" element
     */
    void setParamedic(noNamespace.ParamedicDocument.Paramedic paramedic);
    
    /**
     * Appends and returns a new empty "paramedic" element
     */
    noNamespace.ParamedicDocument.Paramedic addNewParamedic();
    
    /**
     * An XML paramedic(@).
     *
     * This is a complex type.
     */
    public interface Paramedic extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Paramedic.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6A040CB5F0A1C1FE9E0252F3914899E").resolveHandle("paramedicfb2felemtype");
        
        /**
         * Gets array of all "property" elements
         */
        noNamespace.ParamedicDocument.Paramedic.Property[] getPropertyArray();
        
        /**
         * Gets ith "property" element
         */
        noNamespace.ParamedicDocument.Paramedic.Property getPropertyArray(int i);
        
        /**
         * Returns number of "property" element
         */
        int sizeOfPropertyArray();
        
        /**
         * Sets array of all "property" element
         */
        void setPropertyArray(noNamespace.ParamedicDocument.Paramedic.Property[] propertyArray);
        
        /**
         * Sets ith "property" element
         */
        void setPropertyArray(int i, noNamespace.ParamedicDocument.Paramedic.Property property);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "property" element
         */
        noNamespace.ParamedicDocument.Paramedic.Property insertNewProperty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "property" element
         */
        noNamespace.ParamedicDocument.Paramedic.Property addNewProperty();
        
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Property.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6A040CB5F0A1C1FE9E0252F3914899E").resolveHandle("property0890elemtype");
            
            /**
             * Gets array of all "ehrReferences" elements
             */
            noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences[] getEhrReferencesArray();
            
            /**
             * Gets ith "ehrReferences" element
             */
            noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences getEhrReferencesArray(int i);
            
            /**
             * Returns number of "ehrReferences" element
             */
            int sizeOfEhrReferencesArray();
            
            /**
             * Sets array of all "ehrReferences" element
             */
            void setEhrReferencesArray(noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences[] ehrReferencesArray);
            
            /**
             * Sets ith "ehrReferences" element
             */
            void setEhrReferencesArray(int i, noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences ehrReferences);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ehrReferences" element
             */
            noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences insertNewEhrReferences(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ehrReferences" element
             */
            noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences addNewEhrReferences();
            
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
             * This is an atomic type that is a restriction of noNamespace.ParamedicDocument$Paramedic$Property$EhrReferences.
             */
            public interface EhrReferences extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EhrReferences.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6A040CB5F0A1C1FE9E0252F3914899E").resolveHandle("ehrreferencesf51delemtype");
                
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
                    public static noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences newInstance() {
                      return (noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ParamedicDocument.Paramedic.Property.EhrReferences) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ParamedicDocument.Paramedic.Property newInstance() {
                  return (noNamespace.ParamedicDocument.Paramedic.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ParamedicDocument.Paramedic.Property newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ParamedicDocument.Paramedic.Property) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ParamedicDocument.Paramedic newInstance() {
              return (noNamespace.ParamedicDocument.Paramedic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ParamedicDocument.Paramedic newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ParamedicDocument.Paramedic) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ParamedicDocument newInstance() {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ParamedicDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ParamedicDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ParamedicDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ParamedicDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ParamedicDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ParamedicDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ParamedicDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ParamedicDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ParamedicDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ParamedicDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ParamedicDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ParamedicDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ParamedicDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ParamedicDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ParamedicDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ParamedicDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ParamedicDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ParamedicDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
