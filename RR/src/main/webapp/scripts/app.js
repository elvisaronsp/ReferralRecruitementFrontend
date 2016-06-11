angular.module('MainApp', [
                           'MainApp.services',
                           'MainApp.controllers',
                           'ngRoute'
                           ]).config(
		function($routeProvider, $httpProvider) {
			$routeProvider.when('/login', {
				templateUrl : 'views/default.html',
				controller : 'LoginCtrl'
			});
			$routeProvider.when('/error', {
				templateUrl : 'views/error.html',
				controller : 'LoginCtrl'
			});
			$routeProvider.when('/app', {
				templateUrl : '/app.html',
				controller : 'AppCtrl'
			});
			$routeProvider.otherwise({
				redirectTo : '/login'
			});
		});
