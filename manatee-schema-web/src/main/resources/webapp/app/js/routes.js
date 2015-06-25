define(['./app'], function(app){
    'use strict';

    return app.config(['$routeProvider', function($routeProvider){

       $routeProvider.when('/manatee-schema', {
            templateUrl : 'partials/menu.html',
            controller : 'ManateeSchema.MenuCtrl'
       });

       $routeProvider.when('/manatee-schema/add-schema', {
            templateUrl : 'partials/add-schema.html',
            controller : 'ManateeSchema.AddSchemaCtrl'
       });

    }]);
});
