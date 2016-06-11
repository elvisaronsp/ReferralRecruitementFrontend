var var_app_ctrl = angular.module('RRApp.controllers', []);

var_app_ctrl.controller('LoginCtrl', [ '$scope', '$location',
		function($scope, $location) {
			$scope.checkCredentials = function() {
				$location.path('/app');
			};
		} ]);

var_app_ctrl.controller('AppCtrl', [ '$scope', '$location',
		function($scope, $location) {
			$scope.checkCredentials = function() {
				$location.path('/app');
			};
		} ]);