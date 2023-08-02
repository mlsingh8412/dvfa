# dvfa - Damn Vulnerable Flutter App

A intentionally insecure Flutter app.

This application contains a variety of security vulnerabilities:

- outdated or insecure dependencies
- WIP: user input is not validated and will trigger various issues like path traversal (Flutter/Dart)
- WIP: native components are written without sanitisation or validation either