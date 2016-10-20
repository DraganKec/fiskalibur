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
            .when('/allKasa', {
                templateUrl: 'kasa/allkasa.html',
                controller: 'allKasaCtrl'
            })
            .when('/addKasa', {
                templateUrl: 'kasa/addkasa.html',
                controller: 'addKasaCtrl'
            })
            .when('/Komitent/:id', {
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
    .controller('allKomitentsCtrl', ['$scope', '$http', function ($scope, $http) {

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
    .controller('allKasaCtrl', ['$scope', '$http', function ($scope, $http) {

        $http({
            method: "GET",
            url: "/getAllKasa"
        }).then(function mySucces(response) {
            $scope.allKasa = response.data;
        }, function myError(response) {
            $scope.allKasa = response.statusText;
        });
    }])
    .controller('addKasaCtrl', ['$scope', '$http', function ($scope, $http) {

        $scope.saveKasa = function (kasa) {
            return $http({
                method: 'POST',
                url: '/saveKasa',
                data: kasa
            }).then(function (result) {
                return result.data;
            }, function () {
                return {statusCode: 500};
            });
        };

        $http({
            method: "GET",
            url: "/getAllModels"
        }).then(function mySucces(response) {
            $scope.allModels = response.data;
        }, function myError(response) {
            $scope.allModels = response.statusText;
        });
    }])
    .controller('komitentCtrl', ['$scope', '$http', '$routeParams', function ($scope, $http, $routeParams) {

        var id = $routeParams.id;

        $http({
            method: 'POST',
            url: '/getOneKomitent',
            data: id
        }).then(function mySucces(response) {
            $scope.komitent = response.data;
        }, function myError(response) {
            $scope.komitent = response.statusText;
        });

    }]);