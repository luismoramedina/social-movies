angular.module('socialMovies', [])
    .controller('FilmsController', function($scope, $http) {
        $http({
            method: 'GET',
            url: '/luismoramedina/films',
            contentType: "application/json"}).then(
                function successCallback(response) {
                    $scope.films = response.data;
                }, function errorCallback(response) {
                    alert("error");
                });;
    });