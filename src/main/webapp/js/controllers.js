/* global angular */

var app = angular.module('WorkerAppControllers', []);

app.controller('WorkerListCtrl', ['$scope', 'WorkersFactory', 'WorkerFactory', '$location',
    function ($scope, WorkersFactory, WorkerFactory, $location) {

        $scope.editWorker = function (workerId) {
            $location.path('/worker-detail/' + workerId);
        };

        $scope.deleteWorker = function (workerId) {
            WorkerFactory.delete1({id: workerId});
            $scope.workers = WorkersFactory.query();
            $scope.workers = WorkersFactory.query();
            $location.path('/worker-list')
        };

        $scope.createNewWorker = function () {
            $location.path('/worker-creation');
        };

        $scope.workers = WorkersFactory.query();
    }]);

app.controller('WorkerDetailCtrl', ['$scope', '$routeParams', 'WorkerFactory', '$location',
    function ($scope, $routeParams, WorkerFactory, $location) {

        $scope.updateWorker = function () {
            WorkerFactory.update($scope.worker);
            $location.path('/worker-list');
        };

        $scope.cancel = function () {
            $location.path('/worker-list');
        };

        $scope.worker = WorkerFactory.show({id: $routeParams.id});
    }]);

app.controller('WorkersCreationCtrl', ['$scope', 'WorkersFactory', '$location',
    function ($scope, WorkersFactory, $location) {

        $scope.createNewWorker = function () {
            WorkersFactory.create($scope.worker);
            $location.path('/worker-list');
        }
    }]);
