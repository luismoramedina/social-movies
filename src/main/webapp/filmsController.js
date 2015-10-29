angular.module('socialMovies', []).controller('FilmsController', function($scope) {
       $scope.films = [
            {name: 'One', rating: '10'},
            {name: 'Two', rating: '9'}
        ];
});