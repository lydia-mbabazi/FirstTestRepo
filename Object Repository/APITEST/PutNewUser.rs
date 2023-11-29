<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PutNewUser</name>
   <tag></tag>
   <elementGuidId>736fc4cc-46f8-416d-9bf6-8624273ee2e8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;name\&quot;: \&quot;Kurtis Robert\&quot;,\n  \&quot;username\&quot;: \&quot;Elwyn.Skiles\&quot;,\n  \&quot;email\&quot;: \&quot;Telly.Hoeger@billy.biz\&quot;,\n  \&quot;address\&quot;: {\n    \&quot;street\&quot;: \&quot;Rex Trail\&quot;,\n    \&quot;suite\&quot;: \&quot;Suite 280\&quot;,\n    \&quot;city\&quot;: \&quot;Howemouth\&quot;,\n    \&quot;zipcode\&quot;: \&quot;58804-1099\&quot;,\n    \&quot;geo\&quot;: {\n      \&quot;lat\&quot;: \&quot;24.8918\&quot;,\n      \&quot;lng\&quot;: \&quot;21.8984\&quot;\n    }\n  },\n  \&quot;phone\&quot;: \&quot;210.067.6132\&quot;,\n  \&quot;website\&quot;: \&quot;elvis.io\&quot;,\n  \&quot;company\&quot;: {\n    \&quot;name\&quot;: \&quot;Johns Group\&quot;,\n    \&quot;catchPhrase\&quot;: \&quot;Configurable multimedia task-force\&quot;,\n    \&quot;bs\&quot;: \&quot;generate enterprise e-tailers\&quot;\n  }\n}\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>f2291cd7-f050-410d-ac5c-0d740ace49bd</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.0.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://reqres.in/api/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
