angular.module('myApp', ['ngRoute'])

    .config(function ($routeProvider) {

        $routeProvider.when('/', {})
            .when('/addKomitent', {
                templateUrl: 'komitent/addkomitent.html',
                controller: 'komCtrl'
            })
            .when('/allKomitents', {
                templateUrl: 'komitent/allkomitents.html',
                controller: 'komCtrl'
            })
            .when('/oneKomitent', {
                templateUrl: 'komitent/komitent.html',
                controller: 'komCtrl'
            })
            .otherwise({redirectTo: '/'});
    })
    .controller('komCtrl', ['$scope', '$http', function ($scope, $http) {

        $scope.saveKomitent = function (komitent) {
            return $http({
                method: 'POST',
                url: '/saveKomitent',
                data: komitent
            }).then(function (result) {
                return result.data;
            }, function () {
                return {statusCode: 500};
            });
        };

        $http({
            method: "GET",
            url: "/getAllKomitents"
        }).then(function mySucces(response) {
            $scope.allKomitent = response.data;
        }, function myError(response) {
            $scope.allKomitent = response.statusText;
        });

        $scope.deleteKomitent = function (id) {
            return $http({
                method: 'POST',
                url: '/deleteKomitent',
                data: id
            }).then(function (result) {
                return result.data;
            }, function () {
                return {statusCode: 500};
            });
        };

        $scope.getOneKomitent = function (id) {
            return $http({
                method: 'POST',
                url: '/getOneKomitent',
                data: id
            }).then(function (result) {
                $scope.oneKomitent = result.data;
            }, function () {
                return {statusCode: 500};
            });
        };

        $scope.person = [
            {id: 0, firstName: "John", lastName: "Doe"},
            {id: 1, firstName: "Anna", lastName: "Smith"},
            {id: 2, firstName: "Peter", lastName: "Jones"}
        ];
    }]);