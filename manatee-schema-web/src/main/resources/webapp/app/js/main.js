require.config({
    paths: {
        'domReady' : '../../bower_components/requirejs-domready/domReady',
        'angular' : '../../bower_components/angular/angular',
        'angularRoute' : '../../bower_components/angular-route/angular-route',
        'angularResource' : '../../bower_components/angular-resource/angular-resource',
    },

    shim : {
        'angular' : {
            exports : 'angular'
        },
        'angularRoute' :{
            deps:['angular']
        },
        'angularResource' : {
            deps : ['angular']
        }
    },

    deps : ['./bootstrap']
});