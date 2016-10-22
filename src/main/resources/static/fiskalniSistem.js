angular.module('myApp', ['ngRoute'])

    .config(function ($routeProvider) {

        $routeProvider.when('/', {})
            .when('/addKomitent', {
                templateUrl: 'komitent/addkomitent.html',
                controller: 'addKomitentCtrl'
            })
            .when('/allKasa', {
                templateUrl: 'kasa/allkasa.html',
                controller: 'allKasaCtrl'
            })
            .when('/addKasa', {
                templateUrl: 'kasa/addkasa.html',
                controller: 'addKasaCtrl'
            })
            .when('/kasa/:id', {
                templateUrl: 'kasa/kasa.html',
                controller: 'kasaCtrl'
            })
            .when('/allKomitents', {
                templateUrl: 'komitent/allkomitents.html',
                controller: 'allKomitentsCtrl'
            })
            .when('/Komitent/:id', {
                templateUrl: 'komitent/komitent.html',
                controller: 'komitentCtrl'
            })
            .when('/addModel/:id', {
                templateUrl: 'model/addmodel.html',
                controller: 'addModelCtrl'
            })
            .when('/allModel', {
                templateUrl: 'model/allmodel.html',
                controller: 'allModelCtrl'
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
        }).then(function (response) {
            $scope.allKomitent = response.data;
        }, function (response) {
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
        }).then(function (response) {
            $scope.allKasa = response.data;
        }, function (response) {
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
        }).then(function (response) {
            $scope.allModels = response.data;
        }, function (response) {
            $scope.allModels = response.statusText;
        });
    }])
    .controller('kasaCtrl', ['$scope', '$http', '$routeParams', function ($scope, $http, $routeParams) {

        var id = $routeParams.id;

        $http({
            method: 'POST',
            url: '/getKasa',
            data: id
        }).then(function (response) {
            $scope.kasa = response.data;
        }, function (response) {
            $scope.kasa = response.statusText;
        });

    }])
    .controller('komitentCtrl', ['$scope', '$http', '$routeParams', function ($scope, $http, $routeParams) {

        var id = $routeParams.id;

        $http({
            method: 'POST',
            url: '/getOneKomitent',
            data: id
        }).then(function (response) {
            $scope.komitent = response.data;
        }, function (response) {
            $scope.komitent = response.statusText;
        });

    }])
    .controller('addModelCtrl', ['$scope', '$http', '$routeParams', function ($scope, $http, $routeParams) {

        var id = $routeParams.id;

        if (id !== 'undefine') {

            $http({
                method: 'POST',
                url: '/getModel',
                data: id
            }).then(function (response) {
                $scope.model = response.data;
            }, function (response) {
                $scope.model = response.statusText;
            });
        }

        $scope.saveModel = function (model) {
            return $http({
                method: 'POST',
                url: '/saveModel',
                data: model
            }).then(function (result) {
                return result.data;
            }, function () {
                return {statusCode: 500};
            });
        };
    }])
    .controller('allModelCtrl', ['$scope', '$http', function ($scope, $http) {

        $http({
            method: "GET",
            url: "/getAllModels"
        }).then(function (response) {
            $scope.allModels = response.data;
        }, function (response) {
            $scope.allModels = response.statusText;
        });
    }]);