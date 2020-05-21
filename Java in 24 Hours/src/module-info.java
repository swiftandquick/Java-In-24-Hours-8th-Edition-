module Java24 {
	
	requires java.desktop;
	
	/** Because the incubated API has been removed.  
	 * So, I have to use java.net.http.  */
	// requires java.incubator.httpclient;
	requires java.net.http;

}