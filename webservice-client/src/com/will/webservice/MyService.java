

/**
 * MyService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.will.webservice;

    /*
     *  MyService java interface
     */

    public interface MyService {
          

        /**
          * Auto generated method signature
          * 
                    * @param sayHello0
                
         */

         
                     public com.will.webservice.SayHelloResponse sayHello(

                        com.will.webservice.SayHello sayHello0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sayHello0
            
          */
        public void startsayHello(

            com.will.webservice.SayHello sayHello0,

            final com.will.webservice.MyServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param add2
                
         */

         
                     public com.will.webservice.AddResponse add(

                        com.will.webservice.Add add2)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param add2
            
          */
        public void startadd(

            com.will.webservice.Add add2,

            final com.will.webservice.MyServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    