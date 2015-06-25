define(['./module'], function(controllers) {
    'use strict';

    controllers.controller( 'ManateeSchema.MenuCtrl', ['$scope', function($scope) {

        $scope.schemaMenu = [
        {
            label : 'Add Schema',
            href : '#/manatee-schema/add-schema'
        },
        {
            label : 'List Of Objects',
            href : ''
        },
        {
            label : 'Graphical Layout',
            href : ''
        }];

    }]);
});