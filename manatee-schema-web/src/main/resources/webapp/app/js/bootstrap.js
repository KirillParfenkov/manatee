 /**
  * bootstraps angular onto the window.document node
  */

define([
    'require',
    'angular',
    'angularRoute',
    'angularResource',
    'app',
    'routes'
], function(require, ng) {
    'use strict';

    require(['domReady!'], function() {
        ng.bootstrap(document, ['ManateeWebApp']);
    });
});
