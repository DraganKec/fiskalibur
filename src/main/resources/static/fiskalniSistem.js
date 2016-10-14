angular.module('myApp', ['ngRoute'])

    .config(function ($routeProvider) {

        $routeProvider.when('/', {})
            .when('/addKomitent', {
                templateUrl: 'komitent/addkomitent.html',
                controller: 'addKomitentCtrl'
            })
            .when('/allKomitents', {
                templateUrl: 'komitent/allkomitents.html',
                controller: 'allKomitentsCtrl'
            })
            .when('/Komitent', {
                templateUrl: 'komitent/komitent.html',
                controller: 'komitentCtrl'
            })
            .otherwise({redirectTo: '/'});
    })
    .controller('addKomitentCtrl', ['$scope', '$http', function ($scope, $http) {

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
    }])
    .controller('allKomitentsCtrl', ['$scope', '$http', 'komService', function ($scope, $http, komService) {

        $scope.setKomitentId = function (id) {
            komService.set(id);
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
    }])
    .controller('komitentCtrl', ['$scope', '$http', 'komService', function ($scope, $http, komService) {

        var id = komService.get();

        $scope.getKomitent = function () {
            return $http({
                method: 'POST',
                url: '/getOneKomitent',
                data: id = komService.get()
            }).then(function (result) {
                $scope.komitent = result.data;
            }, function () {
                return {statusCode: 500};
            });
        };


    }])
    .factory('komService', function () {
        var komitentId;

        function set(id) {
            komitentId = id;
        }

        function get() {
            return komitentId;
        }

        return {
            set: set,
            get: get
        }
    });