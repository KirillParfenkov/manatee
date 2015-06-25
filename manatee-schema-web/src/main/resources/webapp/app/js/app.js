define([
  'angular',
  'angularRoute',
  'angularResource',
  './controllers/index',
  './directives/index',
  './filters/index',
  './services/index'
], function(ng) {
  'use strict'

  return ng.module('ManateeWebApp', [
    'ngRoute',
    'app.services',
    'app.controllers',
    'app.filters',
    'app.directives'
  ]);
});

