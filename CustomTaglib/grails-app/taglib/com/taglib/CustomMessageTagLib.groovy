package com.taglib
import java.text.MessageFormat

import org.springframework.web.servlet.support.RequestContextUtils as RCU
import org.grails.plugins.web.taglib.ValidationTagLib
import org.grails.encoder.Encoder

class CustomMessageTagLib extends ValidationTagLib 
{
	static namespace = "g"
	
	Closure message = { attrs ->

		println "entering CustomMessageTagLib"
		// put custom code here if we want to override the <g:message> tag		
		ValidationTagLib validationTagLib = grailsAttributes.applicationContext.getBean('org.grails.plugins.web.taglib.ValidationTagLib')
		def defaultMessage = "Resolved from CustomMessageTagLib"

		return defaultMessage
	}
}