/* global angular */

'use strict';

var WorkerApp = angular.module('WorkerApp', [
    'ngRoute',
    'WorkerAppServices',
    'WorkerAppControllers'
]);


BookApp.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.
                when('/worker-list', {
                    templateUrl: 'html/worker-list.html',
                    controller: 'WorkerListCtrl'
                }).
                when('/worker-detail/:id', {
                    templateUrl: 'html/worker-detail.html', 
                    controller: 'WorkerDetailCtrl'
                }).
                when('/worker-creation', {
                    templateUrl: 'html/worker-creation.html', 
                    controller: 'WorkersCreationCtrl'
                }).
                otherwise({
                    redirectTo: '/'
                });
    }]);

