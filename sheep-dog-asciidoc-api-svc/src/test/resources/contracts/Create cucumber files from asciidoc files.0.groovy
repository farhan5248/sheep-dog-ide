org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/sheep-dog-asciidoc-api-svc/actuator/health'
    }
    response {
        status 200
        body(file('bodies/Create cucumber files from asciidoc files.0.rsp.json'))
    }
}
