export default {
  oidc: {
    clientId: 'get it from dev app',
    issuer: 'get it from dev app',
    redirectUri: 'callback url in the dev account you are using',
    scopes: ['openid', 'profile', 'email'],
    // scopes provide information about a user
    // openid: required for authenticationrequests,
    // profile: user's first name, last name, phone, etc
    // email: user's email address

    // if you using okta -> then install it's dependencies
    // npm install @okta/okta-signin-widget
    // npm install @okta/okta-angular

    // to verify check okta folder got created in node_modules

    // for styling, add css file from the okta folder the styles attribute in angular.json
  },
};
