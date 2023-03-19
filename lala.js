// create a node.js server which listen on 8080 port
var http = require('http');
var server = http.createServer(function(req, res) {
    res.writeHead(200);
    res.end('hello world');
    }
);