angular.module('ngdemoApp', [
  'ngdemoApp.services',
  'ngdemoApp.controllers',
  'ngRoute'
  ])
.config(function ($routeProvider, $httpProvider) {
	$routeProvider.when('/user-creation', {templateUrl: 'views/user-creation.html', controller: 'UserCreationCtrl'});
	$routeProvider.when('/iheb', {templateUrl: 'views/user-creation.html', controller: 'UserCreationCtrl'});
	$routeProvider.when('/user-list', {templateUrl: 'views/user-list.html', controller: 'UserListCtrl'});
	  $routeProvider.when('/user-detail/:id', {templateUrl: 'views/user-detail.html', controller: 'UserDetailCtrl'});
  $routeProvider.otherwise({redirectTo: '/iheb'});
});