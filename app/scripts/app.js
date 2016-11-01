'use strict';

/**
 * @ngdoc overview
 * @name hrApp40App
 * @description
 * # hrApp40App
 *
 * Main module of the application.
 */
angular
  .module('hrApp40App', [
    'ngAnimate',
    'ngAria',
    'ngCookies',
    'ngMessages',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/submitTimecard', {
        templateUrl: '/views/submitTimecard.html',
        controller: 'SubmitTimecardCtrl',
        controllerAs: 'submitTimecardCtrl'
      })
      .when('/calculatePay', {
        templateUrl: '/views/calculatePay.html',
        controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .when('/createNewUser', {
        templateUrl: '/views/createNewUser.html',
        controller: 'CreateNewUserCtrl',
        controllerAs: 'createNewUserCtrl'
      })
      .when('/viewUser', {
        templateUrl: '/views/viewUser.html',
        controller: 'ViewUserCtrl',
        controllerAs: 'viewUserCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
