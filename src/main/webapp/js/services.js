/* global angular */
'use strict';

var services = angular.module('WorkerAppServices', ['ngResource']);

services.factory('WorkersFactory', function ($resource) {
    return $resource('/Angular/rest/worker', {}, {
        query: { method: 'GET', isArray: true },
        create: { method: 'POST' }
    });
});

services.factory('WorkerFactory', function ($resource) {
    return $resource('/Angular/rest/worker/:id', {}, {
        show: { method: 'GET' },
        update: { method: 'PUT', params: {id: '@id'} },
        delete1: { method: 'DELETE', params: {id: '@id'} }
    });
});


