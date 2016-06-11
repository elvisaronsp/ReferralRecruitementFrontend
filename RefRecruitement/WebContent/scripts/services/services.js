var services = angular.module('ngdemoApp.services', ['ngResource']);

var baseUrl = 'http://jsonplaceholder.typicode.com';


services.factory('UsersFactory', function ($resource) {
	return $resource(baseUrl + '/users', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    });
});

services.factory('UserFactory', function ($resource) {
    return $resource(baseUrl + '/users/:id', {}, {
        show: { method: 'GET' },
        update: { method: 'PUT', params: {id: '@id'} },
        remove: { method: 'DELETE', params: {id: '@id'} }
    });
});

