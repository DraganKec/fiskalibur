/**
 * Created by Dragan on 01/10/16.
 */
angular.module('myApp')

    .controller('fghfgh', ['$scope', '$http', function ($scope, $http) {

        $scope.saveKom = function () {
            return $http({
                method: 'POST',
                url: '/saveKomitent',
                data: $scope.komitent
            }).then(function (result) {
                return result.data;
            }, function () {
                return {statusCode: 500};
            });
        };
    }]);