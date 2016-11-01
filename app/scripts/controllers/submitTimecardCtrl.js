'use strict';

/**
 * @ngdoc function
 * @name hrClientApp.controller:TimeCtrl
 * @description
 * # TimeCtrl
 * Controller of the hrClientApp
 */
angular.module('hrApp40App')
  .controller('SubmitTimecardCtrl', function ($http, $scope) {
      $scope.submit = function(){
        var userId = document.getElementById('userId');

        var time_in = document.getElementById('startTime');

        var time_out = document.getElementById('endTime');


        var timeCard = {
          "userId": userId.value,
          "time_in": time_in.value,
          "time_out": time_out.value
          };

      $http({
        method:'POST',
        url: 'http://localhost:8080/createTimecard',
        data: timeCard
      })
      .then(
        function(response){
          console.log(response.data);
        }

      );
      }


  });
