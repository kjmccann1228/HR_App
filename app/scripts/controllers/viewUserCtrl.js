'use strict';

/**
 * @ngdoc function
 * @name hrClientApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the hrClientApp
 */

angular.module('hrApp40App')
  .controller('ViewUserCtrl', ['$scope', '$http',
  function ($scope, $http){

    function successCallback(response)
    {
      console.log(response.data);
       $scope.responses = response.data._embedded.users;
     }

     function failCallback(response)
     {
       console.log("AAAAAAAAHHHHHHHHH!!!!!!");
       console.error(response.data);

      }

    $http.get("http://localhost:8080/hrusers/search/findByLastName?lastName=Momma")
    .then(successCallback, failCallback)
      }

      // $http.get("http://localhost:8080/hrusers/search/findByLastName?lastName=Red")



    ]);

    // .then(
    // function successCallback(response){
    //   console.log(response.data);
    //    $scope.responses = response.data._embedded.users;
