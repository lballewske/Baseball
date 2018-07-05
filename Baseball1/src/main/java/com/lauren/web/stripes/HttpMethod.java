package com.lauren.web.stripes;

protected HttpMethod executeRequest(String url, RequestType requestType) throws IOException {
        HttpClientParams params = new HttpClientParams();
        params.setSoTimeout(DEFAULT_TIMEOUT);
        params.setConnectionManagerTimeout(DEFAULT_TIMEOUT);
        params.setParameter("http.connection.timeout", DEFAULT_TIMEOUT);
        HttpClient client = new HttpClient(params);

        String finalUrl = UriBuilder.fromUri(url).build().toString();
        HttpMethod method;
        switch (requestType) {
        case GET:
        method = new GetMethod(finalUrl);
        break;
        case POST:
        method = new PostMethod(finalUrl);
        break;
        case PUT:
        method = new PutMethod(finalUrl);
        break;
        case DELETE:
        method = new DeleteMethod(finalUrl);
        break;
default:
        throw new IllegalArgumentException("Invalid request type.");
        }

        client.executeMethod(method);
        return method;
        }