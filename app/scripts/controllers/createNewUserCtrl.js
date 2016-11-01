'use strict';

/**
 * @ngdoc function
 * @name hrClientApp.controller:TimeCtrl
 * @description
 * # TimeCtrl
 * Controller of the hrClientApp
 */
angular.module('hrApp40App')
  .controller('CreateNewUserCtrl', function ($http, $scope) {
      $scope.submit = function(){


        var firstName = document.getElementById('firstName');

        var lastName = document.getElementById('lastName');


        var user = {
            "firstName": firstName.value,
            "lastName": lastName.value,
            "payRate": 10.0
        };

      $http({
        method:'POST',
        url: 'http://localhost:8080/createUser',
        data: user
      })
      .then(
        function(response){
          console.log(response.data);
        }
      );
      }


  });
