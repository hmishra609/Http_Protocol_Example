# HTTP Protocol

## We are opening a TCP connection and here is an Raw HTTP request can look like the below but since we can write it directly so using echo now start the Webserver and run the command you will get to the response:

`netcat localhost 8080
get /greeting http/1.1
Host: localhost`


`echo -e "GET /greeting HTTP/1.1\r\nHost: localhost\r\n\r\n" | nc localhost 8080`



The first word is the HTTP verb: "GET". There are other verbs for other actions on the web, like submitting form data ("POST").

The next part specifies the path: "/greeting". The host computer stores the content of the entire website, so the browser needs to be specific about which page to load.

The final part of the first line specifies the protocol and the version of the protocol: "HTTP/1.1".

The second line specifies the domain of the requested URL. That's helpful in case a host computer stores the content for multiple websites.

## Host Sends Back HTTP Response

Once the host computer receives the HTTP request, it sends back a response with both the content and metadata about it.

The HTTP response starts similarly to the request:

`HTTP/1.1 200 OK`


The response begins with the protocol and version, "HTTP/1.1".

The next number is the very important HTTP status code, and in this case, it's 200. That code represents a successful retrieval of the document ("OK").

These two headers are common to most requests:


`Content-Type: text/html; charset=UTF-8 Content-Length: 208`



# Using local SpringBoot Web App to test this using telnet


start a spring boot webserver and try accessing the endpoint using telnet 



#### This will start the telnet
```
telnet localhost 8080
```

#### This will establish a http connection

```
GET / HTTP/1.1
Host: localhost
Connection: close

```






