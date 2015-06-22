'use strict';

/* App Module */

var manateeCore = angular.module('manateeCore', [
  'ngRoute',
  //'phonecatAnimations',

  'manateeControllers',
  //'phonecatFilters',
  //'phonecatServices'
]);

manateeCore.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/manatee-schema', {
        templateUrl: 'partials/menu.html',
        controller: 'ManateeSchemaMenuCtr'
      }).
      when('/manatee-schema/add-schema', {
        templateUrl: 'partials/add-schema.html',
        controller: 'ManateeAddSchemaCtr'
      });
  }]);
