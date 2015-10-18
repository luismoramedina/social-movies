function UserController($scope, $http) {
    $scope.register = function() {
      var data=$scope.user;
      $http.post('http://localhost:8080/user', data);
    }
}